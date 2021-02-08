DESC cons_01;

INSERT INTO cons_01 VALUES ( 'Hi Hello' );

SELECT
    *
FROM
    cons_01;

-- �������� �ڷ���� : USER_CONSTRAINTS

SELECT
    *
FROM
    user_constraints
WHERE
    table_name = 'CONS_01';

-- �������ǿ� �̸� �ٿ��� �����ϱ�

CREATE TABLE cons_02 (
-- �÷��� ������Ÿ�� CONSTRAINT �������Ǹ� ������������
            data VARCHAR(10)
        CONSTRAINT ndata NOT NULL
);

INSERT INTO cons_01 VALUES ( NULL ); --���������� NULL ���� ���� ���� ����.

-- ���̺�LEVEL�� �������� �����ϱ�

CREATE TABLE cons_03 (
    data1  NUMBER,
    data2  NUMBER
        CONSTRAINT data2n NOT NULL, 
-- CLOUNM LEVEL�� ������� ����
            data3  NUMBER,
    data4  NUMBER
);

--UNIQUE

CREATE TABLE cons_03 (
    data VARCHAR2(10)
        CONSTRAINT ukdata UNIQUE
);

-- ���������� Ȯ���ϱ�
-- TABLE_NAME�� ���̺���� �׻� �빮�ڷ� �־� �־���Ѵ�.
SELECT
    *
FROM
    user_constraints
WHERE
    table_name = 'CONS_03';

-- ����
INSERT INTO cons_03 VALUES ( 'APP' );

-- ��ȸ
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
    -- ���̺� LEVEL �� UNIQUE�� �ִ¹��
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
-- 1���� 100������ ���� �����ϴ�.
);

INSERT INTO cons_05 VALUES ( 50 );

INSERT INTO cons_05 VALUES ( 101 );
-- 101�� �����ʰ��� ���� ����.

CREATE TABLE cons_06 (
    data VARCHAR2(1) CHECK ( data = 'Y'
                             OR data = 'N' )
);

CREATE TABLE cons_06 (
    data VARCHAR2(1) CHECK ( data IN ( 'Y', 'N' ) )
); -- ���� �ΰ��� ���� ������ �Ѵ�.
 
 INSERT INTO cons_06 VALUES ( 'Y' );

INSERT INTO cons_06 VALUES ( 'N' );

INSERT INTO cons_06 VALUES ( 'Y' );

INSERT INTO cons_06 VALUES ( 'y' );
-- �����ʰ� ����

--DEFAULT

CREATE TABLE cons_07 (
    data1  NUMBER DEFAULT 10,
    data2  DATE DEFAULT sysdate,
    data3  VARCHAR2(10) DEFAULT 'HI' NOT NULL
);
    
  -- �÷� ���� �ڷ���� ��ȸ  
SELECT
    *
FROM
    user_constraints
WHERE
    table_name = 'CONS_07';

--�÷� DEFAULT ���� �ڷ���� ��ȸ
SELECT
    *
FROM
    user_tab_columns
WHERE
    table_name = 'CONS_07';

--DEFAULT ���������� NULL ���� ��ü�ϴ� ���� �ƴϴ�.
INSERT INTO cons_07 VALUES (
    NULL,
    NULL,
    'AA'
);

SELECT
    *
FROM
    cons_07;

-- ���� �ƿ� ������� ������ DEFAULT ���� ����.
INSERT INTO cons_07 ( data3 ) VALUES ( 'AABBB' );

-- ��� �÷��� ���� �Է����� �ʴ� ����� ����.
INSERT
    INTO cons_07; -- ����
INSERT INTO CONS_07 VALUES ( );--����
--��� DEFAULT���� ���� ���� ����. �Ѱ��� �־��־�� �Ѵ�.

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
    ); -- �̸����� �����ϴ� ��� 
    -- ��õ������ �ʴ´�. ����ϴ°� ����.
    
    
-- FOREIGN KEY

SELECT * FROM EMP;
SELECT * FROM DEPT;

-- DEPT ���̺��� ��� �����͸� �����Ѵ�.
DELETE DEPT;  -- ���� �߻�
-- EMP�� DEPT�� �����ϱ� �����̴�.

INSERT INTO EMP (EMPNO, DEPTNO) VALUES(9999, 50);--����
INSERT INTO EMP (EMPNO, DEPTNO) VALUES(9999, NULL);--����
INSERT INTO EMP (EMPNO, DEPTNO) VALUES(9998, 30); --����
   
 CREATE TABLE CONS_12(
    NUM NUMBER,
    DATA VARCHAR2(20)
    CONSTRAINT FK_NUM FOREIGN KEY (NUM) -- FK �ڽ����̺� �÷�
    REFERENCES CONS_11 (NO) ); -- PK, ���� ���̺���÷���
    
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
-- CASCADE �Ǿ� ��� �� ��������.
  
  
  
  
  --ALTER TABLE
  
  CREATE TABLE ALTER_TEST(
    EMPNO NUMBER(4),
    ENAME VARCHAR2(20),
    CONSTRAINT PK_ALTER_TEST PRIMARY KEY (EMPNO) );
 -- ���̺� ����
    
    DESC ALTER_TEST;
  --���̺� ���� Ȯ��
  
  SELECT * FROM ALTER_TEST;
  --���̺� ��ȸ
  
  
  INSERT INTO ALTER_TEST
  SELECT empno, ename FROM
