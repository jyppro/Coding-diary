CREATE TABLE practice4_1 (
    value1 CHAR(15),
    value2 VARCHAR2(15),
    value3 NCHAR(15),
    value4 NVARCHAR2(15)
);

INSERT INTO practice4_1 VALUES ('������', '������', '������', '������');
/* value1�� ���ڿ� '������'�� ���� 3��, ���鹮�� 6���� �پ� �� ���̰� 9�� �� => ����Ʈ ũ�⸦ ��Ÿ���� �� �ƴ� ����(length) �̹Ƿ� ���ڿ��� ���� + ���鹮�� */
/* value2�� ���ڿ� '������'�� ���� 3�̰�, ���鹮�� ���� */
/* value3�� NCHAR(15)���� 15�� ����Ʈ ���̰� �ƴ� ���ڿ� �����̹Ƿ�, ���ڿ� '������'�� ���� 3�� ���鹮�� 12���ڸ� ���� 15�� ��ȯ*/
/* value4�� �������� ���ڿ��̹Ƿ�, ���ڿ� '������'�� ���� 3�� ��ȯ */
SELECT value1, LENGTH(value1), value2, LENGTH(value2), value3, LENGTH(value3), value4, LENGTH(value4)
FROM practice4_1;

/* value1�� UTF-8 ���ڿ� ���ڵ��� CHAR(15)�� ����Ʈ ���̰�, �ѱ��� UTF-8���� 3Bytes�̹Ƿ�, ���ڿ� '������'�� 9 Bytes�� ���鹮�� 6 Bytes ���� 15 Bytes ��ȯ */
/* value2�� �������� ���ڿ� VARCHAR2 Ÿ���̹Ƿ� �ѱ� ���ڿ� '������'�� 9 Bytes �� ��ȯ */
/* value3�� NCHAR Ÿ���� �츮 ȯ�濡���� UTF-16 ���ڿ� ���ڵ� ����̰�, �� ���ڴ� �ִ� 2 Bytes�� �Һ��ϹǷ�,
NCHAR(15)���� 15���ڸ� �����ϱ� ���ؼ��� 30 Bytes ������ �ʿ��ϹǷ� 30�� ��ȯ
/* value4�� NVARCHAR2�� UTF-16 ���ڿ� ���ڵ� ������� �ѱ��� �� ���ڴ� 2 Bytes�� ó��, �׸��� �������� ���ڿ��̹Ƿ�, ���� ����� �ѱ� ���ڿ� '������'�� 6 Bytes ���� ��ȯ */
SELECT value1, LENGTHB(value1), value2, LENGTHB(value2), value3, LENGTHB(value3), value4, LENGTHB(value4)
FROM practice4_1;

CREATE TABLE practice4_2 (
    name VARCHAR2(10 CHAR),
    birth_date DATE,
    current_timestamp TIMESTAMP
);

INSERT INTO practice4_2 VALUES('�赿��', '1950/01/01', SYSTIMESTAMP);

SELECT * FROM practice4_2;

CREATE TABLE practice4_3 (
    sid NUMBER(6,0),
    name VARCHAR2(10 CHAR),
    age NUMBER(3,0),
    dept VARCHAR2(10 CHAR),
    PRIMARY KEY(sid)
);

/* ���� �̸��� ���̰� ���� �� */
INSERT INTO practice4_3 values ('202201', 'ȫ�浿', 25, '�ļҰ�');
INSERT INTO practice4_3 values ('202202', '�赿��', 20, '�ļҰ�');
INSERT INTO practice4_3 values ('202204', '�̴���', 20, '�ļҰ�');
INSERT INTO practice4_3 values ('202205', '�ڱ���', 21, '�ļҰ�');
INSERT INTO practice4_3 values ('202203', '���̷�', 22, '�ļҰ�');

/* ���� ���̿� ���� ��� �޶��� */
SELECT * FROM practice4_3 ORDER BY name DESC;
SELECT * FROM practice4_3 ORDER BY age ASC;

