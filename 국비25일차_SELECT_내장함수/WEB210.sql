

--SELECT 구문

-- TABS : 전체 테이블 목록 자료사전
SELECT * FROM TABS;

SELECT * FROM EMP; -- 사원 정보
SELECT * FROM DEPT; -- 부서정보
SELECT * FROM salgrade; -- 급여 등급 정보
SELECT * FROM BONUS; -- 보너스 정보
-- SELECT 구문에서 * 기호는 모든 컬럼을 조회한다는 뜻

-- EMP 테이블의 모든 컬럼을 이용헤 출력한다.
SELECT * FROM EMP; 

-- EMPNO, ENAME 컬럼을 선택해서 출력한다.
-- 컴럼명에 별칭(Alias)을 적용하여 조회하기
SELECT 
    EMPNO AS "사번 "
    , ENAME  AS "사원 이름 " 
FROM EMP;

-- AS 키워드 생략 가능하다.
SELECT 
    EMPNO  "사번 "
    , ENAME   "사원 이름 " 
FROM EMP;
--문자 데이터를 나타낼 때 ' ', 식별자를 나타낼 때 " "



-- * 를 사용하지 않고 전체컬럼을 명시적으로 써서 출력하는 경우도 있다.
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP;

-- WHERE 절 ( 조건 적용절)
    
SELECT * FROM EMP
WHERE JOB = 'SALESMAN';

-- 봉급이 2000이상인 애들만 보임
SELECT * FROM EMP
WHERE SAL > 2000;

-- 봉급이 2000이상인 3000 미만
SELECT * FROM EMP
WHERE SAL > 2000 AND SAL < 3000;


-- 급여가 2500이 넘거 관리자가 아닌 사원들 조회하기
SELECT * FROM EMP;

SELECT * FROM EMP
WHERE SAL > 2500 AND JOB != 'MANAGER';

SELECT * FROM EMP
WHERE SAL > 2500 AND NOT (JOB = 'MANAGER');


--BETWEEN A AND B
-- 사원번호 7700 ~ 7900 포함 사원 조회
SELECT EMPNO, ENAME FROM EMP
WHERE EMPNO BETWEEN 7700 AND 7900;

-- 사원번호 7700 ~ 7900 미포함 사원 조회
SELECT EMPNO, ENAME FROM EMP
WHERE NOT (EMPNO BETWEEN 7700 AND 7900);

SELECT EMPNO, ENAME FROM EMP
WHERE  EMPNO  NOT BETWEEN 7700 AND 7900;

--사원이름 
SELECT * FROM EMP
WHERE ENAME BETWEEN 'ALIEN' AND 'KING';

SELECT * FROM EMP
WHERE ENAME >= 'ALIEN' AND ename <= 'KING';

-- IN ( LIST )

SELECT EMPNO, ENAME FROM EMP
WHERE EMPNO IN ( 7521, 7654, 7839, 7844);

SELECT EMPNO, ENAME FROM EMP
WHERE EMPNO  NOT IN ( 7521, 7654, 7839, 7844);

-- 문자열도 가능하다.
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME IN ( 'SMITH', 'ALLEN', 'KING', 'FORD', 'JAMES');

--R포함 사원
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME LIKE '%R%';

--이름 두번째 A 사원
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME LIKE '_A%';

--이름이 RD로 끝나느 사원
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME LIKE '%RD';

-- 이름에 R이 포함되지 않는 사원
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME NOT LIKE '%R%';



SELECT * FROM EMP
WHERE ENAME = 'SMITH';

--  절대 쓰면 안되는 LIKE 문
-- 같은 값인지 비교할 때 LIKE 연산자 사용하지 말것
SELECT * FROM EMP
WHERE ENAME LIKE 'SMITH';
-- FULLSCAN을 유발해서 느려진다.


--IS NULL
SELECT * FROM EMP;

-- COMM 이 NULL이 아닌 사람
SELECT * FROM EMP
WHERE NOT COMM IS NULL ;

-- MGR 이 NULL인 사람만 조회한다.
SELECT * FROM EMP
WHERE MGR IS NULL;

--  = 연산자로 NULL을 조회할 수 없다.
--  이는 없는 데이터이기 때문이다.



--QUIZ

SELECT * FROM EMP;

-- 부서번호가 30이고 직무가 영업인 사원 조회
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO = 30 AND JOB = 'SALESMAN';

