--PL/SQL의 모니터 출력기능을 활성화한다.
SET SERVEROUTPUT ON; -- 서버를 온시켜야 출력이된다.
/
--PL/SQL의 에러메시지 출력기능 활성화
SHOW ERRORS;
/

BEGIN
    --DBMS_OUTPUT.PUT_LINE() : PUT() + NEW_LINE() 합친 함수
    -- 출력된 데이터를 FLUSH하고, 줄바꿈한다.
    DBMS_OUTPUT.PUT_LINE('HELLO PL/SQL');
    DBMS_OUTPUT.PUT_LINE('EVERY DAY');
    -- LINE에 FLUSH가 포함되어 있다.


    --DBMS_OUTPUT.PUT () : 모니터에 데이터를 출력하는 함수 FLUSH 되지 않는다.
    -- 개행도 안됨
    DBMS_OUTPUT.PUT('EVERY DAY'); -- 출력이 안된다.
    DBMS_OUTPUT.NEW_LINE();
    --개행 및 버퍼 비우기(FLUSH)
      
END;
/
--구문 마지막에 / 꼭 쓸 것



--DELCATE 구문, 변수 선언

DECLARE
    -- 변수명 데이터타입
    NUM1 NUMBER := 111; -- 변수 선언과 동시에 대입도 가능
    NUM2 NUMBER;
    
    
BEGIN
    DBMS_OUTPUT.PUT_LINE('NUM1 =' || NUM1);
    DBMS_OUTPUT.PUT_LINE('NUM2 =' || NUM2);

    NUM1 := 555; -- 값 대입
    NUM2 := 666;

    DBMS_OUTPUT.PUT_LINE('NUM1 =' || NUM1);
    DBMS_OUTPUT.PUT_LINE('NUM2 =' || NUM2);


END;
/

--SELECT 로 조회한 결과를 변수에 저장하기
DECLARE
    V_DEPTNO NUMBER(2); --DEPTNO를 저장할 변수
BEGIN
    SELECT
        DEPTNO INTO V_DEPTNO --< 변수에 조회된 결과값 삽입  
    FROM DEPT
    WHERE DNAME = 'SALES';
    
    DBMS_OUTPUT.PUT_LINE('DEPTNO = ' || V_DEPTNO);
END;
/


DECLARE
    V_DEPTNO DEPT.DEPTNO%TYPE;
    --DEPT.DEPTNO의 데이터타입을 적용해서 변수선언
BEGIN
    SELECT
        DEPTNO INTO V_DEPTNO
    FROM DEPT
    WHERE DNAME = 'RESEARCH';
    
    DBMS_OUTPUT.PUT_LINE('부서번호 : ' || V_DEPTNO);
END;
/

--SQL을 수행할 때 키보드 입력받기
-- -> ' ' 작은 따옴표를 씌워주는 것이 좋다.
SELECT '&DATE' FROM DUAL;


SELECT '&DATE' + 1111 FROM DUAL;

SELECT * FROM DEPT
WHERE DEPTNO = '&DATA';

--부서번호를 키보드로 입력받아 부서정보를 출력하는 PL/SQL 익명 블록
DECLARE
    V_DEPTNO DEPT.DEPTNO%TYPE; -- 부서번호 변수
    V_DNAME DEPT.DNAME%TYPE; -- 부서이름 변수
    V_LOC DEPT.LOC%TYPE; -- 부서위치 변수

BEGIN
    SELECT DEPTNO, DNAME, LOC
    INTO V_DEPTNO, V_DNAME, V_LOC
    FROM DEPT
    WHERE DEPTNO = '&DATA';
    
    DBMS_OUTPUT.PUT('결과 : ');
    DBMS_OUTPUT.PUT_LINE(V_DEPTNO ||' ' || V_DNAME ||' '|| V_LOC);
    -- chr(9) : ASCII 9, 수평탭
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


-- 조건문
BEGIN
    IF FALSE THEN
        DBMS_OUTPUT.PUT_LINE('조건문 IF');
     ELSIF FALSE THEN
        DBMS_OUTPUT.PUT_LINE('조건문  ELSIF');
    ELSE
        DBMS_OUTPUT.PUT_LINE('조건문 ELSE');
    END IF;
    
        DBMS_OUTPUT.PUT_LINE('조건문 테스트 완료');
END;
/


-- 사원번호를 키보드로 입력받아 부서 번호를 조회한 후
-- 부서 번호에 따라 부서명을 출력하는 PL/SQL구문 작성하기

DECLARE
    V_ENAME EMP.ENAME%TYPE; -- 사원이름
    V_DEPTNO EMP.DEPTNO%TYPE; --부서번호
BEGIN
    SELECT ENAME, DEPTNO
    INTO V_ENAME, V_DEPTNO
    FROM EMP
    WHERE EMPNO = '&EMPNO';
    
    DBMS_OUTPUT.PUT_LINE(V_ENAME);
    IF V_DEPTNO = 10 THEN
        DBMS_OUTPUT.PUT_LINE('어카운팅 부서');
    ELSIF V_DEPTNO =20 THEN
        DBMS_OUTPUT.PUT_LINE('리서치 부서');
    ELSIF V_DEPTNO = 30 THEN
        DBMS_OUTPUT.PUT_LINE('어카운팅 부서');
    ELSIF V_DEPTNO = 40 THEN
        DBMS_OUTPUT.PUT_LINE('어카운팅 부서');
    ELSE
        DBMS_OUTPUT.PUT_LINE('부서없음');
    END IF;
       
