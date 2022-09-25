drop table emp;

create table emp(
id number(5,0),
name char(10 char),
dept char(2),
pid char(20 char),
birth char(10 char),
age number(2),
primary key(id)
)

insert into emp values (21001, '김동양', '01', '990125-1293728', '99/01/25', 24);
insert into emp values (21002, '윤미래', '02', '030312-2199384', '03/03/12', 20);
insert into emp values (21003, '박구로', '01', '011011-1928583', '01/10/11', 22);
insert into emp values (21004, '홍길동', '03', '021111-1949472', '02/11/11', 21);

select * from emp;

CREATE index emp_name_idx on
emp(name);

select * from emp where name = '김동양';





drop table emp2;

create table emp2(
empid number(4),
ename char(10 char),
dept char(10 char),
hire_date date,
birthday date,
address char(20 char),
job char(10 char),
salary number(4,0),
primary key(empid)
)

insert into emp2 values (1001, '김동양', '영업부', '2021-02-01', '1985-10-12', '서울 대림동', '특수영업', 350);
insert into emp2 values (1002, '윤미래', '영업부', '1999-01-01', '1984-09-10', '안양 용봉동', '영업관리', 400);
insert into emp2 values (1003, '박구로', '생산부', '2010-09-01', '1986-05-16', '부산 대하동', '품질관리', 300);
insert into emp2 values (1004, '이대학', '인사부', '1997-02-01', '1982-04-10', '대구 달성동', '급여', 450);
insert into emp2 values (1005, '홍길동', '구매부', '2000-02-01', '1986-12-04', '광주 금남동', '수입자재', 320);

select * from emp2;

create or replace view emp2_hr_view
as select empid, ename, hire_date, salary
from emp2;

create or replace view emp2_wf_view
as select empid, ename, birthday, address
from emp2;

create or replace view emp2_plan_view
as select empid, ename, dept, job
from emp2;

create or replace view high_salary
as select *
from emp2
where salary >= 350;

SELECT empid, ename, salary
FROM high_salary
WHERE dept = '영업부';

select empid, ename, salary
from emp2
where salary >= 350
and dept = '영업부';





drop table emp3;
drop table dept;

create table emp3(
empid number(4),
ename char(10 char),
dept number(1,0),
hire_date date,
birthday date,
address char(20 char),
job char(10 char),
salary number(4,0),
primary key(empid),
foreign key (dept) references dept(dept_code)
)

insert into emp3 values (1001, '김동양', 1, '2021-02-01', '1985-10-12', '서울 대림동', '특수영업', 350);
insert into emp3 values (1002, '윤미래', 1, '1999-01-01', '1984-09-10', '안양 용봉동', '영업관리', 400);
insert into emp3 values (1003, '박구로', 2, '2010-09-01', '1986-05-16', '부산 대하동', '품질관리', 300);
insert into emp3 values (1004, '이대학', 3, '1997-02-01', '1982-04-10', '대구 달성동', '급여', 450);
insert into emp3 values (1005, '홍길동', 4, '2000-02-01', '1986-12-04', '광주 금남동', '수입자재', 320);

create table dept(
dept_code number(1,0),
dname char(10 char),
dnum number(2,0),
primary key(dept_code)
)

insert into dept values (1, '영업부', '23');
insert into dept values (2, '생산부', '58');
insert into dept values (3, '인사부', '10');
insert into dept values (4, '구매부', '5');

create or replace view emp3_table_view
as select emp3.empid, emp3.ename, dept.dname, emp3.hire_date, emp3.salary
from emp3, dept;

create or replace view emp3_table2_view
as select empid, ename, dname, hire_date, salary
from emp3 join dept
on enp3.dept = dept.dept_code;
