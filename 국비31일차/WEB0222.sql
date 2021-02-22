--PL/SQL�� ����� ��±���� Ȱ��ȭ�Ѵ�.
SET SERVEROUTPUT ON; -- ������ �½��Ѿ� ����̵ȴ�.
/
--PL/SQL�� �����޽��� ��±�� Ȱ��ȭ
SHOW ERRORS;
/

BEGIN
    --DBMS_OUTPUT.PUT_LINE() : PUT() + NEW_LINE() ��ģ �Լ�
    -- ��µ� �����͸� FLUSH�ϰ�, �ٹٲ��Ѵ�.
    DBMS_OUTPUT.PUT_LINE('HELLO PL/SQL');
    DBMS_OUTPUT.PUT_LINE('EVERY DAY');
    -- LINE�� FLUSH�� ���ԵǾ� �ִ�.


    --DBMS_OUTPUT.PUT () : ����Ϳ� �����͸� ����ϴ� �Լ� FLUSH ���� �ʴ´�.
    -- ���൵ �ȵ�
    DBMS_OUTPUT.PUT('EVERY DAY'); -- ����� �ȵȴ�.
    DBMS_OUTPUT.NEW_LINE();
    --���� �� ���� ����(FLUSH)
      
END;
/
--���� �������� / �� �� ��



--DELCATE ����, ���� ����

DECLARE
    -- ������ ������Ÿ��
    NUM1 NUMBER := 111; -- ���� ����� ���ÿ� ���Ե� ����
    NUM2 NUMBER;
    
    
BEGIN
    DBMS_OUTPUT.PUT_LINE('NUM1 =' || NUM1);
    DBMS_OUTPUT.PUT_LINE('NUM2 =' || NUM2);

    NUM1 := 555; -- �� ����
    NUM2 := 666;

    DBMS_OUTPUT.PUT_LINE('NUM1 =' || NUM1);
    DBMS_OUTPUT.PUT_LINE('NUM2 =' || NUM2);


END;
/

--SELECT �� ��ȸ�� ����� ������ �����ϱ�
DECLARE
    V_DEPTNO NUMBER(2); --DEPTNO�� ������ ����
BEGIN
    SELECT
        DEPTNO INTO V_DEPTNO --< ������ ��ȸ�� ����� ����  
    FROM DEPT
    WHERE DNAME = 'SALES';
    
    DBMS_OUTPUT.PUT_LINE('DEPTNO = ' || V_DEPTNO);
END;
/


DECLARE
    V_DEPTNO DEPT.DEPTNO%TYPE;
    --DEPT.DEPTNO�� ������Ÿ���� �����ؼ� ��������
BEGIN
    SELECT
        DEPTNO INTO V_DEPTNO
    FROM DEPT
    WHERE DNAME = 'RESEARCH';
    
    DBMS_OUTPUT.PUT_LINE('�μ���ȣ : ' || V_DEPTNO);
END;
/

--SQL�� ������ �� Ű���� �Է¹ޱ�
-- -> ' ' ���� ����ǥ�� �����ִ� ���� ����.
SELECT '&DATE' FROM DUAL;


SELECT '&DATE' + 1111 FROM DUAL;

SELECT * FROM DEPT
WHERE DEPTNO = '&DATA';

--�μ���ȣ�� Ű����� �Է¹޾� �μ������� ����ϴ� PL/SQL �͸� ���
DECLARE
    V_DEPTNO DEPT.DEPTNO%TYPE; -- �μ���ȣ ����
    V_DNAME DEPT.DNAME%TYPE; -- �μ��̸� ����
    V_LOC DEPT.LOC%TYPE; -- �μ���ġ ����

BEGIN
    SELECT DEPTNO, DNAME, LOC
    INTO V_DEPTNO, V_DNAME, V_LOC
    FROM DEPT
    WHERE DEPTNO = '&DATA';
    
    DBMS_OUTPUT.PUT('��� : ');
    DBMS_OUTPUT.PUT_LINE(V_DEPTNO ||' ' || V_DNAME ||' '|| V_LOC);
    -- chr(9) : ASCII 9, ������
END;
/

SELECT *FROM EMP; 
DELETE FROM EMP WHERE EMPNO = 8888;

DECLARE
    V_EMPNO EMP.EMPNO%TYPE := '&EMPNO';
    V_ENAME EMP.ENAME%TYPE := '&ENAME';
    V_DEPTNO EMP.DEPTNO%TYPE := '&DEPTNO';
BEGIN
    INSERT INTO EMP(EMPNO, ENAME, DEPTNO)
    VALUES( V_EMPNO, V_ENAME, V_DEPTNO);
    
    SELECT EMPNO, ENAME, DEPTNO
    INTO V_EMPNO, V_ENAME, V_DEPTNO
    FROM EMP
