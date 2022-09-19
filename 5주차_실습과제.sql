CREATE TABLE students_5
( 
  sid  VARCHAR(10), 
  name CHAR(10), 
  pid  CHAR(13),
  age  NUMBER(3,0),
  dept CHAR(10)
);

INSERT INTO students_5 VALUES ('202201', '�赿��', '0312071928302', 20, '�ļҰ�');
INSERT INTO students_5 VALUES ('202202', '�赿��', '0308121827382', 20, '�ļҰ�');
INSERT INTO students_5 VALUES ('202203', '���̷�', '0103042937828', 22, '�ļҰ�');
INSERT INTO students_5 VALUES ('202204', '�̴���', '0301242828372', 20, '�ļҰ�');
INSERT INTO students_5 VALUES ('202205', '�ڱ���', '0207151928389', 21, '�ļҰ�');

SELECT sid "�й�", REPLACE(pid, SUBSTR(pid, -6, 6), '******') AS "�ֹι�ȣ"
FROM students_5;