

-- ROWNUM 키워드

SELECT ROWNUM, EMPNO, ENAME
FROM EMP
WHERE ROWNUM BETWEEN 1 AND 5
ORDER BY EMPNO;

SELECT EMPNO, ENAME
FROM EMP
WHERE ROWNUM BETWEEN 1 AND 5
ORDER BY EMPNO;

SELECT ROWNUM, *
FROM EMP; -- 에러발생
-- * 에 ROWNUM이 포함되어 있음

SELECT ROWNUM, EMP.*
FROM EMP; 


-- ROWNUM을 사용하 때에는 조회하는 테이블의 컬럼들만
--따로 지정해주어야 한다.
SELECT ROWNUM, E.*FROM EMP E;

-- 조인문에 ROWNUM 붙이는 방법
SELECT rownum, R.* FROM (
    SELECT
        empno, ename, job, mgr, hiredate, sal, comm, E.deptno
        , dname, loc
    FROM emp E, dept D
    WHERE E.deptno = D.deptno
) R;


--잘못 사용한 경우
--SELECT 절에서 ROWNU을 통해 먼저 행번호가 붙은 이후에
--ORDER BY 절에서 이미 만들어진 ROWNUM컬럼을 포함하여 정렬이 이루어진다.
SELECT ROWNUM, E.*
FROM EMP E
ORDER BY SAL DESC NULLS LAST;

-- ORDER BY 문제 해결
SELECT ROWNUM SAL_RANK, E.* FROM(
    SELECT * FROM EMP
    WHERE DEPTNO = 30
    ORDER BY SAL DESC NULLS LAST
)E
--WHERE ROWNUM BETWEEN 1 AND 3
WHERE ROWNUM BETWEEN 3 AND 5
;
-- ROWNUM키워드는 1부터 순서대로 행번호를 생성한다.
-- 중간값부터 꺼내 사용할 수 없다.

-- ROWNUM의 WHERE절 사용문제 해결
SELECT * FROM(
    SELECT ROWNUM SAL_RANK, E.* FROM(
    SELECT * FROM EMP
    WHERE DEPTNO = 30
    ORDER BY SAL DESC NULLS LAST
    )E
)R
WHERE SAL_RANK BETWEEN 3 AND 5;


--입사날짜가 가자 오래된 3명 조회하기
SELECT * FROM(
    SELECT ROWNUM RNUM, E.* FROM(
        SELECT HIREDATE, ENAME
        FROM EMP
        ORDER BY HIREDATE) E
        ) R
WHERE RNUM BETWEEN 1 AND 3;







-- OVER ()
SELECT EMPNO, ENAME, SAL
FROM EMP
ORDER BY SAL DESC NULLS LAST;

-- 부서별 급여 순 정렬
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
ORDER BY DEPTNO, SAL DESC NULLS LAST;


-- OVER 를 이용한 그룹함수 처리
SELECT EMPNO, ENAME, SAL, DEPTNO
    , SUM(SAL) 
    OVER( ORDER BY SAL DESC NULLS LAST) SUM_SAL
FROM EMP;
-- 누적합계가 나온다.


-- OVER 를 이용한 PATITION BY
SELECT EMPNO, ENAME, SAL, DEPTNO
    , SUM(SAL) 
    OVER( PARTITION BY DEPTNO) SUM_SAL
FROM EMP;
-- 같은 부서끼리 나누어서 합계를 구한다.
-- GROUP BY는 한개의 데이터를 출력
-- 반면에 PATITION BY 행마다 그룹화된 값을 준다.


-- OVER 를 이용한 그룹함수 처리
SELECT EMPNO, ENAME, SAL, DEPTNO
    , SUM(SAL) 
    OVER( PARTITION BY DEPTNO ORDER BY SAL DESC NULLS LAST) SUM_SAL
FROM EMP;
-- 그룹별 누적합계가 나온다.

-- 부서별 인원수
SELECT EMPNO, ENAME, SAL, DEPTNO
    , COUNT(*) 
    OVER( PARTITION BY DEPTNO ) SUM_SAL
FROM EMP
ORDER BY DEPTNO;



--ROW_NUMBER ()  : 행번호 적용

SELECT
    EMPNO, ENAME, SAL, DEPTNO
    ,ROW_NUMBER () OVER ( ORDER BY SAL DESC NULLS LAST) RUNM
FROM EMP;

SELECT * FROM( 
SELECT
    EMPNO, ENAME, SAL, DEPTNO
    ,ROW_NUMBER () OVER ( ORDER BY SAL DESC NULLS LAST) RUNM
FROM EMP)
WHERE RUNM <= 3;


