DESC cons_01;

INSERT INTO cons_01 VALUES ( 'Hi Hello' );

SELECT
    *
FROM
    cons_01;

-- 제약조건 자료사전 : USER_CONSTRAINTS

SELECT
    *
FROM
    user_constraints
WHERE
    table_name = 'CONS_01';

-- 제약조건에 이름 붙여서 설정하기

CREATE TABLE cons_02 (
-- 컬럼명 데이터타입 CONSTRAINT 제약조건명 제약조건종류
            data VARCHAR(10)
        CONSTRAINT ndata NOT NULL
);

INSERT INTO cons_01 VALUES ( NULL ); --마찬가지로 NULL 값을 넣을 수가 없다.

-- 테이블LEVEL로 제약조건 설정하기

CREATE TABLE cons_03 (
    data1  NUMBER,
    data2  NUMBER
        CONSTRAINT data2n NOT NULL, 
-- CLOUNM LEVEL롤 제약사항 설정
            data3  NUMBER,
    data4  NUMBER
);

--UNIQUE

CREATE TABLE cons_03 (
    data VARCHAR2(10)
        CONSTRAINT ukdata UNIQUE
);

-- 제약조건을 확인하기
-- TABLE_NAME이 테이블명은 항상 대문자로 넣어 주어야한다.
SELECT
    *
FROM
    user_constraints
WHERE
    table_name = 'CONS_03';

-- 삽입
INSERT INTO cons_03 VALUES ( 'APP' );

-- 조회
SELECT
    *
FROM
    cons_03;

CREATE TABLE cons_04 (
    data1  NUMBER,
    data2  NUMBER
        CONSTRAINT ukdata2 UNIQUE,
    data3  NUMBER,
    CONSTRAINT ukdata1 UNIQUE ( data1 ),
    CONSTRAINT ukdata3 UNIQUE ( data3 )
    -- 테이블 LEVEL 로 UNIQUE를 주는방법
    );

DROP TABLE cons_04;

SELECT
    *
FROM
    user_constraints
WHERE
    table_name = 'CONS_04';
    
 -- CHECK
 
 CREATE TABLE cons_05 (
    data NUMBER CHECK ( data >= 1
                        AND data <= 100 )
-- 1부터 100사이의 값만 가능하다.
);

INSERT INTO cons_05 VALUES ( 50 );

INSERT INTO cons_05 VALUES ( 101 );
-- 101은 범위초과로 오류 난다.

CREATE TABLE cons_06 (
    data VARCHAR2(1) CHECK ( data = 'Y'
                             OR data = 'N' )
);

CREATE TABLE cons_06 (
    data VARCHAR2(1) CHECK ( data IN ( 'Y', 'N' ) )
); -- 위의 두개는 같은 동작을 한다.
 
 INSERT INTO cons_06 VALUES ( 'Y' );

INSERT INTO cons_06 VALUES ( 'N' );

INSERT INTO cons_06 VALUES ( 'Y' );

INSERT INTO cons_06 VALUES ( 'y' );
-- 범위초가 에러

--DEFAULT

CREATE TABLE cons_07 (
    data1  NUMBER DEFAULT 10,
    data2  DATE DEFAULT sysdate,
    data3  VARCHAR2(10) DEFAULT 'HI' NOT NULL
);
    
  -- 컬럼 정보 자료사전 조회  
SELECT
    *
FROM
    user_constraints
WHERE
    table_name = 'CONS_07';

--컬럼 DEFAULT 정보 자료사전 조회
SELECT
    *
FROM
    user_tab_columns
WHERE
    table_name = 'CONS_07';

--DEFAULT 제약조건은 NULL 값을 대체하는 값이 아니다.
INSERT INTO cons_07 VALUES (
    NULL,
    NULL,
    'AA'
);

SELECT
    *
FROM
    cons_07;

-- 값을 아예 명시하지 않을때 DEFAULT 값이 들어간다.
INSERT INTO cons_07 ( data3 ) VALUES ( 'AABBB' );

-- 모든 컬럼의 값을 입력하지 않는 방법은 없다.
INSERT
    INTO cons_07; -- 에러
INSERT INTO CONS_07 VALUES ( );--에러
--모두 DEFAULT값을 넣을 수는 없다. 한개는 넣어주어야 한다.

--PRIMARY KEY

