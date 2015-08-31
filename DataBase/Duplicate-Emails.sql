# Write your MySQL query statement below
Select Email
From Person
GROUP BY Email
Having count(Email)>1