--    WHERE EMPNO = '&DATA';
    WHERE EMPNO = V_EMPNO;

    DBMS_OUTPUT.PUT_LINE(V_EMPNO ||' '||V_ENAME ||' '||V_DEPTNO );

END;
/


-- ���ǹ�
BEGIN
    IF FALSE THEN
        DBMS_OUTPUT.PUT_LINE('���ǹ� IF');
     ELSIF FALSE THEN
        DBMS_OUTPUT.PUT_LINE('���ǹ�  ELSIF');
    ELSE
        DBMS_OUTPUT.PUT_LINE('���ǹ� ELSE');
    END IF;
    
        DBMS_OUTPUT.PUT_LINE('���ǹ� �׽�Ʈ �Ϸ�');
END;
/


-- �����ȣ�� Ű����� �Է¹޾� �μ� ��ȣ�� ��ȸ�� ��
-- �μ� ��ȣ�� ���� �μ����� ����ϴ� PL/SQL���� �ۼ��ϱ�

DECLARE
    V_ENAME EMP.ENAME%TYPE; -- ����̸�
    V_DEPTNO EMP.DEPTNO%TYPE; --�μ���ȣ
BEGIN
    SELECT ENAME, DEPTNO
    INTO V_ENAME, V_DEPTNO
    FROM EMP
    WHERE EMPNO = '&EMPNO';
    
    DBMS_OUTPUT.PUT_LINE(V_ENAME);
    IF V_DEPTNO = 10 THEN
        DBMS_OUTPUT.PUT_LINE('��ī���� �μ�');
    ELSIF V_DEPTNO =20 THEN
        DBMS_OUTPUT.PUT_LINE('����ġ �μ�');
    ELSIF V_DEPTNO = 30 THEN
        DBMS_OUTPUT.PUT_LINE('��ī���� �μ�');
    ELSIF V_DEPTNO = 40 THEN
        DBMS_OUTPUT.PUT_LINE('��ī���� �μ�');
    ELSE
        DBMS_OUTPUT.PUT_LINE('�μ�����');
    END IF;
       
END;
/

-----------------------------------
-- LOOP
-- ���ѹݺ�
-- + EXIT�ڵ� �ʿ�

DECLARE
    I NUMBER := 0;-- �ʱⰪ
    
BEGIN
    LOOP
       EXIT WHEN I >= 10;
        DBMS_OUTPUT.PUT_LINE(I); -- �ݺ�����
       
        I := I+ 1; --������
    END LOOP;
    
END;
/



-- FOR LOOP
BEGIN
    FOR I IN 1..10
    LOOP
        DBMS_OUTPUT.PUT(I || ' ');
    END LOOP;
    
            DBMS_OUTPUT.NEW_LINE();

END;
/




--FOR LOOP LIST

BEGIN
    FOR DEPT_LIST IN(
        SELECT * FROM DEPT
        ORDER BY DEPTNO
    )
    LOOP
        DBMS_OUTPUT.PUT(DEPT_LIST.DEPTNO);  
        DBMS_OUTPUT.PUT(CHR(9));  
        DBMS_OUTPUT.PUT(DEPT_LIST.DNAME);  
        DBMS_OUTPUT.PUT(CHR(9));  
        DBMS_OUTPUT.PUT_LINE(DEPT_LIST.LOC);  
    END LOOP;
END;
/



-- ���ǿ� ���� LOOP -WHILE
DECLARE
    I NUMBER := 0;

BEGIN
    WHILE I < 5
    LOOP
        DBMS_OUTPUT.PUT( I || ' ' );
        I := I + 1;
    END LOOP;
        DBMS_OUTPUT.NEW_LINE();
END;
/




-----------------------------------------
-- ���� ���ν���

CREATE OR REPLACE
PROCEDURE PROC_GET_DEPT(
    P_DEPTNO    IN DEPT.DEPTNO%TYPE := 10
)
IS
    V_DNAME DEPT.DNAME%TYPE;
BEGIN
    SELECT DNAME
    INTO V_DNAME
    FROM DEPT
    WHERE DEPTNO = P_DEPTNO;
    
    DBMS_OUTPUT.PUT_LINE(V_DNAME);
END;
/


EXEC PROC_GET_DEPT(30);
EXECUTE PROC_GET_DEPT(30);

BEGIN
    PROC_GET_DEPT(30);
END;
/

-- IN���� �ʱⰪ�� ������ �Ű�����
-- ���� �־����� �ʾƵ� �����Ѵ�.
EXEC PROC_GET_DEPT();

-- / : EOF, PL/SQL �ڵ� �Ѱ��� ���� ǥ���Ѵ�.
-- ; : SQL ���� �� ���� ���� ǥ���Ѵ�.