CREATE TABLE CONS_08 (
    NO NUMBER CONSTRAINT PKNO PRIMARY KEY,
    DATA VARCHAR2(20) NOT NULL);

CREATE TABLE CONS_09 (
    NO NUMBER PRIMARY KEY,
    DATA VARCHAR2(20) NOT NULL);

CREATE TABLE CONS_10 (
    NO NUMBER ,
    DATA VARCHAR2(20) NOT NULL,
    CONSTRAINT PKNO10 PRIMARY KEY(NO)
    );
    
CREATE TABLE CONS_11 (
    NO NUMBER ,
    DATA VARCHAR2(20) NOT NULL,
    PRIMARY KEY(NO)
    ); -- 이름없이 선언하는 방법 
    -- 추천하지는 않는다. 명시하는게 좋다.
    
    
-- FOREIGN KEY

SELECT * FROM EMP;
SELECT * FROM DEPT;

-- DEPT 테이블의 모든 데이터를 삭제한다.
DELETE DEPT;  -- 오류 발생
-- EMP가 DEPT를 참조하기 때문이다.

INSERT INTO EMP (EMPNO, DEPTNO) VALUES(9999, 50);--에러
INSERT INTO EMP (EMPNO, DEPTNO) VALUES(9999, NULL);--정상
INSERT INTO EMP (EMPNO, DEPTNO) VALUES(9998, 30); --정상
   
 CREATE TABLE CONS_12(
    NUM NUMBER,
    DATA VARCHAR2(20)
    CONSTRAINT FK_NUM FOREIGN KEY (NUM) -- FK 자신테이블 컬럼
    REFERENCES CONS_11 (NO) ); -- PK, 참조 테이블과컬럼명
    
DROP TABLE FK_TEST;
DROP TABLE PK_TEST;

 CREATE TABLE PK_TEST(
    NO NUMBER,
    DATA VARCHAR2(20),
    CONSTRAINT PK_NO PRIMARY KEY( NO
    ) 
    );
    
    CREATE TABLE FK_TEST(
    ID VARCHAR2(30),
    NO NUMBER,
    CONSTRAINT PK_ID PRIMARY KEY (ID),
    CONSTRAINT FK_NO FOREIGN KEY ( NO)
    REFERENCES PK_TEST (NO) ON DELETE SET NULL
   -- ON UPDATE CASCADE
    );
    
INSERT INTO PK_TEST VALUES(1, 'APPLE');    
INSERT INTO PK_TEST VALUES(2, 'APSSSS');    
INSERT INTO PK_TEST VALUES(4, 'AdDDD');    
INSERT INTO PK_TEST VALUES(3, 'AFFFF');    

INSERT INTO FK_TEST VALUES('A', 1); 
INSERT INTO FK_TEST VALUES('B', 2); 
INSERT INTO FK_TEST VALUES('C', 3); 
INSERT INTO FK_TEST VALUES('D', 3); 
    
 SELECT * FROM PK_TEST;
 SELECT * FROM FK_TEST;
  
DELETE PK_TEST;
-- CASCADE 되어 모두 다 지워진다.
  
  
  
  
  --ALTER TABLE
  
  CREATE TABLE ALTER_TEST(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(20),
    CONSTRAINT PK_ALTER_TEST PRIMARY KEY (EMPNO) );
 -- 테이블 생성
    
    DESC ALTER_TEST;
  --테이블 구조 확인
  
  SELECT * FROM ALTER_TEST;
  --테이블 조회
  
  
  INSERT INTO ALTER_TEST
  SELECT empno, ename FROM
emp;
  --다른 테이블을 조회하여 삽입하기
  
 
 --새로운 컬럼 추가하기 : PHONE VARCHAR2(11)
 ALTER TABLE alter_test ADD (
    phone VARCHAR2(11)
);

DESC alter_test;

SELECT
    *
FROM
    alter_test;
  
 -- 기존 컬럼의 데이터타입 변경하기 : 
 -- PHOME VARCHAR2 (11) - > PHONE VARCHAR2(20)
 
 ALTER TABLE alter_test MODIFY (
    phone VARCHAR2(20)
);
  
  
  -- 기존 컬럼에 NOT NULL 속성 부여하기 : 
  -- EMPNO NUMBER(4) - > EMPNO NUMBER(4) NOT NULL
  
  ALTER TABLE alter_test MODIFY (
    empno NUMBER(4) NOT NULL
);
  
  --PHONE 컬럼을 삭제한다.
  ALTER TABLE alter_test DROP COLUMN phone;