SELECT
    EMPNO, ENAME, SAL, DEPTNO
    ,ROW_NUMBER () OVER ( ORDER BY SAL DESC NULLS LAST) RUNM
    ,RANK () OVER ( ORDER BY SAL DESC NULLS LAST) RANK
    ,DENSE_RANK () OVER ( ORDER BY SAL DESC NULLS LAST) D_RANK
FROM EMP;

-- RANK OVER 를 이용한 TOP-N 분석
SELECT * FROM(
    SELECT EMPNO, ENAME, SAL
    , RANK () OVER(ORDER BY SAL DESC NULLS LAST)  RANK
    FROM EMP
    ) R
WHERE RANK BETWEEN 1 AND 5;



-- 다중 행 서브쿼리

SELECT DISTINCT SAL
FROM EMP
WHERE JOB = 'SALESMAN'
ORDER BY SAL;

SELECT * FROM EMP
WHERE SAL IN ( 1250, 1500, 1600);

SELECT * FROM EMP
WHERE SAL IN ( SELECT DISTINCT SAL
FROM EMP
WHERE JOB = 'SALESMAN')
-- 서브쿼리에서 ORDER BY절 사용하면 안된다.
;

--사장이 속한 부서번호 조회하기
SELECT DEPTNO FROM EMP
WHERE JOB = 'PRESIDENT';

SELECT * FROM EMP
WHERE DEPTNO IN (
    SELECT DEPTNO FROM EMP
    WHERE JOB = 'PRESIDENT');




SELECT * FROM EMP
WHERE SAL > ANY ( -- SAL > 1250 / SAL > 1500 / SAL > 1600
    SELECT DISTINCT SAL -- 1250, 1500, 1600 
    FROM EMP
    WHERE JOB = 'SALESMAN');
    
    
SELECT * FROM EMP
WHERE SAL < ANY ( -- SAL < 1250 / SAL < 1500 / SAL < 1600
    SELECT DISTINCT SAL -- 1250, 1500, 1600 
    FROM EMP
    WHERE JOB = 'SALESMAN');    
    
SELECT * FROM EMP
WHERE SAL = ANY ( -- SAL = 1250 / SAL = 1500 / SAL = 1600
    SELECT DISTINCT SAL -- 1250, 1500, 1600 
    FROM EMP
    WHERE JOB = 'SALESMAN');    
  -- IN 과 같은 의미로 사용된다.  
    


--ALL

SELECT * FROM EMP
WHERE SAL > ALL ( 
    SELECT DISTINCT SAL -- 1250, 1500, 1600 
    FROM EMP
    WHERE JOB = 'SALESMAN');
    
    
SELECT * FROM EMP
WHERE SAL < ALL ( 
    SELECT DISTINCT SAL -- 1250, 1500, 1600 
    FROM EMP
    WHERE JOB = 'SALESMAN');    



SELECT * FROM EMP
WHERE SAL = ALL ( --의미없음, 동시에 여러 개의 값과 같을 수 없다.
    SELECT DISTINCT SAL -- 1250, 1500, 1600 
    FROM EMP
    WHERE JOB = 'SALESMAN');
    
    
    
    
--EXISTS 연산자
SELECT DISTINCT MGR
FROM EMP
ORDER BY MGR;

-- 매니저(관리자) 역할을 수행중인 사원 정보를 조회하기
SELECT * FROM EMP
WHERE EMPNO IN(
    SELECT DISTINCT MGR
    FROM EMP
);
    
    
--EXISTS를 이용한 조회
SELECT * FROM EMP E
WHERE EXISTS(
    SELECT * FROM EMP M -- EXISTS의 서브쿼리에서 컬럼지정은 큰 의미가 없다.
    WHERE E.EMPNO = M.MGR 
    --EXISTS의 조회결과로 판단하는 기준은 상호연관 조건이다.
);

--사원들이 근무중인 부서 조회 IN
SELECT * FROM DEPT D
WHERE DEPTNO IN(SELECT DEPTNO FROM EMP);

--사원들이 근무중인 부서 조회 EXISTS   
SELECT * FROM DEPT D
WHERE EXISTS (
    SELECT DEPTNO FROM EMP E
    WHERE D. DEPTNO =  E.DEPTNO );
    
    
-- 다중 열 서브쿼리

--부서 별 최고 임금
SELECT DEPTNO, MAX(SAL) FROM EMP
GROUP BY DEPTNO;
   
