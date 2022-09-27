CREATE TABLE passengers
(
passenger_id NUMBER(3,0),
survived NUMBER(1,0),
pclass NUMBER(1,0),
name VARCHAR2(100 CHAR),
gender VARCHAR2(6 CHAR),
age NUMBER(3,0),
sibsp NUMBER(2,0),
parch NUMBER(2,0),
ticket VARCHAR2(30 CHAR),
fare NUMBER(10,5),
cabin VARCHAR2(20 CHAR),
embarked VARCHAR2(1 CHAR),
PRIMARY KEY(passenger_id
)
)

SELECT count(*) FROM passengers;

SELECT MIN(fare)
FROM passengers
WHERE age = 35;

with min_fare_table as(
SELECT MIN(fare) as min_fare
FROM passengers
WHERE age = 35
)

select fare, name
from passengers, min_fare_table
where fare = min_fare and age = 35;

SELECT COUNT(*), pclass
FROM passengers
GROUP BY pclass;

SELECT COUNT(*), survived
FROM passengers
GROUP BY survived;

SELECT MAX(fare), pclass
FROM passengers
GROUP BY pclass;

select round(sum(survived)/ count(survived), 2) as 생존률, trunc(age, -1) as 나이대
from passengers
where age is not null
group by trunc(age, -1) /*"as" group by 에서는 못씀*/
order by "나이대";

select round(sum(survived)/ count(survived), 2) as 생존률, trunc(age, -1) as 나이대, count(survived) as 인원수
from passengers
where age is not null
group by trunc(age, -1) /*"as" group by 에서는 못씀*/
order by "나이대";

SELECT COUNT(*) AS 인원수, pclass AS 티켓클래스
FROM passengers
GROUP BY pclass
HAVING pclass = 1;

SELECT COUNT(*) AS 인원수, REPLACE(survived, 1, '생존') AS 생존여부
FROM passengers
GROUP BY survived
HAVING survived = 1;

select pclass as 티켓클래스, trunc(age, -1) as 나이대,
count(*) as 인원수, round(sum(survived)/ count(survived), 2) as 생존률
from passengers
where age is not null
group by pclass, trunc(age, -1)
having trunc(age, -1) between 10 and 40
order by pclass asc, "나이대" desc;

CREATE TABLE passengers_1st
AS SELECT * FROM passengers WHERE pclass = 1;

CREATE TABLE passengers_2nd
AS SELECT * FROM passengers WHERE pclass = 2;

SELECT *
FROM passengers_1st
UNION
SELECT *
FROM passengers_2nd;

select *
from passengers_1st
union
select *
from passengers
where pclass = 3;

/* 집합 */
SELECT * FROM passengers
WHERE fare BETWEEN 70 AND 75
UNION
SELECT * FROM passengers
WHERE fare BETWEEN 73 AND 78;

SELECT * FROM passengers
WHERE fare BETWEEN 70 AND 75
UNION ALL
SELECT * FROM passengers
WHERE fare BETWEEN 73 AND 78;

SELECT age FROM passengers_1st
WHERE sibsp = 0 and parch = 0
UNION ALL
SELECT age FROM passengers_2nd
WHERE sibsp > 0 or parch > 0;

SELECT * FROM passengers WHERE age < 30
INTERSECT
SELECT *
FROM passengers WHERE pclass = 3;

SELECT * FROM passengers WHERE age < 30
INTERSECT
SELECT *
FROM passengers WHERE survived = 1;

SELECT * FROM passengers
MINUS
SELECT * FROM passengers
WHERE sibsp = 0 AND parch = 0;

select * from passengers_2nd
minus
select * from passengers_2nd
where embarked = 'Q';

/* 트랜잭션 */
drop table bank_account;

CREATE TABLE bank_account( name VARCHAR2(3 CHAR), balance NUMBER(5),
PRIMARY KEY(name) );

insert into bank_account values('A', 1000);
insert into bank_account values('B', 1000);
insert into bank_account values('C', 1000);

SET AUTOCOMMIT OFF;
show autocommit;

UPDATE bank_account SET balance = balance + 100 WHERE name = 'B';
UPDATE bank_account SET balance = balance - 100 WHERE name = 'A';
COMMIT;

select * from bank_account;

UPDATE bank_account SET balance = balance + 100 WHERE name = 'B';
UPDATE bank_account SET balance = balance - 100 WHERE name = 'C';
COMMIT;

select * from bank_account;

/* 트랜잭션 4대 특성 (ACID)
일관성(Consistency)
원자성(Atomicity)
고립성(Isolation)
지속성(Durability)*/

UPDATE bank_account SET balance = balance - 100 WHERE name = 'A';
UPDATE bank_account SET balance = balance + 100 WHERE name = 'B';
COMMIT;

select * from bank_account;