-- 부서번호가 30이고 직무가 영업이 아닌 사원 조회
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO = 30 AND JOB != 'SALESMAN';

 -- 부서번호가 30이 아니고 직무가 영업이 아닌 사원 조회
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO != 30 AND JOB != 'SALESMAN';

 -- 사원번호가 7782에서 7900 사이인 사원 조회
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE EMPNO BETWEEN 7782 AND 7900;

 -- 사원명이 'A'부터 'C'로 시작하는 사원 조회
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE ENAME BETWEEN 'A' AND 'C'; 
-- C 로시작하는 이름을 가져오지 못한다.

SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE ENAME BETWEEN 'A' AND 'C~'; 
-- ~ 은 아스키코드의 마지막 문자

SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE ENAME BETWEEN 'A' AND 'D';
-- D 가 이름이면 조회가 된다.

SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE ENAME >= 'A' AND ENAME < 'D' ; 

 -- 부서번호가 10 또는 30인 사원 조회 (IN 사용)
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO IN ('10', '30' );

--COMM 이 NULL 인사람 조회
SELECT * FROM EMP
WHERE COMM IS NULL ;




--ORDER BY

SELECT * FROM EMP
ORDER BY EMPNO;
-- EMPNO컬럼을 기준으로 ASC 정렬(오름차순)

SELECT * FROM EMP
ORDER BY EMPNO DESC;

SELECT * FROM EMP
ORDER BY ENAME;

SELECT * FROM EMP
ORDER BY ENAME DESC;

SELECT * FROM EMP
ORDER BY HIREDATE;

SELECT EMPNO, ENAME, DEPTNO FROM EMP
ORDER BY DEPTNO DESC , EMPNO ASC;

SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO IS NOT NULL -- NULL 값 제거
AND  ENAME IS NOT NULL
ORDER BY DEPTNO DESC , EMPNO ASC;

-- NULL 값은 가진 데이터 추가 정렬
SELECT EMPNO, ENAME, DEPTNO FROM EMP
ORDER BY DEPTNO DESC NULLS LAST , EMPNO ASC NULLS FIRST;

-- 조회되는 컬럼으로 지정하지 않아도 정렬기준으로 사용할 수 있다.
SELECT EMPNO, ENAME, COMM FROM EMP
ORDER BY SAL DESC NULLS LAST;


-- DISTINCT,  중복제거
-- 사원들의 소속된 부서번호 조히
SELECT DISTINCT DEPTNO FROM EMP
ORDER BY DEPTNO;

-- 중복된 데이터를 판단할 때에는 한 행의 모든
-- 컬럼이 같아야 중복으로 판별
SELECT DISTINCT * FROM EMP;
-- 중복제거 안됨


SELECT DISTINCT JOB FROM EMP;

-- 동시에 두개의 컬럼을 묶어 중복제거
-- 두개 컬럼모두 같아야 중복으로 인식
SELECT DISTINCT 
    DEPTNO, JOB 
FROM EMP;

-- DISTINCT는 SELECT 바로 뒤에만 붙일 수 있다.


-- 데이터 연결 연산자,  ||
SELECT ENAME || ' IS ' ||JOB
FROM EMP;

SELECT ENAME || ' IS ' || JOB 
    AS "직원의 직업"
FROM EMP;

SELECT ENAME || ' IS HIRED AT  ' || HIREDATE 
    AS "HIREDATE"
FROM EMP;


-- DUAL 테이블
SELECT
    'A' || 1 || 2 || 3 || 4 RESULT
FROM DUAL;
    
 SELECT 1 + 10 FROM DUAL;   
 
 SELECT 1+2, 65 * 3, 'TEST' || 'DATA' FROM DUAL;

--SQL  FUNCTIONS

--LENGTH 문자열 컬럼의 길이를 보여준다. AS도 가능
SELECT ENAME, LENGTH(ENAME) LEN FROM EMP;

-- COUNT는 테이블의 데이터수(행)를 반한한다.
SELECT COUNT(*) CNT FROM EMP;


--숫자 함수
SELECT ABS(-56) FROM DUAL;
-- 절대값 구하는 함수

--QUIZ

-- 12.523 -> 소수점이하 반올림
SELECT ROUND(12.523) FROM DUAL;
-- -12.723 -> 소수점이하 반올림
SELECT ROUND(-12.723) FROM DUAL;

-- 12.567 -> 소수점 3째자리에서 반올림
SELECT ROUND(12.567,  2) FROM DUAL;

-- 12345 -> 1의 자리에서 반올림
SELECT ROUND(1234.5) * 10  FROM DUAL;
SELECT ROUND(12345, -1)  FROM DUAL;
-- -1도 들어간다.


-- 56789 -> 10의 자리에서 반올림
SELECT ROUND(567.89) * 100  FROM DUAL;
SELECT ROUND(56789, -2)  FROM DUAL;