-- 부서 별 최고 임금을 받고있는 사원의 정보를 조회하기
SELECT DEPTNO, EMPNO, ENAME , SAL
FROM EMP
WHERE (DEPTNO, SAL) IN ( 
    SELECT DEPTNO, MAX(SAL) FROM EMP
    GROUP BY DEPTNO);

--SQL  조인
SELECT E.DEPTNO, EMPNO, ENAME , SAL
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO -- 조인조건
    AND (E.DEPTNO, SAL) IN ( 
    SELECT DEPTNO, MAX(SAL) FROM EMP
    GROUP BY DEPTNO)
ORDER BY DEPTNO, EMPNO;

-- ANSI
SELECT E.DEPTNO, EMPNO, ENAME , SAL
FROM EMP E
INNER JOIN DEPT D
ON E.DEPTNO = D.DEPTNO -- 조인조건
    AND (E.DEPTNO, SAL) IN ( 
    SELECT DEPTNO, MAX(SAL) FROM EMP
    GROUP BY DEPTNO)
ORDER BY DEPTNO, EMPNO;

-- 스칼라 서브쿼리
SELECT DEPTNO
    , (SELECT DNAME FROM DEPT D WHERE D.DEPTNO = E.DEPTNO) DNAME
    , EMPNO, ENAME SAL
FROM EMP E
WHERE  (E.DEPTNO, SAL) IN ( 
    SELECT DEPTNO, MAX(SAL) FROM EMP
    GROUP BY DEPTNO)
ORDER BY DEPTNO, EMPNO;




--UNION
SELECT EMPNO, ENAME JOB, DEPTNO FROM EMP
WHERE JOB = 'SALESMAN'
UNION
SELECT EMPNO, ENAME JOB, DEPTNO FROM EMP
WHERE JOB = 'MANAGER'
ORDER BY DEPTNO, JOB;


--UNION ALL : 합집합, 중복 허용
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP
WHERE SAL < 2000
UNION ALL
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP
WHERE SAL < 3000
ORDER BY EMPNO;

--INTERSECT : 교집합
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP
WHERE SAL < 2000
INTERSECT
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP
WHERE SAL < 3000
ORDER BY EMPNO;



--MINUS : 차집합
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP
WHERE SAL < 3000
MINUS
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP
WHERE SAL < 2000
ORDER BY EMPNO;




--INSERT

DESC EMP;
-- ALT + ' 로 코드 대문자 소문자 스타일 변경가능
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP;

