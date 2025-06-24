CREATE TABLE customers (
   customer_id NUMBER PRIMARY KEY,
   name VARCHAR2(50),
   age NUMBER,
   balance NUMBER,
   IsVIP CHAR(1) DEFAULT 'N'
);

INSERT INTO customers VALUES (1, 'John', 65, 15000, 'N');
INSERT INTO customers VALUES (2, 'Mary', 45, 8000, 'N');
INSERT INTO customers VALUES (3, 'Steve', 70, 20000, 'N');
SELECT * FROM customers;
SET SERVEROUTPUT ON;
BEGIN
   FOR cust_rec IN (SELECT customer_id, age FROM customers) LOOP
      IF cust_rec.age > 60 THEN
         UPDATE loans
         SET interest_rate = interest_rate - 1
         WHERE customer_id = cust_rec.customer_id;

         DBMS_OUTPUT.PUT_LINE('Interest Discount Applied for Customer ID: ' || cust_rec.customer_id);
      END IF;
   END LOOP;
END;
BEGIN
   FOR vip_rec IN (SELECT customer_id, balance FROM customers) LOOP
      IF vip_rec.balance > 10000 THEN
         UPDATE customers
         SET IsVIP = 'Y'
         WHERE customer_id = vip_rec.customer_id;

         DBMS_OUTPUT.PUT_LINE('VIP Status Given to Customer ID: ' || vip_rec.customer_id);
      END IF;
   END LOOP;
END;