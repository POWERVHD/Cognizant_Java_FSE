DECLARE
  CURSOR cust_cursor IS
    SELECT c.CustomerID
    FROM Customers c
    WHERE c.Age > 60;

BEGIN
  FOR cust IN cust_cursor LOOP
    -- Reduce interest rate by 1% for loans of this customer
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE CustomerID = cust.CustomerID;
  END LOOP;

  COMMIT;
END;
/
