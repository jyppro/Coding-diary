DROP TABLE emp;
DROP TABLE dept;


CREATE TABLE emp (
  id    NUMBER(5),
  name  VARCHAR(10),
  pid   CHAR(14),
  birth DATE,
  age   NUMBER(3),
  dept  NUMBER(3),
  PRIMARY KEY(id),
  FOREIGN KEY (dept)
    REFERENCES dept(dept_code)
);

CREATE TABLE dept (
  dept_code NUMBER(3),
  name      VARCHAR(10),
  sales     NUMBER(10),
  rank      NUMBER(3),
  PRIMARY   KEY(dept_code)
);

INSERT INTO dept VALUES ('01', '����1��', 1200, 2);
INSERT INTO dept VALUES ('02', '����2��', 3400, 1);
INSERT INTO dept VALUES ('03', '����3��', 800, 3);

INSERT INTO emp VALUES (21001, '�赿��', '990125-1293728', '99/01/25', 24, '01');
INSERT INTO emp VALUES (21002, '���̷�', '030312-2199384', '03/03/12', 20, '02');
INSERT INTO emp VALUES (21003, '�ڱ���', '011011-1928583', '01/10/11', 22, '01');
INSERT INTO emp VALUES (21004, 'ȫ�浿', '021111-1949472', '02/11/11', 21, '03');



SELECT dept.name, sales, rank
FROM dept, emp
WHERE emp.id = 21001 AND 
dept.dept_code = emp.dept;

SELECT emp.name, dept.name
FROM emp JOIN dept ON emp.dept = dept.dept_code;
