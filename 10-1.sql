drop table 학생;
drop table 학기별성적;

create table 학생(
학번 number(8),
이름 char(10 char),
아이디 varchar2(50),
비밀번호 varchar2(50),
주민번호 char(14),
학과 char(20 char),
나이 number(2),
primary key(학번)
)

create table 학기별성적(
성적학번 number(8),
연도 char(20 char),
학년 number(1),
신청과목수 number(2),
신청학점 number(2),
취득학점 number(2),
평점 number(2, 1),
석차 char(10 char),
primary key(성적학번, 연도, 학년),
foreign key(성적학번) references 학생(학번)
)

insert into 학생 values(20190816, '박재영', 'hgodhwekw12', 'ppptyire23', '123456-3124453', '컴소과', 23);
insert into 학생 values(20200816, '노재영', 'hgodhwekw23', 'ppptyire34', '123456-3124452', '컴정과', 22);


insert into 학기별성적 values(20190816, '2019년-1학년-1학기', 1, 8, 22, 22, 3.6, '43/141');
insert into 학기별성적 values(20190816, '2022년-1학년-2학기', 2, 9, 24, 24, 3.7, '41/141');
insert into 학기별성적 values(20190816, '2022년-2학년-1학기', 2, 8, 22, 22, 4.5, '1/141');
insert into 학기별성적 values(20200816, '2019년-1학년-1학기', 1, 6, 18, 18, 4.1, '13/141');
insert into 학기별성적 values(20200816, '2022년-1학년-2학기', 2, 8, 22, 22, 4.0, '19/141');
insert into 학기별성적 values(20200816, '2022년-2학년-1학기', 2, 7, 20, 20, 4.5, '1/141');


select * from 학생;

select * from 학기별성적;

select 이름, 평점
from 학생, 학기별성적
where 학생.학번 = 학기별성적.성적학번;



create table 대출(
대출번호 number(1),
회원번호 number(4),
도서관리번호 number(4),
대출일 date,
반납예정일 date,
반납여부 char(2),
연체료납부여부 char(2),
primary key(대출번호)
)

create sequence loan_id
increment by 1
start with 1;

drop sequence loan_id;

insert into 대출 values(loan_id.nextval, 1001, 993, '22/04/23', '22/04/30', 'N', 'N');
insert into 대출 values(loan_id.nextval, 1001, 834, '22/04/20', '22/04/27', 'Y', 'N');
insert into 대출 values(loan_id.nextval, 1002, 109, '22/03/09', '22/03/20', 'N', 'Y');

select * from 대출;




CREATE TABLE dept (
dept_code NUMBER(3),
name VARCHAR(10),
sales NUMBER(10),
rank NUMBER(3),
PRIMARY KEY(dept_code)
);

CREATE TABLE emp (
id NUMBER(5),
name VARCHAR(10),
pid CHAR(14),
birth DATE,
age NUMBER(3),
dept NUMBER(3),
PRIMARY KEY(id),
FOREIGN KEY (dept)
REFERENCES dept(dept_code)
);

insert into emp values (21001, '김동양', '990123-1293728', '99/01/25', 24, 01);
insert into emp values (21002, '윤미래', '030312-2199384', '03/03/12', 20, 02);
insert into emp values (21003, '박구로', '011011-1928583', '01/10/11', 22, 01);
insert into emp values (21004, '홍길동', '021111-1949472', '02/11/11', 21, 03);

insert into dept values (01, '영업1팀', 1200, 2);
insert into dept values (02, '영업2팀', 3400, 1);
insert into dept values (03, '영업3팀', 800, 3);

