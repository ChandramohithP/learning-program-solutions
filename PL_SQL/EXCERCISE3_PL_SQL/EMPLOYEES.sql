CREATE TABLE employees (
   emp_id NUMBER PRIMARY KEY,
   name VARCHAR2(50),
   department_id NUMBER,
   salary NUMBER
);
INSERT INTO employees VALUES (1, 'Alice', 10, 30000);
INSERT INTO employees VALUES (2, 'Bob', 20, 35000);
INSERT INTO employees VALUES (3, 'Carol', 10, 40000);
INSERT INTO employees VALUES (4, 'David', 30, 28000);
SELECT * FROM employees;
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(p_dept_id NUMBER, p_bonus_percent NUMBER) AS
BEGIN
   UPDATE employees
   SET salary = salary + (salary * p_bonus_percent / 100)
   WHERE department_id = p_dept_id;

   DBMS_OUTPUT.PUT_LINE('Bonus Applied to Department ID: ' || p_dept_id);
END;
BEGIN
   UpdateEmployeeBonus(10, 5);  
END;