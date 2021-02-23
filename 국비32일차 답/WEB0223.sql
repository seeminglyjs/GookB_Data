
-- emp���̺� ����(INSERTING), ����(UPDATING), ����(DELETING)�� �߻��ϸ�
--bonus���̺��� �ڵ����� �ݿ��ǵ��� TRIGGER�� �����
-- -> 1���� Ʈ���ŷ� ó���Ѵ�

-- emp���̺��� �÷��� bonus���̺��� �÷��� ���Ͽ�
--emp���̺��� �����Ϳ� bonus���̺��� �����Ͱ� ��ġ�ϵ��� �ۼ��Ѵ�

--  Ʈ�����̸� : emp_to_bonus_trg

SELECT * FROM EMP;
SELECT * FROM BONUS; 
--EANME, JOB, SAL, COMM

--EMP ���̺��� ���������͸� BONUS�� �����ϱ�(����)
INSERT INTO BONUS
SELECT ENAME, JOB, SAL, COMM FROM EMP;

CREATE OR REPLACE TRIGGER EMP_TO_BONUS_TRG
BEFORE INSERT OR UPDATE OR DELETE ON EMP
FOR EACH ROW
BEGIN
    -- :NEW ��ü - EMP ���̺� ���� ���ο� �൥����
    -- :OLD ��ü - EMP ���̺� �����ϴ� ������ �൥����
    
    
    IF INSERTING THEN --EMP���̺� INSERT�� �߻��ϸ� BONUS���� INSERT ����
        INSERT INTO BONUS ( ENAME, JOB, SAL, COMM)
        VALUES( :NEW.ENAME, :NEW.JOB, :NEW.SAL, :NEW.COMM );
        
    ELSIF UPDATING THEN --EMP���̺� UPDATE�� �߻��ϸ� BONUS���� UPDATE ����
        UPDATE BONUS 
        SET ENAME = :NEW.ENAME
            , JOB = :NEW.JOB 
            , SAL = :NEW.SAL
            , COMM = :NEW.COMM
        WHERE ENAME = :OLD.ENAME
            AND JOB = :OLD.JOB
            AND SAL = :OLD.SAL
            AND COMM = :OLD.COMM;
        
    ELSIF DELETING THEN
        DELETE BONUS
           WHERE ENAME = :OLD.ENAME
            AND JOB = :OLD.JOB
            AND SAL = :OLD.SAL
            AND COMM = :OLD.COMM;       
    END IF;
    
END;
/

INSERT INTO EMP(EMPNO, ENAME, JOB, SAL, COMM)
VALUES(4001, 'A', 'B', 100, 200);

SELECT * FROM EMP WHERE EMPNO = 4001;
SELECT * FROM BONUS WHERE ENAME = 'A';

INSERT INTO EMP(EMPNO, ENAME, JOB, SAL, COMM) VALUES ( 4002, 'C', 'D', 300, 400);
UPDATE EMP SET ENAME = 'CC', JOB = 'DD' WHERE EMPNO = 4002;

DELETE EMP WHERE EMPNO = 4002;




---------------------------------------------------------------------------------------
-- + AUTO INCREMENT ����� QUIZ
-- ���̺� ���� : test_tb
--  num NUMBER PK, data VARCHAR2

-- �⺻ ������ ���� : test_seq

-- test_tb�� data �� �����ϸ� �ڵ����� �������� �߰��ǵ��� �Ѵ� (:NEW �� Ȱ��)
--  :NEW ��ü���� INSERT�� ���� ���� ������ ����ִ�

--ex)   INSERT INTO test_tb ( data ) VALUES ( 'Alice' );
--      �� �ڵ带 �����ϸ� num���� �ڵ����� sequence�� nextval�� ���Եǵ��� Ʈ���� �����ϱ�


CREATE TABLE TEST_TB
( NUM NUMBER PRIMARY KEY
, DATA VARCHAR2(20)
);


CREATE SEQUENCE TEST_SEQ;

CREATE OR REPLACE TRIGGER AI_TEST_TB
BEFORE INSERT ON TEST_TB
FOR EACH ROW
BEGIN
    
    SELECT TEST_SEQ.NEXTVAL
    INTO :NEW.NUM
    FROM DUAL;
 
END;
/

INSERT INTO TEST_TB (DATA) VALUES ('TEST');

SELECT * FROM TEST_TB;
