

--���� �ڷ����

SELECT * FROM USER_SYS_PRIVS; -- ����ڰ����� �ο��� �ý��� ����
SELECT * FROM USER_TAB_PRIVS; --����ڰ����� �ο��� ��ü ����

SELECT * FROM DBA_SYS_PRIVS; -- �����ڰ����� �ο��� �ý��� ����
SELECT * FROM DBA_TAB_PRIVS; -- ������ ������ �ο���

--(SCOTT���� �̿�)
--TEST ����ڰ��� �����ϱ� (TEST/1234)
CREATE USER TEST IDENTIFIED BY 1234;

--(SYSTEM�����̿�)
CREATE USER TEST IDENTIFIED BY 1234;

--(SYSTEM�����̿�)
--TEST������ �����ͺ��̽� 
GRANT CREATE SESSION
to test;

SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE = 'TEST';

-- �ý��� ���� ȸ��
REVOKE CREATE SESSION
FROM TEST;


--(SYSTEM�����̿�)
SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE = 'SCOTT';


--ROLE(��) �ڷ����
SELECT * FROM DBA_ROLE_PRIVS
WHERE GRANTEE = 'SCOTT';

-- RESOURCE, CONNECT �ѿ� �ο��� ���� ��ȸ
--> SCOTT���� �ο��� ���ѵ�
SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE IN ( 'RESOURCE', 'CONNECT')
ORDER BY GRANTEE, PRIVILEGE;


--ROLE�� ������ �ý��� ���� ��ȸ
SELECT * FROM DBA_SYS_PRIVS --���� ���� �ο��� �ý��۱���
WHERE grantee IN (
    SELECT granted_role FROM DBA_ROLE_PRIVS
    WHERE grantee=upper('scott') )
UNION
SELECT * FROM DBA_SYS_PRIVS --������ �ο��� �ý��۱���
WHERE grantee=upper('scott');


--(SYSTEM �����̿�)
GRANT RESOURCE, CONNECT
TO TEST;


--(SYSTEM �����̿�)
REVOKE RESOURCE, CONNECT
FROM TEST;

--(SYSTEM �����̿�)
GRANT RESOURCE, CONNECT
TO TEST;

--(scott���� �̿�)
GRANT SELECT --��ü ��ȸ ���� �ο�
ON EMP -- EMP ���̺� ���� ����
TO TEST; -- TSET ������ �ο�




--�ε��� �ڷ����
SELECT * FROM user_indexes
WHERE table_name = 'EMP';

-- �ε����� ����� �÷� �ڷ����

SELECT * FROM user_ind_columns
--WHERE table_name = 'EMP'; -- ���̺� �̸����� ��ȸ
WHERE INDEX_NAME = 'PK_EMP'; -- �ε����̸����� ��ȸ


--SALGRADE ���̺� ����� �ε��� ��ȸ
SELECT * FROM user_indexes
WHERE table_name =  'SALGRADE';

SELECT * FROM SALGRADE;

-- �ε��� ����
CREATE INDEX idx_salgrade
ON SALGRADE ( GRADE) ; 

SELECT * FROM SALGRADE;
INSERT INTO SALGRADE VALUES (5, 777, 8888); -- �ߺ� ���


--�ε��� �����
ALTER INDEX IDX_SALGRADE REBUILD;


--�ε��� ����
DROP INDEX IDX_SALGRADE;

--UNIQUE �ε��� �����
CREATE UNIQUE INDEX IDX_SALGRADE
ON SALGRADE( GRADE);

--�ߺ����� �����Ѵ�.
DELETE FROM SALGRADE 
WHERE HISAL ='8888';

SELECT * FROM SALGRADE;



-- �μ� , �̸��� ��ȸ
SELECT * FROM EMP
WHERE DEPTNO = 10
 AND ENAME = 'MILLER';
 
 -- ���� �÷� �ε���
 CREATE INDEX IDX_EMP_DEPTNO_ENAME
 ON EMP (DEPTNO, ENAME);
 
 --�ε��� ����
DROP INDEX IDX_EMP_DEPTNO_ENAME;




SELECT * FROM 

--(SCOOTT) ���� �̿�
CREATE VIEW TEST_VIEW
AS(
    SELECT * FROM EMP
    WHERE EMPNO < 7600
); -- ���� ���� ��� �ȵ�

--(SYSTEM) ���� �̿� WEB_ADMIN
GRANT CREATE VIEW
TO SCOTT;

--(SCOOTT) ���� �̿� WEB
CREATE VIEW TEST_VIEW
AS(
    SELECT * FROM EMP
    WHERE EMPNO < 7600
); 

-- �� �ڷ����
SELECT * FROM USER_VIEWS
WHERE VIEW_NAME = 'TEST_VIEW';


SELECT * FROM TEST_VIEW;
-- �ζ��� ���.
--SELET * FROM(
--    SELECT * FROM EMP
--    WHERE EMPNO < 7600
--); 


-- �� ������� ���༺
-- CREATE VIEW -- �� ����
-- CREATE OR REPLACE -- ����� OR �� ����

CREATE OR REPLACE VIEW TEST_VIEW
AS (
    SELECT * FROM EMP WHERE EMPNO < 7700
);

INSERT INTO TEST_VIEW (EMPNO, ENAME)
VALUES( 7000, '��TEST');

INSERT INTO TEST_VIEW (EMPNO, ENAME)
VALUES( 9000, '��TEST');
-- �Ⱥ��� ������ �ʰ���

SELECT * FROM EMP 
WHERE EMPNO = 9000;


