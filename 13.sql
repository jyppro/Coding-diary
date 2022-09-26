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

INSERT INTO emp VALUES (21001, '김동양', '01', '990125-1293728', '99/01/25', 24);
INSERT INTO emp VALUES (21002, '윤미래', '02', '030312-2199384', '03/03/12', 20);
INSERT INTO emp VALUES (21003, '박구로', '03','011011-1928583', '01/10/11', 22);
INSERT INTO emp VALUES (21004, '홍길동', '04','021111-1949472', '02/11/11', 21 );

CREATE INDEX emp_name_idx ON
emp(name);

SELECT * FROM emp WHERE name = '김동양';

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

INSERT INTO emp VALUES (1001, '김동양', '영업부', '2021-02-01', '1985-10-12', '서울 대림동', '특수영업', 350);
INSERT INTO emp VALUES (1002, '윤미래', '영업부', '1999-01-01', '1984-09-10', '안양 용봉동', '영업관리', 400);
INSERT INTO emp VALUES (1003, '박구로', '생산부', '2010-09-01', '1986-05-16', '부산 대하동', '품질관리', 300);
INSERT INTO emp VALUES (1004, '이대학', '인사부', '1997-02-01', '1985-10-12', '대구 달성동', '급여', 450);
INSERT INTO emp VALUES (1005, '홍길동', '구매부', '2000-02-01', '1986-12-04', '광주 금남동', '수입자재', 320);

CREATE OR REPLACE VIEW emp_hr_view
AS SELECT empid, ename, hire_date, salary   /*뷰 생성*/
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
WHERE dept = '영업부';

/*  뷰 를 관계가 있는 두 테이블에서 만들기 */

CREATE TABLE dept (
    dept_code NUMBER(2),
    dname VARCHAR2(10),
    dnum NUMBER(3),
    primary key(dept_code)
);

INSERT INTO dept VALUES (1, '영업부', 23);
INSERT INTO dept VALUES (2, '생산부', 58);
INSERT INTO dept VALUES (3, '인사부', 10);
INSERT INTO dept VALUES (4, '구매부', 5 );

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

INSERT INTO emp_2 VALUES (2001, '김동양', 1, '2021-02-01', '1985-10-12', '서울 대림동', '특수영업', 350);
INSERT INTO emp_2 VALUES (2002, '윤미래', 1, '1999-01-01', '1984-09-10', '안양 용봉동', '영업관리', 400);
INSERT INTO emp_2 VALUES (2003, '박구로', 2, '2010-09-01', '1986-05-16', '부산 대하동', '품질관리', 300);
INSERT INTO emp_2 VALUES (2004, '이대학', 3, '1997-02-01', '1985-10-12', '대구 달성동', '급여', 450);
INSERT INTO emp_2 VALUES (2005, '홍길동', 4, '2000-02-01', '1986-12-04', '광주 금남동', '수입자재', 320);

create view de_view
as select emp_2.empid, emp_2.ename, dept.dname, emp_2.hire_date, emp_2.salary
from emp_2 join dept ON emp_2.dept = dept.dept_code;  /*join 을 해줘야 중복업이 원하는것만 뽑을 수 있다.*/

SELECT *
FROM de_view;

INSERT INTO de_view VALUES(2006);

DELETE de_view
WHERE empid = 2005;

SELECT *
FROM emp_2;
   /*정규화된 테이블말고 위 그냥 emp테이블로 뷰 만들어서 insert 해보기*/
CREATE VIEW emp_plan_view                       
as select empid, ename, dept, job 
from emp;

select *
from emp_plan_view;

INSERT INTO emp_plan_view VALUES(1006,'유경인','영업부','영업관리');

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
/*count는 동작할때 특정 컬럼내에서 null을 스킵한다.*/
SELECT count(passenger_id) FROM passengers;
SELECT count(age) FROM passengers;
SELECT count(*) FROM passengers 
WHERE age<20;

SELECT count(*) FROM passengers 
WHERE age is null;

SELECT count(*) FROM passengers
WHERE pclass = 1 and sibsp = 0 and parch = 0;

SELECT count(distinct embarked) FROM passengers;
/*동일한 이름을 갖는 사람을 찾는 구문임*/
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
/*승객중 가장 나이가 많은 사람의 이름과 나이는?*/

with max_age_table as (select max(age) as max_age
from passengers)
select name, age
from passengers JOIN max_age_table ON age = max_age;

/*쿼리를 사용할 수 도 있다.*/
SELECT name,age
FROM passengers
WHERE age = (SELECT MAX(age) FROM passengers);

