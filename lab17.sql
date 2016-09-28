-- #1 Select all rows from Customers table
SELECT * FROM northwind.customers;
-- #2
SELECT DISTINCT country_region from northwind.customers;
-- #3
SELECT * FROM northwind.customers WHERE last_name LIKE 'bi';
-- #4
SELECT * FROM northwind.orders LIMIT 100;
-- #5
SELECT * FROM northwind.customers WHERE zip_postal_code in ('1010', '3012', '12209', '05023');
-- #6
SELECT * FROM northwind.orders WHERE ship_country_region IS NOT NULL;
-- #7
SELECT * FROM northwind.customers ORDER BY country_region, city;
-- #8
INSERT INTO northwind.customers (id, last_name, first_name, job_title, address, city, state_province, country_region)
VALUES ('30', 'Appleseed', 'Johnny', 'Accounting Manager', '789 30th Street', 'Detroit', 'MI', 'USA');
-- #9
UPDATE Orders SET 
Ship_zip__postal_code = '97201'
WHERE ship_city = 'Portland';

-- #10
DELETE FROM order_details
WHERE Quantity = 1;

-- #11
SELECT AVG(quantity), MIN(quantity), MAX(quantity) FROM order_details;

-- #12
SELECT AVG(quantity), MIN(quantity), MAX(quantity)
FROM order_details
GROUP BY order_id;

-- #13
SELECT CustomerID FROM Orders WHERE ID = 65;

-- #14
SELECT * FROM Orders INNER JOIN Customers ON Orders.Customer_ID = Customer.ID;
SELECT * FROM Orders LEFT JOIN Customers ON Orders.Customer_ID = Customer.ID;
SELECT * FROM Orders RIGHT JOIN Customers ON Orders.Customer_ID = Customer.ID;

-- #15
SELECT Employees.first_name FROM Employees WHERE Employees.notes IS NULL;

-- #16
SELECT Ship_city FROM Orders o INNER JOIN Customer c ON o.customer_id = c.id
WHERE first_name = 'Francisco';