-- WITH CHECK OPTION �����ϱ�
CREATE OR REPLACE VIEW TEST_VIEW
AS (
    SELECT EMPNO,ENAME FROM EMP WHERE EMPNO < 7700
)
WITH CHECK OPTION;

INSERT INTO TEST_VIEW VALUES ( 7650, 'TEST22');
INSERT INTO TEST_VIEW VALUES ( 7750, 'TEST22'); -- ���� �ʰ��ؼ� �μ�Ʈ �ȵ�


-- ������, Sequence
-- ������ ����
CREATE SEQUENCE SEQ_EMP;
--������ �ڷ����
SELECT * FROM USER_SEQUENCES;



--���� �������� �� : ��������.currval ->(current value)
--���� ������ �� ���� : ��������.nextval ->(next value)

SELECT SEQ_EMP.CURRVAL FROM DUAL;
-- �ѹ��� NEXTVAL�� ���� ������ CURRVAL�� �������� �ʴ´�.

SELECT SEQ_EMP.NEXTVAL FROM DUAL;
SELECT SEQ_EMP.CURRVAL FROM DUAL;

SELECT * FROM USER_VIEWS;

INSERT INTO EMP (EMPNO, ENAME)
VALUES (SEQ_EMP.NEXTVAL, 'SE_NO');

SELECT * FROM EMP WHERE EMPNO < 1000;

-- ������ ����
DROP SEQUENCE SEQ_EMP;



--����(�ɼ�)�� �ο��ؼ� ������ �����ϱ�
CREATE SEQUENCE TEST_SEQ
START WITH 2001 -- ���۰�
INCREMENT BY 100 -- ������
MINVALUE 2001 -- �ּҰ�
MAXVALUE 3000; -- �ִ밪

SELECT TEST_SEQ.NEXTVAL FROM DUAL;

--����, ĳ���� ���ڰ� �� ����Ŭ���� �۾ƾ���
ALTER SEQUENCE TEST_SEQ
CYCLE;


SELECT * FROM USER_SEQUENCES
WHERE SEQUENCE_NAME = 'TEST_SEQ';


-- �ذ�, ĳ���� ũ�⸦ �� ����Ŭ�� �������� �۰� �����Ѵ�.
ALTER SEQUENCE TEST_SEQ
CACHE 5
CYCLE;

SELECT TEST_SEQ.NEXTVAL FROM DUAL;



--	1.
--	MyBoard Table ����
--	  boardno NUMBER, title VARCHAR2(300)
--	SEQ_MyBoard Sequence ����
CREATE TABLE MyBoard (
boardno NUMBER PRIMARY KEY
, title VARCHAR2(300)
);
--DROP TABLE MYBOARD;

CREATE SEQUENCE SEQ_MyBoard;


--	2.
--	AttachFile Table ����
--	  fileno NUMBER, boardno NUMBER, filename VARCHAR2(200)
--	SEQ_AttachFile Sequence ����

CREATE TABLE AttachFile (
fileno NUMBER PRIMARY KEY
, boardno NUMBER
, filename VARCHAR2(200)
, FOREIGN KEY (BOARDNO) 
REFERENCES MYBOARD (BOARDNO) 
);

CREATE SEQUENCE SEQ_AttachFile;

--	** �Խñ۰� ÷�������� ���踦 �������� PK,FK�� ������ ����
--ALTER TABLE MYBOARD ADD PRIMARY KEY(BOARDNO);
--ALTER TABLE ATTACHFILE ADD PRIMARY KEY(FILENO);
--ALTER TABLE ATTACHFILE ADD FOREIGN KEY(BOARDNO)
--REFERENCES MYBOARD(BOARDNO);

--	3. (������ Ȱ���� ��)
--	MyBoard TB�� �Խñ� INSERT
--	AttachFile TB�� ÷������ INSERT
--
--	�Խñ����� : �ȳ��ϼ���
--	÷�����ϸ� : Hello.jpg

INSERT INTO MYBOARD 
VALUES ( SEQ_MyBoard.NEXTVAL, '�ȳ��ϼ���');

INSERT INTO AttachFile 
VALUES ( SEQ_AttachFile.NEXTVAL, SEQ_MyBoard.CURRVAL,'Hello.JPG');
 
SELECT * FROM MYBOARD;
SELECT * FROM AttachFile;


--�����ػ� �ѹ��� Ȯ���ϱ�
SELECT * FROM MYBOARD B, AttachFile A
WHERE B.BOARDNO = A.BOARDNO;

--÷������ ���� �Խñ��� ��ϵǴ� ��Ȳ �׽�Ʈ
INSERT INTO MYBOARD VALUES (SEQ_MYBOARD.NEXTVAL, 'HI');
INSERT INTO MYBOARD VALUES (SEQ_MYBOARD.NEXTVAL, 'HELLO');

SELECT * FROM MYBOARD;

--�ܺ� ���� -- ÷������ ���� �Խñ۸� �ۼ��� ���
SELECT * FROM MYBOARD B, AttachFile A
WHERE B.BOARDNO = A.BOARDNO(+);

DESC ATTACHFILE;
--VIEW ���� �Խñ۰� ÷������ ���� ��
CREATE OR REPLACE VIEW BOARD_WITH_FILE
AS (
    SELECT B.BOARDNO, TITLE, FILENO, FILENAME 
    FROM MYBOARD B, AttachFile A
    WHERE B.BOARDNO = A.BOARDNO(+)
)WITH READ ONLY;

SELECT * FROM BOARD_WITH_FILE;