drop table �л�;
drop table �б⺰����;

create table �л�(
�й� number(8),
�̸� char(10 char),
���̵� varchar2(50),
��й�ȣ varchar2(50),
�ֹι�ȣ char(14),
�а� char(20 char),
���� number(2),
primary key(�й�)
)

create table �б⺰����(
�����й� number(8),
���� char(20 char),
�г� number(1),
��û����� number(2),
��û���� number(2),
������� number(2),
���� number(2, 1),
���� char(10 char),
primary key(�����й�, ����, �г�),
foreign key(�����й�) references �л�(�й�)
)

insert into �л� values(20190816, '���翵', 'hgodhwekw12', 'ppptyire23', '123456-3124453', '�ļҰ�', 23);
insert into �л� values(20200816, '���翵', 'hgodhwekw23', 'ppptyire34', '123456-3124452', '������', 22);


insert into �б⺰���� values(20190816, '2019��-1�г�-1�б�', 1, 8, 22, 22, 3.6, '43/141');
insert into �б⺰���� values(20190816, '2022��-1�г�-2�б�', 2, 9, 24, 24, 3.7, '41/141');
insert into �б⺰���� values(20190816, '2022��-2�г�-1�б�', 2, 8, 22, 22, 4.5, '1/141');
insert into �б⺰���� values(20200816, '2019��-1�г�-1�б�', 1, 6, 18, 18, 4.1, '13/141');
insert into �б⺰���� values(20200816, '2022��-1�г�-2�б�', 2, 8, 22, 22, 4.0, '19/141');
insert into �б⺰���� values(20200816, '2022��-2�г�-1�б�', 2, 7, 20, 20, 4.5, '1/141');


select * from �л�;

select * from �б⺰����;

select �̸�, ����
from �л�, �б⺰����
where �л�.�й� = �б⺰����.�����й�;



create table ����(
�����ȣ number(1),
ȸ����ȣ number(4),
����������ȣ number(4),
������ date,
�ݳ������� date,
�ݳ����� char(2),
��ü�ᳳ�ο��� char(2),
primary key(�����ȣ)
)

create sequence loan_id
increment by 1
start with 1;

drop sequence loan_id;

insert into ���� values(loan_id.nextval, 1001, 993, '22/04/23', '22/04/30', 'N', 'N');
insert into ���� values(loan_id.nextval, 1001, 834, '22/04/20', '22/04/27', 'Y', 'N');
insert into ���� values(loan_id.nextval, 1002, 109, '22/03/09', '22/03/20', 'N', 'Y');

select * from ����;




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

insert into emp values (21001, '�赿��', '990123-1293728', '99/01/25', 24, 01);
insert into emp values (21002, '���̷�', '030312-2199384', '03/03/12', 20, 02);
insert into emp values (21003, '�ڱ���', '011011-1928583', '01/10/11', 22, 01);
insert into emp values (21004, 'ȫ�浿', '021111-1949472', '02/11/11', 21, 03);

insert into dept values (01, '����1��', 1200, 2);
insert into dept values (02, '����2��', 3400, 1);
insert into dept values (03, '����3��', 800, 3);

