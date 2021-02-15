-- 패딩, PADDING
-- 문자열을 표현하기 위한 공간을 확보하고
-- 문자를 채우고 나머지를 빈칸으로 채운다.

--LEFT PADDING : LPAD( )
SELECT
    lpad('SQL', 5) AS test
FROM
    dual;
-- 다섯칸의 공간을 차지하고 왼쪽두칸은 공백

SELECT
    lpad('SQL', 5, '*') AS test
FROM
    dual;
-- 다섯칸의 공간을 차지하고 왼쪽두칸은 * 표시

SELECT
    ename
FROM
    emp;

SELECT
    lpad(ename, 10)
FROM
    emp
ORDER BY
    ename NULLS LAST;

-- RIGHT PADDING RPAD ( )
SELECT
    rpad('SQL', 10, '*') AS r
FROM
    dual;
--10칸의 공간을 차지하며, 나머지 오른칸들은 *로 채운다.

--TRIM
-- 문자 데이터의 양 끝 단에 있는 ' ' (띄어쓰기, 공백) 을 제거하는 함수
-- 직접 지정한 패턴을 제거할 수 도 있다.

SELECT
    '           SQL        ',
    ltrim('           SQL        ')              AS l,
    rtrim('           SQL        ')              AS r,
    TRIM('           SQL        ')                AS t,
    ltrim(rtrim('           SQL        '))        lr
FROM
    dual;

-- 날짜 함수

-- SYSDATE

SELECT
    sysdate
FROM
    dual; -- 현재시간( DATE 타입)

SELECT
    systimestamp
FROM
    dual; -- 현재시간 (TIMESTAMP)



-- EXTRACT : 날짜 데이터에서 특정 테이터를 추출하는 함수
-- EXTRACT ( 추출할요소 FROM 날짜 시간 타입)

SELECT
    EXTRACT(YEAR FROM sysdate) AS year
FROM
    dual;

SELECT
    EXTRACT(MONTH FROM sysdate) AS month
FROM
    dual;

SELECT
    EXTRACT(DAY FROM sysdate) AS day
FROM
    dual;

SELECT
    empno,
    ename,
    EXTRACT(YEAR FROM hiredate) AS hire
FROM
    emp
ORDER BY
    empno NULLS LAST;
-- 입사 년도를 알 수 있다.

SELECT
    empno,
    ename,
    EXTRACT(YEAR FROM hiredate)                                            AS hire,
    EXTRACT(YEAR FROM sysdate)                                             AS today,
    abs(EXTRACT(YEAR FROM hiredate) - EXTRACT(YEAR FROM sysdate))        AS workday
FROM
    emp
ORDER BY
    empno NULLS LAST;
-- 근속년수 구하기

--MONTHS_BETWEEN :  개월 수 차이를 계산하는 함수
SELECT
    months_between('19-01-01', '19-02-01')                   a,
    round(months_between('21/02/15', '21/01/07'), 2)        b
FROM
    dual;

SELECT
    floor(months_between(sysdate, hiredate) / 12) a
FROM
    emp;

--TRUNC(DATETIME) : DATETIME타입의 시간을 자정 으로 맞추는 함수
-- (00:00:00)

SELECT
    sysdate,
    to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS'),
    to_char(trunc(sysdate), 'YYYY/MM/DD HH24:MI:SS')
FROM
    dual;

INSERT INTO emp (
    empno,
    ename,
    hiredate
) VALUES (
    9996,
    'HI',
    sysdate
);

SELECT
    empno,
    ename,
    to_char(hiredate, 'YYYY/MM/DD HH24:MI:SS')
FROM
    emp
WHERE
    trunc(hiredate) = trunc(sysdate); -- 시간을 제외하고 날짜만 비교하기

--DATE 타입에는 시간이 포함되어있고 평소에 출력이 안된다
-- 겉으로 보기에 날짜가 같아 보여도 같은 값이 아닐 수 있다.
-- 시간이 다르면 다른 값이다.

--변환함수, CONVERSION FUNCTION

--TO_CHAR(NUMBER)
--TO_CHAR(NUMBER, FORMAT)

