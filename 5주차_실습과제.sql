CREATE TABLE students_5
( 
  sid  VARCHAR(10), 
  name CHAR(10), 
  pid  CHAR(13),
  age  NUMBER(3,0),
  dept CHAR(10)
);

INSERT INTO students_5 VALUES ('202201', '김동양', '0312071928302', 20, '컴소과');
INSERT INTO students_5 VALUES ('202202', '김동양', '0308121827382', 20, '컴소과');
INSERT INTO students_5 VALUES ('202203', '윤미래', '0103042937828', 22, '컴소과');
INSERT INTO students_5 VALUES ('202204', '이대학', '0301242828372', 20, '컴소과');
INSERT INTO students_5 VALUES ('202205', '박구로', '0207151928389', 21, '컴소과');

SELECT sid "학번", REPLACE(pid, SUBSTR(pid, -6, 6), '******') AS "주민번호"
FROM students_5;