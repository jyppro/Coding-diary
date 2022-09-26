CREATE TABLE emp (
  id    NUMBER(5),
  name  VARCHAR(10),
  dept  NUMBER(3),
  pid   CHAR(14),
  birth DATE,
  age   NUMBER(3),
  PRIMARY KEY(id)
);
drop table emp;

INSERT INTO emp VALUES (21001, '�赿��', '01', '990125-1293728', '99/01/25', 24);
INSERT INTO emp VALUES (21002, '���̷�', '02', '030312-2199384', '03/03/12', 20);
INSERT INTO emp VALUES (21003, '�ڱ���', '03','011011-1928583', '01/10/11', 22);
INSERT INTO emp VALUES (21004, 'ȫ�浿', '04','021111-1949472', '02/11/11', 21 );

CREATE INDEX emp_name_idx ON
emp(name);

SELECT * FROM emp WHERE name = '�赿��';

create unique index dept_idx ON emp(dept);

drop table emp;

CREATE TABLE emp (
  empid    NUMBER(5),
  ename  VARCHAR(10),
  dept  VARCHAR(10),
  hire_date DATE,
  birthday DATE,
  address varchar2(24),
  job varchar2(18),
  salary NUMBER(4),
  PRIMARY KEY(empid)
);

INSERT INTO emp VALUES (1001, '�赿��', '������', '2021-02-01', '1985-10-12', '���� �븲��', 'Ư������', 350);
INSERT INTO emp VALUES (1002, '���̷�', '������', '1999-01-01', '1984-09-10', '�Ⱦ� �����', '��������', 400);
INSERT INTO emp VALUES (1003, '�ڱ���', '�����', '2010-09-01', '1986-05-16', '�λ� ���ϵ�', 'ǰ������', 300);
INSERT INTO emp VALUES (1004, '�̴���', '�λ��', '1997-02-01', '1985-10-12', '�뱸 �޼���', '�޿�', 450);
INSERT INTO emp VALUES (1005, 'ȫ�浿', '���ź�', '2000-02-01', '1986-12-04', '���� �ݳ���', '��������', 320);

CREATE OR REPLACE VIEW emp_hr_view
AS SELECT empid, ename, hire_date, salary   /*�� ����*/
FROM emp;

SELECT *
FROM emp_hr_view;   

CREATE VIEW emp_wf_view
as SELECT empid, ename, birthday, address
from emp;

CREATE VIEW emp_plan_view
AS SELECT empid, ename, dept, job
FROM emp;

CREATE OR REPLACE VIEW high_salary
AS SELECT *
FroM emp
WHERE salary >= 350;

SELECT empid, ename, salsry
FROM high_salary
WHERE dept = '������';

/*  �� �� ���谡 �ִ� �� ���̺��� ����� */

CREATE TABLE dept (
    dept_code NUMBER(2),
    dname VARCHAR2(10),
    dnum NUMBER(3),
    primary key(dept_code)
);

INSERT INTO dept VALUES (1, '������', 23);
INSERT INTO dept VALUES (2, '�����', 58);
INSERT INTO dept VALUES (3, '�λ��', 10);
INSERT INTO dept VALUES (4, '���ź�', 5 );

CREATE TABLE emp_2 (
  empid    NUMBER(5),
  ename  VARCHAR(10),
  dept  number(2),
  hire_date DATE,
  birthday DATE,
  address varchar2(24),
  job varchar2(18),
  salary NUMBER(4),
  PRIMARY KEY(empid),
  FOREIGN KEY(dept) 
   REFERENCES dept(dept_code)
);

INSERT INTO emp_2 VALUES (2001, '�赿��', 1, '2021-02-01', '1985-10-12', '���� �븲��', 'Ư������', 350);
INSERT INTO emp_2 VALUES (2002, '���̷�', 1, '1999-01-01', '1984-09-10', '�Ⱦ� �����', '��������', 400);
INSERT INTO emp_2 VALUES (2003, '�ڱ���', 2, '2010-09-01', '1986-05-16', '�λ� ���ϵ�', 'ǰ������', 300);
INSERT INTO emp_2 VALUES (2004, '�̴���', 3, '1997-02-01', '1985-10-12', '�뱸 �޼���', '�޿�', 450);
INSERT INTO emp_2 VALUES (2005, 'ȫ�浿', 4, '2000-02-01', '1986-12-04', '���� �ݳ���', '��������', 320);

create view de_view
as select emp_2.empid, emp_2.ename, dept.dname, emp_2.hire_date, emp_2.salary
from emp_2 join dept ON emp_2.dept = dept.dept_code;  /*join �� ����� �ߺ����� ���ϴ°͸� ���� �� �ִ�.*/

SELECT *
FROM de_view;

INSERT INTO de_view VALUES(2006);

DELETE de_view
WHERE empid = 2005;

SELECT *
FROM emp_2;
   /*����ȭ�� ���̺��� �� �׳� emp���̺�� �� ���� insert �غ���*/
CREATE VIEW emp_plan_view                       
as select empid, ename, dept, job 
from emp;

select *
from emp_plan_view;

INSERT INTO emp_plan_view VALUES(1006,'������','������','��������');

SELECT *
FROM emp;

CREATE TABLE passengers
(
    passenger_id    NUMBER(3,0),
    survived        NUMBER(1,0),
    pclass          NUMBER(1,0),
    name            VARCHAR2(100 CHAR),
    gender          VARCHAR2(6 CHAR),
    age             NUMBER(3,0),
    sibsp           NUMBER(2,0),
    parch           NUMBER(2,0),
    ticket          VARCHAR2(30 CHAR),
    fare            NUMBER(10,5),
    cabin           VARCHAR2(20 CHAR),
    embarked        VARCHAR2(1 CHAR),
    PRIMARY KEY(passenger_id)
);

SELECT count(*)
FROM passengers;
/*count�� �����Ҷ� Ư�� �÷������� null�� ��ŵ�Ѵ�.*/
SELECT count(passenger_id) FROM passengers;
SELECT count(age) FROM passengers;
SELECT count(*) FROM passengers 
WHERE age<20;

SELECT count(*) FROM passengers 
WHERE age is null;

SELECT count(*) FROM passengers
WHERE pclass = 1 and sibsp = 0 and parch = 0;

SELECT count(distinct embarked) FROM passengers;
/*������ �̸��� ���� ����� ã�� ������*/
WITH distinct_name AS (SELECT count(distinct
name) AS dnames FROM passengers),
normal_name AS (SELECT count(name) AS
names FROM passengers)
SELECT CASE WHEN names = dnames THEN 'nonexists' ELSE 'exists' END
FROM distinct_name, normal_name;

SELECT SUM(fare)
from passengers
WHERE embarked = 'S' and gender = 'male';

SELECT TRUNC(AVG(age),1)
FROM passengers
WHERE embarked = 'S' AND gender = 'female';

SELECT max(age)
FROM passengers;

SELECT MIN(fare)
FROM passengers
WHERE age = 35;

WITH max_age as (select max(age)from passengers), name as (select max(age) from passengers)
select age, name
FROM passengers;
/*�°��� ���� ���̰� ���� ����� �̸��� ���̴�?*/

with max_age_table as (select max(age) as max_age
from passengers)
select name, age
from passengers JOIN max_age_table ON age = max_age;

/*������ ����� �� �� �ִ�.*/
SELECT name,age
FROM passengers
WHERE age = (SELECT MAX(age) FROM passengers);

