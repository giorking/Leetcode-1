# Write your MySQL query statement below
SELECT max(Salary) FROM Employee WHERE Salary < (SELECT max(Salary) FROM Employee);