END;
/

-----------------------------------
-- LOOP
-- 무한반복
-- + EXIT코드 필요

DECLARE
    I NUMBER := 0;-- 초기값
    
BEGIN
    LOOP
       EXIT WHEN I >= 10;
        DBMS_OUTPUT.PUT_LINE(I); -- 반복구문
       
        I := I+ 1; --증감문
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



-- 조건에 따른 LOOP -WHILE
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
-- 저장 프로시저

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

-- IN에서 초기값이 있으면 매개값을
-- 따로 넣어주지 않아도 동작한다.
EXEC PROC_GET_DEPT();

-- / : EOF, PL/SQL 코드 한개의 끝을 표현한다.
-- ; : SQL 구문 한 개의 끝을 표현한다.

CREATE OR REPLACE PROCEDURE PROC_GET_DEPT2
(
    P_DEPTNO IN DEPT.DEPTNO%TYPE
    , P_DNAME OUT DEPT.DNAME%TYPE
)
IS
    V_DNAME DEPT.DNAME%TYPE;
BEGIN
-- IN으로 설정한 매개변수에 대입할 수 없다(읽기 전용으로 사용된다)
--   P_DEPTNO := 10
    
    SELECT DNAME INTO V_DNAME
    FROM DEPT
    WHERE DEPTNO = P_DEPTNO;
    
    -- OUT으로 설정한 매개변수에는 값을 대입할 수 있다. (쓰기 가능)
    P_DNAME := V_DNAME;

END;
/
-- 에러, OUT 매개변수로 사용될 변수가 반드시 필요하다.
-- 상수값 사용불가
-- OUT은 프로시저 내부에서만 매개변수를 넣을 수 있다.
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
    -- 전달된 값 출력하기
    DBMS_OUTPUT.PUT_LINE('BEFORE P_VAL1' || P_VAL1);
    DBMS_OUTPUT.PUT_LINE('BEFORE P_VAL2' || P_VAL2);
    DBMS_OUTPUT.PUT_LINE('BEFORE P_VAL3' || P_VAL3);
    -- 매개변수에 값 대입하기 (RETURN 값으로 사용됨

   -- P_VAL1 := 'A'; -- 컴파일 에러, IN매개변수에 값 대입할 수 없다.
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
--함수 FUNCTION

CREATE OR REPLACE FUNCTION MY_FUNC
RETURN VARCHAR2 -- 반환 타입
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



-- 부서번호를 전달하면 부서이름을 반환한다.
CREATE OR REPLACE FUNCTION GET_NAME
( P_DEPTNO DEPT.DEPTNO%TYPE )-- 부서번호 매개변수
RETURN VARCHAR2
IS
    V_DNAME DEPT.DNAME%TYPE; -- 반환될 부서이름 변수
BEGIN
    -- 전달인자로 전달된 부서번호를 이용한 부서이름 조회
    --조회된 부서명을 변수에 저장
    SELECT DNAME INTO V_DNAME
    FROM DEPT
    WHERE DEPTNO = P_DEPTNO;
    
    RETURN V_DNAME; -- 부서명 반환
END;
/

SELECT GET_NAME(40) DNAME FROM DUAL;
SELECT * FROM EMP;

SELECT E.*, GET_NAME(DEPTNO) FROM EMP E
ORDER BY DEPTNO, EMPNO;

--자료사전
SELECT * FROM ALL_OBJECTS
WHERE OWNER = 'SCOTT';

SELECT * FROM ALL_SOURCE; -- 객체에 저장된 모든 코드

SELECT * FROM ALL_SOURCE
WHERE OWNER = 'SCOTT'
ORDER BY NAME, LINE;


--트리거
--EMP테이블에 INSERT를 수행하면 INSERT가 실해되기전 TRIGGER가 동작
CREATE OR REPLACE TRIGGER EMP_TRG
BEFORE INSERT ON EMP
BEGIN
    DBMS_OUTPUT.PUT_LINE('BEFORE INSERT INTO EMP');
END;
/

INSERT INTO EMP (EMPNO, ENAME, DEPTNO) VALUES (3001,'TEIGGER', 40);
INSERT INTO EMP (EMPNO, ENAME, DEPTNO) VALUES (3002,'TEIGGER', 30);

--EMP 테이블에 INSERT 또는 UPDATE가 발생하면 DML코드 수행직후 동작하는 트리거
-- ** 영향받은 행의 수만큼 트리거가 반복동작하도록 설정
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



-- 트리거에서 사용하는 데이터객체, :  NEW, :OLD
-- :NEW - 변화되는 새로운 값
-- :OLD - 변화되는 기존의 값
-- :NEW - INSERT, UPDATE 구문에서 확인할 수 있음, 테이블에 반영되는 행
-- :OLD - DELETE, UPDATE 구문에서 확인할 수 있음, 테이블에서 없어지는 행

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
--트리거 INSERTING, UPDATING, DELETING 키워드
--트리거가 발동한 이벤트 DML구문에 따라서 TRUE, FALSE를 반환한다.
-- -> IF 제어문과 같이 사용한다.

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