SELECT
    12345                             "0" -- 숫자
    ,
    to_char(12345)                    "1" -- 문자
    ,
    length(to_char(12345))          "3",
    length(12345)                   "4" -- 자동형변환
    ,
    to_char(12345, '99')              "5" --두자리 숫자형식으로 변환
    ,
    to_char(12345, '9999999999')      "5" --10자리숫자형식으로 변환 남은자리 빈칸
    ,
    to_char(12345, '0000000000')      "5" --10자리숫자형식으로 변환 남은자리 0
    ,
    to_char(12345, '9999000000')      "5" --섞어 사용( 잘안씀)
FROM
    dual;

SELECT
    to_char(123456.6789)                       "1",
    to_char(123456.6789, '999999.9')           "2", -- 소수점 첫째자리까지 보이고 나머지는 반올림
        to_char(123456.6789, '999,999.999')        "3" -- ,는 자릿수 구문을 해준다.
FROM
    dual;

SELECT
    to_char(12345)                            "1",
    to_char(12345, '$999999.00')              "2",
    to_char(12345, 'L999999.00')              "3",
    TRIM(to_char(12345, 'L999999.00'))        "4"
FROM
    dual;


--TO_CHAR(DATETIME)

SELECT
    to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS'),
    to_char(sysdate, 'SCC') "세기"
FROM
    dual;

SELECT
    to_char(sysdate, 'YEAR'), -- "영문 upper 연도"
    --TWENTY TWENTY-ONE
        to_char(sysdate, 'Year'), -- "영문 inticap 연도"
    --Twenty Twenty-One
        to_char(sysdate, 'year')    -- "영문 lower 연도"
    --twenty twenty-one
FROM
    dual;

SELECT
--    TO_CHAR(SYSDATE, 'YYYY'), -- "숫자네자리"
--    TO_CHAR(SYSDATE, 'YY'), -- "숫자두자리"
--    TO_CHAR(SYSDATE, 'yyy'),    -- "숫자세자리"
--    TO_CHAR(SYSDATE, 'y'),    -- "숫자한자리"
--
--    TO_CHAR(SYSDATE, 'yyyyyyyyyyyyyy')    --잘못된 패턴

--    TO_CHAR(SYSDATE, 'MM') "숫자 월",
--    TO_CHAR(SYSDATE, 'MONTH') "문자 월 장문",
--    TO_CHAR(SYSDATE, 'MON') "문자 월단위"
--    
--     TO_CHAR(SYSDATE, 'Q') "분기",
--     TO_CHAR(TO_DATE('2021/01/01'), 'Q') "1분기",
--     TO_CHAR(TO_DATE('2021/04/01'), 'Q') "2분기",
--     TO_CHAR(TO_DATE('2021/07/01'), 'Q') "3분기",
--     TO_CHAR(TO_DATE('2021/10/01'), 'Q') "4분기"
--     
--    TO_CHAR(SYSDATE, 'DD')"월단위 일 - 날짜", 
--    TO_CHAR(SYSDATE, 'D')"주 단위 일 - 요일", --1은 일요일
--    TO_CHAR(SYSDATE, 'DDD') "연단위 일 "
--    , TO_CHAR(SYSDATE, 'DAY') "요일 장문"
--    , TO_CHAR(SYSDATE, 'DY') "요일 단문"

--    TO_CHAR(SYSDATE, 'HH') "12시간기준"
--    ,TO_CHAR(SYSDATE, 'HH12') "12시간기준"
--    ,TO_CHAR(SYSDATE, 'HH24') "24시간기준"
--    ,TO_CHAR(SYSDATE, 'MI') "분"
--    ,TO_CHAR(SYSDATE, 'SS') "초"
--    
    
        to_char(sysdate, 'AM')        "오전/오후",
    to_char(sysdate, 'PM')        "오전/오후",
    to_char(sysdate, 'A.M.')      "오전/오후",
    to_char(sysdate, 'P.M.')      "오전/오후"
    -- 이중 아무거나 쓰면 된다.
FROM
    dual;

SELECT
    --TO_CHAR(SYSDATE, 'FF') "밀리초" -- DATE 타입에는 밀리초 없음
        to_char(systimestamp, 'FF')       "밀리초",
    to_char(systimestamp, 'FF1')      "밀리초 한자리 0.1초",
    to_char(systimestamp, 'FF2')      "밀리초 두자리 0.01초",
    to_char(systimestamp, 'FF3')      "밀리초 세자리 0.001초"