SELECT
    *
FROM
    alter_test;
  
  --ENAME컬럼 비활성화 (복구 불가능)
  ALTER TABLE alter_test SET UNUSED ( ename );
  
  --비활성화된 컬럼을 실제(물리적)으로 삭제하기
  ALTER TABLE alter_test DROP UNUSED COLUMNS;
  
  
  --테이블명 변경하기
  ALTER TABLE alter_test RENAME TO
alter_tb;

DESC alter_tb;
  
  --컬럼명 변경하기
  ALTER TABLE alter_tb RENAME COLUMN empno TO eno;

DESC alter_tb;
  
  --ALTER TABLE을 이용한 제약조건 설정
  CREATE TABLE alter_cons (
    data VARCHAR2(10)
);

ALTER TABLE alter_cons MODIFY
    data NOT NULL; -- NOT NULL 특성
  ALTER TABLE alter_cons MODIFY
    data null; -- NULL 특성부여
  
  ALTER TABLE alter_cons MODIFY
    data DEFAULT 'HI'; --DEFAULT 'HI' 특성부여
  ALTER TABLE alter_cons MODIFY
    data default NULL; -- DEFAULT NULL 특성부여
  
  ALTER TABLE alter_cons ADD CONSTRAINT uk_data UNIQUE ( data );
    -- UNIQUE와 CONSTRAINT를 부여하는 코드 
 ALTER TABLE alter_cons DROP CONSTRAINT uk_data;

ALTER TABLE alter_cons
    ADD CONSTRAINT ck_data CHECK ( data >= 'A'
                                   AND data <= 'Z' );
-- ADD 로CHECK 부여하기 
ALTER TABLE alter_cons DROP CONSTRAINT ck_data;
----------------------------------------------------------------------------------
-- ALTER를 이용한 기본키 생성
ALTER TABLE alter_cons ADD CONSTRAINT
pk_data PRIMARY KEY ( data );

ALTER TABLE ALTER_CONS
DROP CONSTRAINT PK_DATA;
--CONSTRINAT 를 이용한 기본키를 제거하는 방법
----------------------------------------------------------------------------------

CREATE TABLE ALTER_FK_CONS(
    FK_DATA VARCHAR2(10) );
    
ALTER TABLE ALTER_FK_CONS
ADD CONSTRAINT FK_DATA
FOREIGN KEY( FK_DATA)
    REFERENCES ALTER_CONS
    ON DELETE CASCADE;
    
ALTER TABLE ALTER_FK_CONS DROP CONSTRAINT FK_DATA; 
-- FOREIGN 키 제거


SELECT * FROM ALTER_TB;

--데이터 삭제
DELETE ALTER_TB;
-- 공간은 차지하고 있다(용량유지)

-- 데이터 삭제(용량까지 줄어들게 만든다.)
TRUNCATE TABLE ALTER_TB;

-- 테이블 스키마 까지 모두 삭제
DROP TABLE ALTER_TB;
--------------------------------------------------------------  
 -- COMMENT, 코멘트

 CREATE TABLE TEST_COMMENT(
    BOARDNO NUMBER,
    BTITILE VARCHAR2(100),
    BCONTENT VARCHAR2(400),
    BWRITER VARCHAR2(200),
    BDATE DATE
);

-- 테이블 코멘트
COMMENT ON TABLE TEST_COMMENT IS '코멘트 테스트 - 게시글';
SELECT * FROM USER_TAB_COMMENTS
WHERE TABLE_NAME = 'TEST_COMMENT';

-- 컬럼 코멘트
COMMENT ON COLUMN TEST_COMMENT.BOARDNO IS '게시글 번호'; 
COMMENT ON COLUMN TEST_COMMENT.BTITILE IS '게시글 제목'; 
COMMENT ON COLUMN TEST_COMMENT.BCONTENT IS '게시글 본문'; 
COMMENT ON COLUMN TEST_COMMENT.BWRITER IS '게시글 작성자'; 
COMMENT ON COLUMN TEST_COMMENT.BDATE IS '게시글 작성일'; 

SELECT * FROM USER_TAB_COMMENTS
WHERE TABLE_NAME = 'TEST_COMMENT';


