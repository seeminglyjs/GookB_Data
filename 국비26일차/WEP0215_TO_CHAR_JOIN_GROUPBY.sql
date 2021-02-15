-- �е�, PADDING
-- ���ڿ��� ǥ���ϱ� ���� ������ Ȯ���ϰ�
-- ���ڸ� ä��� �������� ��ĭ���� ä���.

--LEFT PADDING : LPAD( )
SELECT
    lpad('SQL', 5) AS test
FROM
    dual;
-- �ټ�ĭ�� ������ �����ϰ� ���ʵ�ĭ�� ����

SELECT
    lpad('SQL', 5, '*') AS test
FROM
    dual;
-- �ټ�ĭ�� ������ �����ϰ� ���ʵ�ĭ�� * ǥ��

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
--10ĭ�� ������ �����ϸ�, ������ ����ĭ���� *�� ä���.

--TRIM
-- ���� �������� �� �� �ܿ� �ִ� ' ' (����, ����) �� �����ϴ� �Լ�
-- ���� ������ ������ ������ �� �� �ִ�.

SELECT
    '           SQL        ',
    ltrim('           SQL        ')              AS l,
    rtrim('           SQL        ')              AS r,
    TRIM('           SQL        ')                AS t,
    ltrim(rtrim('           SQL        '))        lr
FROM
    dual;

-- ��¥ �Լ�

-- SYSDATE

SELECT
    sysdate
FROM
    dual; -- ����ð�( DATE Ÿ��)

SELECT
    systimestamp
FROM
    dual; -- ����ð� (TIMESTAMP)



-- EXTRACT : ��¥ �����Ϳ��� Ư�� �����͸� �����ϴ� �Լ�
-- EXTRACT ( �����ҿ�� FROM ��¥ �ð� Ÿ��)

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
-- �Ի� �⵵�� �� �� �ִ�.

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
-- �ټӳ�� ���ϱ�

--MONTHS_BETWEEN :  ���� �� ���̸� ����ϴ� �Լ�
SELECT
    months_between('19-01-01', '19-02-01')                   a,
    round(months_between('21/02/15', '21/01/07'), 2)        b
FROM
    dual;

SELECT
    floor(months_between(sysdate, hiredate) / 12) a
FROM
    emp;

--TRUNC(DATETIME) : DATETIMEŸ���� �ð��� ���� ���� ���ߴ� �Լ�
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
    trunc(hiredate) = trunc(sysdate); -- �ð��� �����ϰ� ��¥�� ���ϱ�

--DATE Ÿ�Կ��� �ð��� ���ԵǾ��ְ� ��ҿ� ����� �ȵȴ�
-- ������ ���⿡ ��¥�� ���� ������ ���� ���� �ƴ� �� �ִ�.
-- �ð��� �ٸ��� �ٸ� ���̴�.

--��ȯ�Լ�, CONVERSION FUNCTION

--TO_CHAR(NUMBER)
--TO_CHAR(NUMBER, FORMAT)

SELECT
    12345                             "0" -- ����
    ,
    to_char(12345)                    "1" -- ����
    ,
    length(to_char(12345))          "3",
    length(12345)                   "4" -- �ڵ�����ȯ
    ,
    to_char(12345, '99')              "5" --���ڸ� ������������ ��ȯ
    ,
    to_char(12345, '9999999999')      "5" --10�ڸ������������� ��ȯ �����ڸ� ��ĭ
    ,
    to_char(12345, '0000000000')      "5" --10�ڸ������������� ��ȯ �����ڸ� 0
    ,
    to_char(12345, '9999000000')      "5" --���� ���( �߾Ⱦ�)
FROM
    dual;

SELECT
    to_char(123456.6789)                       "1",
    to_char(123456.6789, '999999.9')           "2", -- �Ҽ��� ù°�ڸ����� ���̰� �������� �ݿø�
        to_char(123456.6789, '999,999.999')        "3" -- ,�� �ڸ��� ������ ���ش�.
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
    to_char(sysdate, 'SCC') "����"
FROM
    dual;

SELECT
    to_char(sysdate, 'YEAR'), -- "���� upper ����"
    --TWENTY TWENTY-ONE
        to_char(sysdate, 'Year'), -- "���� inticap ����"
    --Twenty Twenty-One
        to_char(sysdate, 'year')    -- "���� lower ����"
    --twenty twenty-one
FROM
    dual;

SELECT
--    TO_CHAR(SYSDATE, 'YYYY'), -- "���ڳ��ڸ�"
--    TO_CHAR(SYSDATE, 'YY'), -- "���ڵ��ڸ�"
--    TO_CHAR(SYSDATE, 'yyy'),    -- "���ڼ��ڸ�"
--    TO_CHAR(SYSDATE, 'y'),    -- "�������ڸ�"
--
--    TO_CHAR(SYSDATE, 'yyyyyyyyyyyyyy')    --�߸��� ����

--    TO_CHAR(SYSDATE, 'MM') "���� ��",
--    TO_CHAR(SYSDATE, 'MONTH') "���� �� �幮",
--    TO_CHAR(SYSDATE, 'MON') "���� ������"
--    
--     TO_CHAR(SYSDATE, 'Q') "�б�",
--     TO_CHAR(TO_DATE('2021/01/01'), 'Q') "1�б�",
--     TO_CHAR(TO_DATE('2021/04/01'), 'Q') "2�б�",
--     TO_CHAR(TO_DATE('2021/07/01'), 'Q') "3�б�",
--     TO_CHAR(TO_DATE('2021/10/01'), 'Q') "4�б�"
--     
--    TO_CHAR(SYSDATE, 'DD')"������ �� - ��¥", 
--    TO_CHAR(SYSDATE, 'D')"�� ���� �� - ����", --1�� �Ͽ���
--    TO_CHAR(SYSDATE, 'DDD') "������ �� "
--    , TO_CHAR(SYSDATE, 'DAY') "���� �幮"
--    , TO_CHAR(SYSDATE, 'DY') "���� �ܹ�"

--    TO_CHAR(SYSDATE, 'HH') "12�ð�����"
--    ,TO_CHAR(SYSDATE, 'HH12') "12�ð�����"
--    ,TO_CHAR(SYSDATE, 'HH24') "24�ð�����"
--    ,TO_CHAR(SYSDATE, 'MI') "��"
--    ,TO_CHAR(SYSDATE, 'SS') "��"
--    
    
        to_char(sysdate, 'AM')        "����/����",
    to_char(sysdate, 'PM')        "����/����",
    to_char(sysdate, 'A.M.')      "����/����",
    to_char(sysdate, 'P.M.')      "����/����"
    -- ���� �ƹ��ų� ���� �ȴ�.
FROM
    dual;

SELECT
    --TO_CHAR(SYSDATE, 'FF') "�и���" -- DATE Ÿ�Կ��� �и��� ����
        to_char(systimestamp, 'FF')       "�и���",
    to_char(systimestamp, 'FF1')      "�и��� ���ڸ� 0.1��",
    to_char(systimestamp, 'FF2')      "�и��� ���ڸ� 0.01��",
    to_char(systimestamp, 'FF3')      "�и��� ���ڸ� 0.001��"
FROM
    dual;

--���̾� ����

SELECT
    to_char(sysdate, 'MM')            "��",
    to_char(sysdate, 'MMTH')          "�� ��༭��",
    to_char(sysdate, 'MMSP')          "�� ���",
    to_char(sysdate, 'MmSPTH')        "�� ����",
    to_char(sysdate, 'mmTHSP')        "�� ����",
    to_char(sysdate + 3, 'DD')        "�� + 3",
    to_char(sysdate + 4, 'DDTH')      "�� + 4",
    to_char(sysdate, 'DDSP')          "��",
    to_char(sysdate, 'DdSPTH')        "��",
    to_char(sysdate, 'ddTHSP')        "��"
    --DATE Ÿ�Կ� ���ڸ� ���ϸ� ��¥�� �����ȴ�.
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

--TO_NUMBER(VARCHAR2) : ���� ->����
-- ��������(NUMBER FORMAT)�� ������ �ִ� ���ڸ� ���ڸ� ��ȯ�Ѵ�.

SELECT
    123.67                                  "1" -- NUMBER
    ,
    '123.67'                                "2" -- VARCHAR2
    ,
    to_number('123.67')                     "3",
    to_number('123.67', '999999.9999')      "4"--���⼭ 9999 . . .�� ��밡���� �ڸ����� ��Ÿ����.
    --,TO_NUMBER('123.67', '99.99') "5"--������ �߻��Ѵ�.
FROM
    dual;

SELECT
    --TO_NUMBER('67,800') "1" -- ���� �߻�
        to_number('67,800', '99,999') "2" -- �������� �������� �˷��־����
FROM
    dual;

SELECT
    to_number('$745.89', '$999,999,999.999') -- ���ĸ� ������ ��µȴ�.
FROM
    dual;

--TO_DATE(VARCHAR2) : ���� -> ��¥
-- ��¥����(DATETIME FORMAT)�� ���ڸ� ��¥�κ�ȯ�Ѵ�.

SELECT
    '12345' + 11111           "1",
    '18/8/4'                  "2" -- ��¥�� �ƴϱ� ������ + ���ڰ� �ȵȴ�.
    ,
    to_date('18/8/4') + 1     "2" -- TO_DATE�� �ٲٸ� �ȴ�.
FROM
    dual;

SELECT
    '12 1 11'                           "1",
    '12/1/11'                           "2",
    '12-1-11'                           "3",
    to_date('12 1 11')                  "4" -- ����� ' ' , '/' , '-'
    ,
    to_date('12/1/11')                  "5" -- ����� ' ' , '/' , '-'
    ,
    to_date('12-1-11')                  "6" -- ����� ' ' , '/' , '-'
    ,
    TO_DATE('12-1-11', 'MM DD YY')      "7",
    TO_DATE('12-1-11', 'YY MM DD')      "8"