-- 12.456 -> 소수점이하 버림
SELECT TRUNC(12.456) FROM DUAL;

-- 12.456 -> 소수점 3째자리에서 버림
SELECT TRUNC(12.456, 2) FROM DUAL;

-- 12345 -> 1의자리에서 버림
SELECT TRUNC(1234.5) * 10 FROM DUAL;
SELECT TRUNC(12345, -1)  FROM DUAL;

-- 56789 -> 10의자리에서 버림
SELECT TRUNC(567.89) * 100 FROM DUAL;
SELECT TRUNC(56789, -2) FROM DUAL;

-- 13을 8로 나눈 나머지
SELECT MOD (13 , 8) FROM DUAL;


-- 12.345 올림 -> 13
SELECT CEIL (12.345) FROM DUAL;

-- -12.567 올림 -> -12
SELECT CEIL (-12.567) FROM DUAL;

-- 12.567 내림 -> 12
SELECT FLOOR (12.567) FROM DUAL;

-- 12.123 내림 -> 12
SELECT FLOOR (12.123) FROM DUAL;

-- -12.567 내림 -> -13
SELECT FLOOR (-12.567) FROM DUAL;

-- -12.123 내림 -> -13
SELECT CEIL (12.123) FROM DUAL;

-- 3의 4제곱 -> 81
SELECT POWER(3, 4) FROM DUAL;

-- 3의 -1 제곱 -> 0.33333333333
SELECT POWER(3, -1) FROM DUAL;

-- 9의 제곱근 -> 3
SELECT CEIL (12.567) FROM DUAL;

-- 11의 제곱근 -> 3.3166.
SELECT SQRT(11) FROM DUAL;


-- 문자 함수 문제

-- 'hELlo' 모두 대문자로 변환 -> HELLO
SELECT NLS_UPPER('hELlo') FROM DUAL;

-- 'hELlo' 모두 소문자로 변환 -> hello
SELECT NLS_LOWER('hELlo') FROM DUAL;

-- 'hELlo' 이니셜(첫글자) 대문자 -> Hello
SELECT INITCAP('hELlo') FROM DUAL;

-- 'Alice Bob'의 문자열 길이 -> 9
SELECT LENGTH('Alice Bob') FROM DUAL;
-- '안녕하세요'의 문자열 길이 -> 5
SELECT LENGTH('안녕하세요') FROM DUAL;

-- 'Alice Bob' 문자열 바이트 수 -> 9
SELECT LENGTHB('Alice Bob') FROM DUAL;

-- 'ACE 안녕하세요'문자열 바이트 수 -> 19
-- (오라클은 한글 인코딩을 UTF-8을 기본으로 하며
--  UTF-8은 한글 한글자에 3바이트가 필요하다)
SELECT LENGTHB('ACE 안녕하세요') FROM DUAL;


-- 'ABCDEFGHI'에서 'D' 의 위치 -> 4
SELECT INSTR('ABCDEFGHI', 'D') FROM DUAL;

-- 'ABCDEFGHI'에서 'DEF'문자열의 위치 -> 4
SELECT INSTR('ABCDEFGHI', 'DEF') FROM DUAL;

-- 'ABCDEFGHI'에서 'DF'문자열의 위치 -> 0 (없을 경우 0)
SELECT INSTR('ABCDEFGHI', 'DF') FROM DUAL;

-- '안녕하세요'에서 '하'문자열의 위치 -> 3
SELECT INSTR('안녕하세요', '하') FROM DUAL;

-- 'ABCABCDDD'에서 'C'문자열의 위치 -> 3
SELECT INSTR('ABCABCDDD', 'C') FROM DUAL;

--'Oracle SQL Developer'에서 5번째 인덱스 이후의 문자열로 자르기
SELECT SUBSTR('Oracle SQL Developer', 1, 5) FROM DUAL;

--'Oracle SQL Developer'에서 5번째 인덱스부터 5글자로 자르기
SELECT 
SUBSTR('Oracle SQL Developer', 1, 5), 
SUBSTR('Oracle SQL Developer', 6, 11), 
SUBSTR('Oracle SQL Developer', 12, 17) 
FROM DUAL;

--'오라클 SQL'에서 2번째 인덱스부터 5글자로 자르기
SELECT 
SUBSTR('Oracle SQL Developer', 2, 6), 
SUBSTR('Oracle SQL Developer', 7, 12), 
SUBSTR('Oracle SQL Developer', 13, 18) 
FROM DUAL;


--'안녕하세요오라클'에서 3번째 부터 자르기
SELECT 
SUBSTR('안녕하세요오라클', 3)
FROM DUAL;