FROM
    dual;

--접미어 서식

SELECT
    to_char(sysdate, 'MM')            "월",
    to_char(sysdate, 'MMTH')          "월 축약서수",
    to_char(sysdate, 'MMSP')          "월 기수",
    to_char(sysdate, 'MmSPTH')        "월 서수",
    to_char(sysdate, 'mmTHSP')        "월 서수",
    to_char(sysdate + 3, 'DD')        "일 + 3",
    to_char(sysdate + 4, 'DDTH')      "일 + 4",
    to_char(sysdate, 'DDSP')          "일",
    to_char(sysdate, 'DdSPTH')        "월",
    to_char(sysdate, 'ddTHSP')        "월"
    --DATE 타입에 숫자를 더하면 날짜가 증가된다.
FROM
    dual;

SELECT
    *
FROM
    emp
WHERE 
-- EXTRACT (YEAR FROM HIREDATE) = '1981'
         to_char(hiredate, 'yyyy') = '1981'
    AND to_char(hiredate, 'Q') = 1;

--TO_NUMBER(VARCHAR2) : 문자 ->숫자
-- 숫자형식(NUMBER FORMAT)을 가지고 있는 문자를 숫자를 변환한다.

SELECT
    123.67                                  "1" -- NUMBER
    ,
    '123.67'                                "2" -- VARCHAR2
    ,
    to_number('123.67')                     "3",
    to_number('123.67', '999999.9999')      "4"--여기서 9999 . . .는 허용가능한 자릿수를 나타낸다.
    --,TO_NUMBER('123.67', '99.99') "5"--에러가 발생한다.
FROM
    dual;

SELECT
    --TO_NUMBER('67,800') "1" -- 에러 발생
        to_number('67,800', '99,999') "2" -- 서식으로 숫자임을 알려주어야함
FROM
    dual;

SELECT
    to_number('$745.89', '$999,999,999.999') -- 서식만 맞으면 출력된다.
FROM
    dual;

--TO_DATE(VARCHAR2) : 문자 -> 날짜
-- 날짜형식(DATETIME FORMAT)의 문자를 날짜로변환한다.

SELECT
    '12345' + 11111           "1",
    '18/8/4'                  "2" -- 날짜가 아니기 떄문에 + 숫자가 안된다.
    ,
    to_date('18/8/4') + 1     "2" -- TO_DATE를 바꾸면 된다.
FROM
    dual;

SELECT
    '12 1 11'                           "1",
    '12/1/11'                           "2",
    '12-1-11'                           "3",
    to_date('12 1 11')                  "4" -- 변경됨 ' ' , '/' , '-'
    ,
    to_date('12/1/11')                  "5" -- 변경됨 ' ' , '/' , '-'
    ,
    to_date('12-1-11')                  "6" -- 변경됨 ' ' , '/' , '-'
    ,
    TO_DATE('12-1-11', 'MM DD YY')      "7",
    TO_DATE('12-1-11', 'YY MM DD')      "8"
FROM
    dual;

--기타 함수
-- NVL (A, B ) 함수
-- A 값이 NULL일 경우 B로 치환한다.
SELECT
    empno,
    ename,
    nvl(comm, 0) comm
FROM
    emp;

--NVL2 (A,B,C)함수
-- A 값이 NULL이 아닐 경우 B로 치환, NULL일 경우 C로 치환
SELECT
    empno,
    ename                           sal,
    comm,
    nvl2(comm, sal + comm, 0)         AS "TOTAL"
FROM
    emp;

-- NULLIF  함수
-- NULLIF(A,B)
-- A값과 B값을 비교하며, 같으면 NULL을 반환한다.
-- 다르면 A를 반환한다.

SELECT
    nullif(10, 20),
    nullif(20, 10),
    nullif(20, 20)
FROM
    dual;

SELECT
    empno,
    ename,
    job,
    nullif(job, 'SALESMAN')                      nif,
    nvl(nullif(job, 'SALESMAN'), '영업')           nif
FROM
    emp;

--DECODE 함수
SELECT
    *
FROM
    dept;

-- 연습을 좀해야 한다.
SELECT
    empno,
    ename,
    deptno,
    decode(deptno, 10, '회계팀', 20, '연구팀',
           30, '영업팀', 40, '운영팀', '부서없음') AS dname