FROM
    dual;

--��Ÿ �Լ�
-- NVL (A, B ) �Լ�
-- A ���� NULL�� ��� B�� ġȯ�Ѵ�.
SELECT
    empno,
    ename,
    nvl(comm, 0) comm
FROM
    emp;

--NVL2 (A,B,C)�Լ�
-- A ���� NULL�� �ƴ� ��� B�� ġȯ, NULL�� ��� C�� ġȯ
SELECT
    empno,
    ename                           sal,
    comm,
    nvl2(comm, sal + comm, 0)         AS "TOTAL"
FROM
    emp;

-- NULLIF  �Լ�
-- NULLIF(A,B)
-- A���� B���� ���ϸ�, ������ NULL�� ��ȯ�Ѵ�.
-- �ٸ��� A�� ��ȯ�Ѵ�.

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
    nvl(nullif(job, 'SALESMAN'), '����')           nif
FROM
    emp;

--DECODE �Լ�
SELECT
    *
FROM
    dept;

-- ������ ���ؾ� �Ѵ�.
SELECT
    empno,
    ename,
    deptno,
    decode(deptno, 10, 'ȸ����', 20, '������',
           30, '������', 40, '���', '�μ�����') AS dname
FROM
    emp;

-- ���迡 ���´� ����
--CASE ����
SELECT
    empno,
    ename,
    deptno,
    CASE deptno
        WHEN 10  THEN
            'ȸ����'
        WHEN 20  THEN
            '������'
        WHEN 30  THEN
            '������'
        WHEN 40  THEN
            '���'
        ELSE
            '�μ�����'
    END AS dname
FROM
    emp;

SELECT
    empno,
    ename,
    deptno,
    CASE
        WHEN job = 'PRESIDENT'   THEN
            '����'
        WHEN deptno = 10        THEN
            'ȸ����'
        WHEN deptno = 20        THEN
            '������'
        WHEN deptno = 30        THEN
            '������'
        WHEN deptno = 40        THEN
            '���'
        ELSE
            '�μ�����'
    END AS dname
FROM
    emp;

--CASE QUIZ

-- 10�μ��� ������� �޿��� 15% �λ��Ͽ� ��ȸ
-- 20�μ��� ������� �޿��� 8% �λ��Ͽ� ��ȸ

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
    
    
    
    
 -- �׷��Լ�
 
 --COUNT
 SELECT * FROM EMP;
 
 SELECT COUNT(*) FROM EMP; -- 15
 SELECT JOB, COUNT(*) AS "�μ� ��" FROM EMP GROUP BY JOB;
    
SELECT COUNT(MGR) FROM EMP; --11 (4���� ���� NULL ���� ����)
SELECT COUNT(COMM) FROM EMP; -- 4���� ���� ��� ����


--SUM �հ�

SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO; -- SAL�� �հ�
SELECT  SUM(SAL) FROM EMP ; -- SAL�� �հ�


--AVG : ���
SELECT SAL FROM EMP;
SELECT AVG(SAL) FROM EMP;

--MAX : �ִ�
SELECT MAX(SAL) FROM EMP;

--MIN : �ּ�
SELECT MIN(SAL) FROM EMP;


SELECT COUNT(SAL) FROM EMP
WHERE DEPTNO = 10; -- 10 �μ��� �հ�

SELECT MAX(SAL) FROM EMP
WHERE DEPTNO = 20; -- 20 �μ��� �ִ�

SELECT MAX(HIREDATE), MIN(HIREDATE)
FROM EMP;

SELECT MAX(ENAME) FROM EMP;
-- ���ĺ� �޼��� �̸�


--�׷�ȭ

--�μ����� �޿��� �հ�

SELECT DEPTNO, SUM(SAL)  FROM EMP GROUP BY DEPTNO
ORDER BY SUM(SAL) DESC NULLS LAST, DEPTNO;

--�μ��� �ο���

SELECT
    DEPTNO
    ,COUNT(*) CNT
FROM EMP
GROUP BY DEPTNO
ORDER BY CNT;


--����, JOIN

SELECT * FROM EMP;
SELECT * FROM DEPT;

SELECT * FROM EMP, DEPT; -- �ΰ��� ���̺��� ���� ����.


SELECT * FROM EMP, DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO; -- �ΰ��� ���̺��� ���� ����.

-- ���̺���� ��Ī�� ����Ͽ� ���Ǽ����ϸ� ���ϴ�.
SELECT * FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO AND E.DEPTNO = 30; -- �ΰ��� ���̺��� ���� ����.







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
HAVING COUNT(*) > 5 -- WHERE�� ������ �����ϸ� �ȵ�
-- HAVING���� ������ �����ؾ� ��
ORDER BY DEPTNO;
