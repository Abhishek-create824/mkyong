DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
    CUST_ID SERIAL PRIMARY KEY,
    NAME varchar(100) NOT NULL,
    AGE INT4 NOT NULL
);

--INSERT INTO customer (CUST_ID,NAME,AGE) VALUES (1,'mkyong1',28), (2,'mkyong2',28), (3,'mkyong3',28);

DELETE FROM customer;
SELECT * FROM customer;