FROM
    emp;

-- 시험에 나온다 보기
--CASE 구문
SELECT
    empno,
    ename,
    deptno,
    CASE deptno
        WHEN 10  THEN
            '회계팀'
        WHEN 20  THEN
            '연구팀'
        WHEN 30  THEN
            '영업팀'
        WHEN 40  THEN
            '운영팀'
        ELSE
            '부서없음'
    END AS dname
FROM
    emp;

SELECT
    empno,
    ename,
    deptno,
    CASE
        WHEN job = 'PRESIDENT'   THEN
            '사장'
        WHEN deptno = 10        THEN
            '회계팀'
        WHEN deptno = 20        THEN
            '연구팀'
        WHEN deptno = 30        THEN
            '영업팀'
        WHEN deptno = 40        THEN
            '운영팀'
        ELSE
            '부서없음'
    END AS dname
FROM
    emp;

--CASE QUIZ

-- 10부서인 사원들은 급여를 15% 인상하여 조회
-- 20부서인 사원들은 급여를 8% 인상하여 조회

SELECT
    empno,
    ename,
    deptno,
    sal,
    CASE
        WHEN deptno = 10  THEN
            ( sal * 1.15 )
        WHEN deptno = 20  THEN
            ( sal * 1.08 )
        ELSE
            sal
    END AS total
FROM
    emp;

SELECT
    empno,
    ename,
    deptno,
    sal,
    decode(deptno, 10,(sal * 1.15), 20,(sal * 1.08),
           sal) total
FROM
    emp
    ORDER BY TOTAL DESC NULLS LAST;
    
    
    
    
 -- 그룹함수
 
 --COUNT
 SELECT * FROM EMP;
 
 SELECT COUNT(*) FROM EMP; -- 15
 SELECT JOB, COUNT(*) AS "부서 수" FROM EMP GROUP BY JOB;
    
SELECT COUNT(MGR) FROM EMP; --11 (4개의 행이 NULL 값을 가짐)
SELECT COUNT(COMM) FROM EMP; -- 4개만 값이 들어 있음


--SUM 합계

SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO; -- SAL의 합계
SELECT  SUM(SAL) FROM EMP ; -- SAL의 합계


--AVG : 평균
SELECT SAL FROM EMP;
SELECT AVG(SAL) FROM EMP;

--MAX : 최대
SELECT MAX(SAL) FROM EMP;

--MIN : 최소
SELECT MIN(SAL) FROM EMP;


SELECT COUNT(SAL) FROM EMP
WHERE DEPTNO = 10; -- 10 부서의 합계

SELECT MAX(SAL) FROM EMP
WHERE DEPTNO = 20; -- 20 부서의 최댓값

SELECT MAX(HIREDATE), MIN(HIREDATE)
FROM EMP;

SELECT MAX(ENAME) FROM EMP;
-- 알파벳 뒷순위 이름


--그룹화

--부서별로 급여의 합계

SELECT DEPTNO, SUM(SAL)  FROM EMP GROUP BY DEPTNO
ORDER BY SUM(SAL) DESC NULLS LAST, DEPTNO;

--부서별 인원수

SELECT
    DEPTNO
    ,COUNT(*) CNT
FROM EMP
GROUP BY DEPTNO
ORDER BY CNT;


--조인, JOIN

SELECT * FROM EMP;
SELECT * FROM DEPT;

SELECT * FROM EMP, DEPT; -- 두개의 테이블을 같이 본다.


SELECT * FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO; -- 두개의 테이블을 같이 본다.

-- 테이블명의 별칭을 사용하여 조건설정하면 편하다.
SELECT * FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND E.DEPTNO = 30; -- 두개의 테이블을 같이 본다.







SELECT DEPTNO, JOB FROM EMP
ORDER BY DEPTNO, JOB;


SELECT DEPTNO, JOB
    ,COUNT(*)
    FROM EMP
    GROUP BY DEPTNO, JOB
    ORDER BY DEPTNO, JOB;


SELECT DEPTNO
    , COUNT(*) CNT
FROM EMP
GROUP BY DEPTNO
HAVING COUNT(*) > 5 -- WHERE로 조건을 제시하면 안됨
-- HAVING으로 조건을 제시해야 함
ORDER BY DEPTNO;
