DROP TABLE buildings;
CREATE TABLE buildings (
    no NUMBER(2,0),
    lecture_rooms NUMBER(3,0),
    height NUMBER(5,2),
    dept CHAR(11 CHAR)
);

INSERT INTO buildings VALUES (10, 500, 100, '��ǻ�ͼ���Ʈ������а�');

SELECT * FROM buildings;