CREATE OR REPLACE PROCEDURE PROC_GET_DEPT2
(
    P_DEPTNO IN DEPT.DEPTNO%TYPE
    , P_DNAME OUT DEPT.DNAME%TYPE
)
IS
    V_DNAME DEPT.DNAME%TYPE;
BEGIN
-- IN���� ������ �Ű������� ������ �� ����(�б� �������� ���ȴ�)
--   P_DEPTNO := 10
    
    SELECT DNAME INTO V_DNAME
    FROM DEPT
    WHERE DEPTNO = P_DEPTNO;
    
    -- OUT���� ������ �Ű��������� ���� ������ �� �ִ�. (���� ����)
    P_DNAME := V_DNAME;

END;
/
-- ����, OUT �Ű������� ���� ������ �ݵ�� �ʿ��ϴ�.
-- ����� ���Ұ�
-- OUT�� ���ν��� ���ο����� �Ű������� ���� �� �ִ�.
EXEC PROC_GET_DEPT2(20,'TEST');


DECLARE
    RES DEPT.DNAME%TYPE;
BEGIN
    PROC_GET_DEPT2(30,RES);
    
    DBMS_OUTPUT.PUT_LINE('DRAPRTMENT NAME -> ' || RES);
END;
/

CREATE OR REPLACE PROCEDURE PROC_INOUT_TEST
(
    P_VAL1 IN VARCHAR2
    ,P_VAL2 OUT VARCHAR2
    ,P_VAL3 IN OUT VARCHAR2
)
IS
BEGIN
    -- ���޵� �� ����ϱ�
    DBMS_OUTPUT.PUT_LINE('BEFORE P_VAL1' || P_VAL1);
    DBMS_OUTPUT.PUT_LINE('BEFORE P_VAL2' || P_VAL2);
    DBMS_OUTPUT.PUT_LINE('BEFORE P_VAL3' || P_VAL3);
    -- �Ű������� �� �����ϱ� (RETURN ������ ����

   -- P_VAL1 := 'A'; -- ������ ����, IN�Ű������� �� ������ �� ����.
    P_VAL2 := 'B';
    P_VAL3 := 'C';
    
END;
/

DECLARE
    RES_VAR1 VARCHAR2(10) := 'ALICE';
    RES_VAR2 VARCHAR2(10) := 'BPB';
    RES_VAR3 VARCHAR2(10) := 'CLARE';
BEGIN
    PROC_INOUT_TEST(RES_VAR1, RES_VAR2, RES_VAR3);
    
    DBMS_OUTPUT.PUT_LINE('AFTER RES_VAR1 ' || RES_VAR1);
    DBMS_OUTPUT.PUT_LINE('AFTER RES_VAR2 ' || RES_VAR2);
    DBMS_OUTPUT.PUT_LINE('AFTER RES_VAR3 ' || RES_VAR3);
    
END;
/






CREATE OR REPLACE PROCEDURE INIT_DEPT
(  
    P_DEPTNO IN DEPT.DEPTNO%TYPE
    ,P_DNAME IN DEPT.DNAME%TYPE :='UNKNOWN'
    ,P_LOC IN DEPT.LOC%TYPE :='UNKNOWN'
)
IS
BEGIN
    INSERT INTO DEPT(DEPTNO,DNAME, LOC)
    VALUES(P_DEPTNO, P_DNAME, P_LOC);
END;
/

EXEC INIT_DEPT(60);
EXEC INIT_DEPT(70, 'TEST');
EXEC INIT_DEPT(80, 'A', 'B');
EXEC INIT_DEPT(90, NULL, 'TTT');

SELECT * FROM DEPT;


----------------------------------------------------------------------------------
--�Լ� FUNCTION

CREATE OR REPLACE FUNCTION MY_FUNC
RETURN VARCHAR2 -- ��ȯ Ÿ��
IS
    V_DATA VARCHAR2(50);
BEGIN
    V_DATA := 'BASIC FUNCTION';
    
    RETURN V_DATA;
END;
/


SELECT MY_FUNC() FROM DUAL;

SELECT EMPNO, ENAME, MY_FUNC() RES FROM EMP
ORDER BY EMPNO;


CREATE OR REPLACE FUNCTION MY_FUNC2
(  NUM NUMBER , DATA VARCHAR2 )
RETURN VARCHAR2
IS
    V_RESULT NUMBER;
BEGIN
    V_RESULT := NUM + 10;
    RETURN DATA || ' : ' || V_RESULT;
END;
/

SELECT MY_FUNC2(100, 'GGG') FROM DUAL;



-- �μ���ȣ�� �����ϸ� �μ��̸��� ��ȯ�Ѵ�.
CREATE OR REPLACE FUNCTION GET_NAME
( P_DEPTNO DEPT.DEPTNO%TYPE )-- �μ���ȣ �Ű�����
RETURN VARCHAR2
IS
    V_DNAME DEPT.DNAME%TYPE; -- ��ȯ�� �μ��̸� ����
BEGIN
    -- �������ڷ� ���޵� �μ���ȣ�� �̿��� �μ��̸� ��ȸ
    --��ȸ�� �μ����� ������ ����
    SELECT DNAME INTO V_DNAME
    FROM DEPT
    WHERE DEPTNO = P_DEPTNO;
    
    RETURN V_DNAME; -- �μ��� ��ȯ
END;
/

SELECT GET_NAME(40) DNAME FROM DUAL;
SELECT * FROM EMP;

SELECT E.*, GET_NAME(DEPTNO) FROM EMP E
ORDER BY DEPTNO, EMPNO;

--�ڷ����
SELECT * FROM ALL_OBJECTS
WHERE OWNER = 'SCOTT';

SELECT * FROM ALL_SOURCE; -- ��ü�� ����� ��� �ڵ�

SELECT * FROM ALL_SOURCE
WHERE OWNER = 'SCOTT'
ORDER BY NAME, LINE;


--Ʈ����
--EMP���̺� INSERT�� �����ϸ� INSERT�� ���صǱ��� TRIGGER�� ����
CREATE OR REPLACE TRIGGER EMP_TRG
BEFORE INSERT ON EMP
BEGIN
    DBMS_OUTPUT.PUT_LINE('BEFORE INSERT INTO EMP');
END;
/

INSERT INTO EMP (EMPNO, ENAME, DEPTNO) VALUES (3001,'TEIGGER', 40);
INSERT INTO EMP (EMPNO, ENAME, DEPTNO) VALUES (3002,'TEIGGER', 30);

--EMP ���̺� INSERT �Ǵ� UPDATE�� �߻��ϸ� DML�ڵ� �������� �����ϴ� Ʈ����
-- ** ������� ���� ����ŭ Ʈ���Ű� �ݺ������ϵ��� ����
CREATE OR REPLACE TRIGGER EMP_TRG2
AFTER INSERT OR UPDATE ON EMP
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('IT IS TGI');
END;
/

INSERT INTO EMP (EMPNO, ENAME, DEPTNO)
VALUES(3004, 'DFDF', 60);

SELECT * FROM EMP
--UPDATE EMP SET JOB ='A'
WHERE EMPNO BETWEEN 1000 AND 4000;



-- Ʈ���ſ��� ����ϴ� �����Ͱ�ü, :  NEW, :OLD
-- :NEW - ��ȭ�Ǵ� ���ο� ��
-- :OLD - ��ȭ�Ǵ� ������ ��
-- :NEW - INSERT, UPDATE �������� Ȯ���� �� ����, ���̺� �ݿ��Ǵ� ��
-- :OLD - DELETE, UPDATE �������� Ȯ���� �� ����, ���̺��� �������� ��

CREATE OR REPLACE TRIGGER OLD_NEW
BEFORE UPDATE ON DEPT
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE ( :OLD.DEPTNO || ' : ' || :NEW.DEPTNO);
    DBMS_OUTPUT.PUT_LINE ( :OLD.DNAME || ' : ' || :NEW.DNAME);
    DBMS_OUTPUT.PUT_LINE ( :OLD.LOC || ' : ' || :NEW.LOC);
END;
/

SELECT * FROM DEPT
--UPDATE DEPT SET DEPTNO = 71, DNAME = 'TRG', LOC='SEOUL'
WHERE DEPTNO = 70;
-- OLD - > 70/ UNKNOWN/ UNKNOWN
-- NEW -> 71/ TRG/ TEST


---------------------------------------------------------------------------
--Ʈ���� INSERTING, UPDATING, DELETING Ű����
--Ʈ���Ű� �ߵ��� �̺�Ʈ DML������ ���� TRUE, FALSE�� ��ȯ�Ѵ�.
-- -> IF ����� ���� ����Ѵ�.

CREATE OR REPLACE TRIGGER TEST_TRG
BEFORE INSERT OR UPDATE OR DELETE ON SALGRADE
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('TRG RUNNING');
    
    IF INSERTING THEN
    DBMS_OUTPUT.PUT_LINE('INSERT RUNNING');
    ELSIF UPDATING THEN
    DBMS_OUTPUT.PUT_LINE('UPDATE RUNNING');
    ELSIF DELETING THEN
    DBMS_OUTPUT.PUT_LINE('DELETE RUNNING');
    END IF;
END;
/


INSERT INTO SALGRADE VALUES(8, 5555, 6666);
UPDATE SALGRADE SET LOSAL=6666, HISAL= 7777 WHERE GRADE = 8;
DELETE SALGRADE WHERE GRADE = 8;
