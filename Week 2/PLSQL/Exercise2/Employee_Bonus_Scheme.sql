CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_dept_id IN NUMBER,
  p_bonus_pct IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_bonus_pct)
  WHERE DepartmentID = p_dept_id;

  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
