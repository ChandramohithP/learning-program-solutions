CREATE TABLE loans (
   loan_id NUMBER PRIMARY KEY,
   customer_id NUMBER REFERENCES customers(customer_id),
   due_date DATE,
   interest_rate NUMBER
);
INSERT INTO loans VALUES (101, 1, TO_DATE('25-JUL-2025', 'DD-MON-YYYY'), 8.5);
INSERT INTO loans VALUES (102, 2, TO_DATE('10-JUL-2025', 'DD-MON-YYYY'), 9.0);
INSERT INTO loans VALUES (103, 1, TO_DATE('05-AUG-2025', 'DD-MON-YYYY'), 7.5);
INSERT INTO loans VALUES (104, 3, TO_DATE('20-JUL-2025', 'DD-MON-YYYY'), 8.2);
SELECT * FROM loans;
SET SERVEROUTPUT ON;
BEGIN
   FOR loan_rec IN (
      SELECT loan_id, customer_id, due_date
      FROM loans
      WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
   ) LOOP
      DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.loan_id || ' for Customer ID ' || loan_rec.customer_id || ' is due on ' || loan_rec.due_date);
   END LOOP;
END;