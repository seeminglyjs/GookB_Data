
-- emp테이블에 삽입(INSERTING), 수정(UPDATING), 삭제(DELETING)이 발생하면
--bonus테이블에도 자동으로 반영되도록 TRIGGER를 만든다
-- -> 1개의 트리거로 처리한다

-- emp테이블의 컬럼과 bonus테이블의 컬럼을 비교하여
--emp테이블의 데이터와 bonus테이블의 데이터가 일치하도록 작성한다

--  트리거이름 : emp_to_bonus_trg

SELECT * FROM EMP;
SELECT * FROM BONUS; 
--EANME, JOB, SAL, COMM

--EMP 테이블의 기존데이터를 BONUS로 복사하기(삽입)
INSERT INTO BONUS
SELECT ENAME, JOB, SAL, COMM FROM EMP;

CREATE OR REPLACE TRIGGER EMP_TO_BONUS_TRG
BEFORE INSERT OR UPDATE OR DELETE ON EMP
FOR EACH ROW
BEGIN
    -- :NEW 객체 - EMP 테이블에 들어온 새로운 행데이터
    -- :OLD 객체 - EMP 테이블에 존재하던 기존의 행데이터
    
    
    IF INSERTING THEN --EMP테이블에 INSERT가 발생하면 BONUS에서 INSERT 수행
        INSERT INTO BONUS ( ENAME, JOB, SAL, COMM)
        VALUES( :NEW.ENAME, :NEW.JOB, :NEW.SAL, :NEW.COMM );
        
    ELSIF UPDATING THEN --EMP테이블에 UPDATE가 발생하면 BONUS에서 UPDATE 수행
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
-- + AUTO INCREMENT 만들기 QUIZ
-- 테이블 생성 : test_tb
--  num NUMBER PK, data VARCHAR2

-- 기본 시퀀스 생성 : test_seq

-- test_tb에 data 를 삽입하면 자동으로 시퀀스가 추가되도록 한다 (:NEW 를 활용)
--  :NEW 객체에는 INSERT에 사용될 행의 정보가 들어있다

--ex)   INSERT INTO test_tb ( data ) VALUES ( 'Alice' );
--      이 코드를 실행하면 num에는 자동으로 sequence의 nextval이 삽입되도록 트리거 생성하기


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
