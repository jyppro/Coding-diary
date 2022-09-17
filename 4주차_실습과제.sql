CREATE TABLE practice4_1 (
    value1 CHAR(15),
    value2 VARCHAR2(15),
    value3 NCHAR(15),
    value4 NVARCHAR2(15)
);

INSERT INTO practice4_1 VALUES ('김재형', '김재형', '김재형', '김재형');
/* value1은 문자열 '김재형'의 길이 3에, 공백문자 6개가 붙어 총 길이가 9가 됨 => 바이트 크기를 나타내는 게 아닌 길이(length) 이므로 문자열의 길이 + 공백문자 */
/* value2는 문자열 '김재형'의 길이 3이고, 공백문자 없음 */
/* value3의 NCHAR(15)에서 15는 바이트 길이가 아닌 문자열 길이이므로, 문자열 '김재형'의 길이 3과 공백문자 12글자를 합쳐 15를 반환*/
/* value4는 가변길이 문자열이므로, 문자열 '김재형'의 길이 3만 반환 */
SELECT value1, LENGTH(value1), value2, LENGTH(value2), value3, LENGTH(value3), value4, LENGTH(value4)
FROM practice4_1;

/* value1의 UTF-8 문자열 인코딩인 CHAR(15)는 바이트 길이고, 한글은 UTF-8에서 3Bytes이므로, 문자열 '김재형'의 9 Bytes와 공백문자 6 Bytes 합쳐 15 Bytes 반환 */
/* value2는 가변길이 문자열 VARCHAR2 타입이므로 한글 문자열 '김재형'의 9 Bytes 만 반환 */
/* value3의 NCHAR 타입은 우리 환경에서는 UTF-16 문자열 인코딩 방식이고, 한 글자당 최대 2 Bytes를 소비하므로,
NCHAR(15)에서 15글자를 저장하기 위해서는 30 Bytes 공간이 필요하므로 30을 반환
/* value4의 NVARCHAR2는 UTF-16 문자열 인코딩 방식으로 한글은 한 글자당 2 Bytes로 처리, 그리고 가변길이 문자열이므로, 실제 저장된 한글 문자열 '김재형'의 6 Bytes 만을 반환 */
SELECT value1, LENGTHB(value1), value2, LENGTHB(value2), value3, LENGTHB(value3), value4, LENGTHB(value4)
FROM practice4_1;

CREATE TABLE practice4_2 (
    name VARCHAR2(10 CHAR),
    birth_date DATE,
    current_timestamp TIMESTAMP
);

INSERT INTO practice4_2 VALUES('김동양', '1950/01/01', SYSTIMESTAMP);

SELECT * FROM practice4_2;

CREATE TABLE practice4_3 (
    sid NUMBER(6,0),
    name VARCHAR2(10 CHAR),
    age NUMBER(3,0),
    dept VARCHAR2(10 CHAR),
    PRIMARY KEY(sid)
);

/* 본인 이름과 나이가 들어가면 됨 */
INSERT INTO practice4_3 values ('202201', '홍길동', 25, '컴소과');
INSERT INTO practice4_3 values ('202202', '김동양', 20, '컴소과');
INSERT INTO practice4_3 values ('202204', '이대학', 20, '컴소과');
INSERT INTO practice4_3 values ('202205', '박구로', 21, '컴소과');
INSERT INTO practice4_3 values ('202203', '윤미래', 22, '컴소과');

/* 본인 나이에 따라 결과 달라짐 */
SELECT * FROM practice4_3 ORDER BY name DESC;
SELECT * FROM practice4_3 ORDER BY age ASC;

