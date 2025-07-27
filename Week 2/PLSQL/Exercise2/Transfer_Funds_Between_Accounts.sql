CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_account IN NUMBER,
  p_to_account   IN NUMBER,
  p_amount       IN NUMBER
) AS
  v_balance NUMBER;
BEGIN
  -- Checking if source account has enough balance
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_from_account
  FOR UPDATE;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance.');
  END IF;

  -- Deducting funds from source
  UPDATE Accounts
  SET Balance = Balance - p_amount
  WHERE AccountID = p_from_account;

  -- Adding to destination
  UPDATE Accounts
  SET Balance = Balance + p_amount
  WHERE AccountID = p_to_account;

  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer Failed: ' || SQLERRM);
END;
/
