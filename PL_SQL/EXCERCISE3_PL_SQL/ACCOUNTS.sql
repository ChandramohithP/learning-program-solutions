CREATE TABLE accounts (
   account_id NUMBER PRIMARY KEY,
   customer_id NUMBER,
   account_type VARCHAR2(20),
   balance NUMBER
);
INSERT INTO accounts VALUES (1, 101, 'SAVINGS', 5000);
INSERT INTO accounts VALUES (2, 102, 'CURRENT', 8000);
INSERT INTO accounts VALUES (3, 103, 'SAVINGS', 15000);
INSERT INTO accounts VALUES (4, 104, 'SAVINGS', 7000);
SELECT * FROM accounts;
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
   FOR acc_rec IN (SELECT account_id, balance FROM accounts WHERE account_type = 'SAVINGS') LOOP
      UPDATE accounts
      SET balance = balance + (balance * 0.01)
      WHERE account_id = acc_rec.account_id;

      DBMS_OUTPUT.PUT_LINE('Interest Applied to Account ID: ' || acc_rec.account_id);
   END LOOP;
END;
BEGIN
   ProcessMonthlyInterest;
END;
  -- TRANSACTION BELOW

CREATE OR REPLACE PROCEDURE TransferFunds(p_from NUMBER, p_to NUMBER, p_amount NUMBER) AS
   insufficient_balance EXCEPTION;
   source_balance NUMBER;
BEGIN
   SELECT balance INTO source_balance FROM accounts WHERE account_id = p_from;
   IF source_balance < p_amount THEN
      RAISE insufficient_balance;
   END IF;
   UPDATE accounts SET balance = balance - p_amount WHERE account_id = p_from;
   UPDATE accounts SET balance = balance + p_amount WHERE account_id = p_to;
   DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' || p_from || ' to Account ' || p_to);
EXCEPTION
   WHEN insufficient_balance THEN
      DBMS_OUTPUT.PUT_LINE('Transfer Failed: Insufficient Balance');
   WHEN NO_DATA_FOUND THEN
      DBMS_OUTPUT.PUT_LINE('Account not found');
END;
BEGIN
   TransferFunds(1, 2, 1000);  
END;
SELECT * FROM accounts;