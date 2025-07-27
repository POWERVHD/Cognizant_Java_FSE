DECLARE
  CURSOR loan_cursor IS
    SELECT l.LoanID, l.CustomerID, c.Name, l.DueDate
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
  FOR loan IN loan_cursor LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan.LoanID ||
                         ' for customer ' || loan.Name ||
                         ' is due on ' || TO_CHAR(loan.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/