INSERT INTO EMP( EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES( 1001, 'ALICE', 'CLERK', 1003, '17/04/08', 800, NULL, 30 );


INSERT INTO EMP( EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES( 1002, 'MORRIS', 'CLERK', 1003, '17/01/03', 800, NULL, 30 );


SELECT * FROM EMP WHERE EMPNO<2000;

--ROLLBACK; -- 롤백, 작업내역 되돌리기
--COMMIT; -- 커밋, 작업내역 영구반영

DESC EMP;
SELECT 1003, 'MATHEW', 'SALESMAN', NULL, SYSDATE, 1500, 200, 30 
FROM DUAL;

INSERT INTO EMP
SELECT 1003, 'MATHEW', 'SALESMAN', NULL, SYSDATE, 1500, 200, 30 
FROM DUAL;

SELECT * FROM EMP WHERE EMPNO<2000;


--테이블 생성
--SELECT구문을 이용하여 복사본 테이블 생성하기
CREATE TABLE EMP_RESERCH
AS SELECT * FROM EMP;


--복사된 테이블 확인
SELECT * FROM emp_reserch;

--테이블 삭제
DROP TABLE emp_reserch;


--빈 테이블 조회, WHERE절의 조건을 '거짓' 이 되도록 설정한다.
SELECT * FROM EMP WHERE 1 = 0;

--빈 테이블 복사하기(데이터 없음, 컬럼은 유지됨)
CREATE TABLE EMP_RESEARCH
AS SELECT * FROM EMP WHERE 1 = 0;

--테이블 확인
SELECT * FROM emp_research;

--20번 부서의 모든 데이터를 삽입하기
INSERT INTO EMP_RESEARCH
SELECT * FROM EMP WHERE DEPTNO = 20;
SELECT * FROM EMP_RESEARCH; -- 테이터 확인
--30번 부서의 EMPNO, ENAME 값만 모두 삽입하기
INSERT INTO EMP_RESEARCH (EMPNO, ENAME)
SELECT EMPNO, ENAME FROM EMP
WHERE DEPTNO = 30;
SELECT * FROM EMP_RESEARCH; -- 테이터 확인


--전체 데이터 삭제
DELETE EMP_RESEARCH;

INSERT ALL
    WHEN DEPTNO = 20 -- 조건
    THEN INTO EMP_RESEARCH -- 데이터를 삽입할 코드 적용
    WHEN DEPTNO = 30 
    THEN INTO EMP_RESEARCH(EMPNO, ENAME) --데이터 삽입 코드 (INSERT 절쪽의 컬럼 명시)
    VALUES(EMPNO, ENAME) -- 삽입할 데이터 선택 코드(SELECT절 쪽의 컬럼)
SELECT * FROM EMP;

--데이터 확인
SELECT * FROM EMP_RESEARCH;

DROP TABLE EMP_HIRE;
-- 테이블 생성하기
--테이블명 : emp_hire
--컬럼 : empno, ename, hiredate
CREATE TABLE EMP_HIRE
AS SELECT empno, ename, hiredate FROM EMP WHERE 1= 0;
-- INSERT ALL 사용해서 해결하기
INSERT ALL
    WHEN HIREDATE > '1981/06/01'
    THEN INTO EMP_HIRE(EMPNO, ENAME, HIREDATE)
    VALUES(EMPNO, ENAME, HIREDATE)
SELECT * FROM EMP;
--조회
SELECT * FROM EMP_HIRE;


--테이블명 : emp_sal
--컬럼 : empno, ename, sal
DROP TABLE EMP_SAL;
CREATE TABLE EMP_SAL
AS SELECT EMPNO, ENAME, SAL FROM EMP WHERE 1= 0;
-- emp_sal 테이블, 2000보다 많은 사원
INSERT ALL
    WHEN SAL > 2000
    THEN INTO EMP_SAL (EMPNO,ENAME,SAL)
    VALUES(EMPNO, ENAME, SAL)   
SELECT  * FROM EMP;

SELECT * FROM EMP_SAL;


-- 두개 한번에 해보기
DROP TABLE EMP_SAL;
DROP TABLE EMP_HIRE;

CREATE TABLE EMP_HIRE
AS SELECT empno, ename, hiredate FROM EMP WHERE 1= 0;
CREATE TABLE EMP_SAL
AS SELECT EMPNO, ENAME, SAL FROM EMP WHERE 1= 0;

INSERT ALL
    WHEN HIREDATE > '1981/06/01'
    THEN INTO EMP_HIRE(EMPNO, ENAME, HIREDATE)
    VALUES(EMPNO, ENAME, HIREDATE)
        WHEN SAL > 2000
    THEN INTO EMP_SAL (EMPNO,ENAME,SAL)
    VALUES(EMPNO, ENAME, SAL)   
SELECT * FROM EMP;

SELECT * FROM EMP_HIRE;
SELECT * FROM EMP_SAL;





--UPDATE
SELECT * FROM EMP
--UPDATE EMP SET ENAME ='MC', JOB = 'DONALD'
WHERE EMPNO = 1001;


SELECT * FROM EMP_SAL;

UPDATE EMP_SAL SET SAL = SAL + 550;


--DELETE

SELECT * FROM EMP_HIRE;
SELECT * FROM EMP_SAL;

--테이블 전체 삭제
DELETE EMP_HIRE;
DELETE EMP_SAL;

--ROLLBACK;

--특정 데이터 삭제하기
SELECT * FROM EMP_SAL
--DELETE EMP_SAL
WHERE EMPNO = 7698;
--COMMIT;


-- 그룹핑(그룹화) - GROUP BY
SELECT  DEPTNO, JOB, COUNT(*) CNT, SUM(SAL) TOT_SAL
FROM EMP
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO;

SELECT  DEPTNO, JOB, COUNT(*) CNT, SUM(SAL) TOT_SAL
FROM EMP
WHERE DEPTNO IS NOT NULL -- 부서번호 없는 데이터 제거
GROUP BY ROLLUP (DEPTNO, JOB)
ORDER BY DEPTNO, JOB;


SELECT  DEPTNO, JOB, COUNT(*) CNT, SUM(SAL) TOT_SAL
FROM EMP
WHERE DEPTNO IS NOT NULL -- 부서번호 없는 데이터 제거
GROUP BY CUBE (DEPTNO, JOB)
ORDER BY DEPTNO, JOB;



SELECT  DEPTNO, JOB, COUNT(*) CNT, SUM(SAL) TOT_SAL
FROM EMP
WHERE DEPTNO IS NOT NULL -- 부서번호 없는 데이터 제거
GROUP BY GROUPING SETS (DEPTNO, JOB)
ORDER BY DEPTNO, JOB;