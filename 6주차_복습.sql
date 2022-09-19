DROP TABLE items;
CREATE TABLE items
(
    id CHAR(7),
    amount NUMBER(4,0),
    weight NUMBER(3,1),
    name VARCHAR2(4 CHAR),
    maker VARCHAR2(4 CHAR),
    price NUMBER(6),
    pdate DATE,
    rdate TIMESTAMP,
    available CHAR(2 CHAR),
    PRIMARY KEY (id)
);

INSERT INTO items VALUES ('1111000', 10, 10, '����Ʈ', '�ֶ���', 40000, '2021/12/01', '2022/04/01 14:23:00', '');
INSERT INTO items VALUES ('1111001', 1229, 22.4, '������', '����', 400000, '2022/03/31', '2022/04/01 14:23:00', '');
INSERT INTO items VALUES ('1111002', 3492, 5, '�Ʒ�', '�궯', 25900, '2021/01/04', '2022/04/01 14:23:00', '����');
INSERT INTO items VALUES ('0011001', 39, 10, '������', '����', 843300, '2021/09/14', '2022/04/05 17:00:00', '');
INSERT INTO items VALUES ('0011002', 0, 9.3, '������Ʈ', '�ζ�', 99000, '2022/03/15', '2022/04/05 17:00:00', '');
    
select * from items;

SELECT ID, NAME, CASE WHEN AMOUNT > 0 THEN '�����' ELSE '������' END AS "���������"
FROM items;

select *
from items
where maker in ('����', '�궯');

select *
from items
where available is null;

select id, name, amount * weight || 'kg' as "�� ����"
from items
where amount * weight between 100 and 20000;

select id, name, round(weight, 0) as "����", replace(maker, '��', '*') as "������"
from items
where name like '%��Ʈ';