emp;
  --�ٸ� ���̺��� ��ȸ�Ͽ� �����ϱ�
  
 
 --���ο� �÷� �߰��ϱ� : PHONE VARCHAR2(11)
 ALTER TABLE alter_test ADD (
    phone VARCHAR2(11)
);

DESC alter_test;

SELECT
    *
FROM
    alter_test;
  
 -- ���� �÷��� ������Ÿ�� �����ϱ� : 
 -- PHOME VARCHAR2 (11) - > PHONE VARCHAR2(20)
 
 ALTER TABLE alter_test MODIFY (
    phone VARCHAR2(20)
);
  
  
  -- ���� �÷��� NOT NULL �Ӽ� �ο��ϱ� : 
  -- EMPNO NUMBER(4) - > EMPNO NUMBER(4) NOT NULL
  
  ALTER TABLE alter_test MODIFY (
    empno NUMBER(4) NOT NULL
);
  
  --PHONE �÷��� �����Ѵ�.
  ALTER TABLE alter_test DROP COLUMN phone;

SELECT
    *
FROM
    alter_test;
  
  --ENAME�÷� ��Ȱ��ȭ (���� �Ұ���)
  ALTER TABLE alter_test SET UNUSED ( ename );
  
  --��Ȱ��ȭ�� �÷��� ����(������)���� �����ϱ�
  ALTER TABLE alter_test DROP UNUSED COLUMNS;
  
  
  --���̺�� �����ϱ�
  ALTER TABLE alter_test RENAME TO
alter_tb;

DESC alter_tb;
  
  --�÷��� �����ϱ�
  ALTER TABLE alter_tb RENAME COLUMN empno TO eno;

DESC alter_tb;
  
  --ALTER TABLE�� �̿��� �������� ����
  CREATE TABLE alter_cons (
    data VARCHAR2(10)
);

ALTER TABLE alter_cons MODIFY
    data NOT NULL; -- NOT NULL Ư��
  ALTER TABLE alter_cons MODIFY
    data null; -- NULL Ư���ο�
  
  ALTER TABLE alter_cons MODIFY
    data DEFAULT 'HI'; --DEFAULT 'HI' Ư���ο�
  ALTER TABLE alter_cons MODIFY
    data default NULL; -- DEFAULT NULL Ư���ο�
  
  ALTER TABLE alter_cons ADD CONSTRAINT uk_data UNIQUE ( data );
    -- UNIQUE�� CONSTRAINT�� �ο��ϴ� �ڵ� 
 ALTER TABLE alter_cons DROP CONSTRAINT uk_data;

ALTER TABLE alter_cons
    ADD CONSTRAINT ck_data CHECK ( data >= 'A'
                                   AND data <= 'Z' );
-- ADD ��CHECK �ο��ϱ� 
ALTER TABLE alter_cons DROP CONSTRAINT ck_data;
----------------------------------------------------------------------------------
-- ALTER�� �̿��� �⺻Ű ����
ALTER TABLE alter_cons ADD CONSTRAINT
pk_data PRIMARY KEY ( data );

ALTER TABLE ALTER_CONS
DROP CONSTRAINT PK_DATA;
--CONSTRINAT �� �̿��� �⺻Ű�� �����ϴ� ���
----------------------------------------------------------------------------------

CREATE TABLE ALTER_FK_CONS(
    FK_DATA VARCHAR2(10) );
    
ALTER TABLE ALTER_FK_CONS
ADD CONSTRAINT FK_DATA
FOREIGN KEY( FK_DATA)
    REFERENCES ALTER_CONS
    ON DELETE CASCADE;
    
ALTER TABLE ALTER_FK_CONS DROP CONSTRAINT FK_DATA; 
-- FOREIGN Ű ����


SELECT * FROM ALTER_TB;

--������ ����
DELETE ALTER_TB;
-- ������ �����ϰ� �ִ�(�뷮����)

-- ������ ����(�뷮���� �پ��� �����.)
TRUNCATE TABLE ALTER_TB;

-- ���̺� ��Ű�� ���� ��� ����
DROP TABLE ALTER_TB;
--------------------------------------------------------------  
 -- COMMENT, �ڸ�Ʈ

 CREATE TABLE TEST_COMMENT(
    BOARDNO NUMBER,
    BTITILE VARCHAR2(100),
    BCONTENT VARCHAR2(400),
    BWRITER VARCHAR2(200),
    BDATE DATE
);

-- ���̺� �ڸ�Ʈ
COMMENT ON TABLE TEST_COMMENT IS '�ڸ�Ʈ �׽�Ʈ - �Խñ�';
SELECT * FROM USER_TAB_COMMENTS
WHERE TABLE_NAME = 'TEST_COMMENT';

-- �÷� �ڸ�Ʈ
COMMENT ON COLUMN TEST_COMMENT.BOARDNO IS '�Խñ� ��ȣ'; 
COMMENT ON COLUMN TEST_COMMENT.BTITILE IS '�Խñ� ����'; 
COMMENT ON COLUMN TEST_COMMENT.BCONTENT IS '�Խñ� ����'; 
COMMENT ON COLUMN TEST_COMMENT.BWRITER IS '�Խñ� �ۼ���'; 
COMMENT ON COLUMN TEST_COMMENT.BDATE IS '�Խñ� �ۼ���'; 

SELECT * FROM USER_TAB_COMMENTS
WHERE TABLE_NAME = 'TEST_COMMENT';


