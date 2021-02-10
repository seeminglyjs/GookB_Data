

--SELECT ����

-- TABS : ��ü ���̺� ��� �ڷ����
SELECT * FROM TABS;

SELECT * FROM EMP; -- ��� ����
SELECT * FROM DEPT; -- �μ�����
SELECT * FROM salgrade; -- �޿� ��� ����
SELECT * FROM BONUS; -- ���ʽ� ����
-- SELECT �������� * ��ȣ�� ��� �÷��� ��ȸ�Ѵٴ� ��

-- EMP ���̺��� ��� �÷��� �̿��� ����Ѵ�.
SELECT * FROM EMP; 

-- EMPNO, ENAME �÷��� �����ؼ� ����Ѵ�.
-- �ķ��� ��Ī(Alias)�� �����Ͽ� ��ȸ�ϱ�
SELECT 
    EMPNO AS "��� "
    , ENAME  AS "��� �̸� " 
FROM EMP;

-- AS Ű���� ���� �����ϴ�.
SELECT 
    EMPNO  "��� "
    , ENAME   "��� �̸� " 
FROM EMP;
--���� �����͸� ��Ÿ�� �� ' ', �ĺ��ڸ� ��Ÿ�� �� " "



-- * �� ������� �ʰ� ��ü�÷��� ��������� �Ἥ ����ϴ� ��쵵 �ִ�.
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
FROM EMP;

-- WHERE �� ( ���� ������)
    
SELECT * FROM EMP
WHERE JOB = 'SALESMAN';

-- ������ 2000�̻��� �ֵ鸸 ����
SELECT * FROM EMP
WHERE SAL > 2000;

-- ������ 2000�̻��� 3000 �̸�
SELECT * FROM EMP
WHERE SAL > 2000 AND SAL < 3000;


-- �޿��� 2500�� �Ѱ� �����ڰ� �ƴ� ����� ��ȸ�ϱ�
SELECT * FROM EMP;

SELECT * FROM EMP
WHERE SAL > 2500 AND JOB != 'MANAGER';

SELECT * FROM EMP
WHERE SAL > 2500 AND NOT (JOB = 'MANAGER');


--BETWEEN A AND B
-- �����ȣ 7700 ~ 7900 ���� ��� ��ȸ
SELECT EMPNO, ENAME FROM EMP
WHERE EMPNO BETWEEN 7700 AND 7900;

-- �����ȣ 7700 ~ 7900 ������ ��� ��ȸ
SELECT EMPNO, ENAME FROM EMP
WHERE NOT (EMPNO BETWEEN 7700 AND 7900);

SELECT EMPNO, ENAME FROM EMP
WHERE  EMPNO  NOT BETWEEN 7700 AND 7900;

--����̸� 
SELECT * FROM EMP
WHERE ENAME BETWEEN 'ALIEN' AND 'KING';

SELECT * FROM EMP
WHERE ENAME >= 'ALIEN' AND ename <= 'KING';

-- IN ( LIST )

SELECT EMPNO, ENAME FROM EMP
WHERE EMPNO IN ( 7521, 7654, 7839, 7844);

SELECT EMPNO, ENAME FROM EMP
WHERE EMPNO  NOT IN ( 7521, 7654, 7839, 7844);

-- ���ڿ��� �����ϴ�.
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME IN ( 'SMITH', 'ALLEN', 'KING', 'FORD', 'JAMES');

--R���� ���
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME LIKE '%R%';

--�̸� �ι�° A ���
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME LIKE '_A%';

--�̸��� RD�� ������ ���
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME LIKE '%RD';

-- �̸��� R�� ���Ե��� �ʴ� ���
SELECT EMPNO, ENAME FROM EMP
WHERE ENAME NOT LIKE '%R%';



SELECT * FROM EMP
WHERE ENAME = 'SMITH';

--  ���� ���� �ȵǴ� LIKE ��
-- ���� ������ ���� �� LIKE ������ ������� ����
SELECT * FROM EMP
WHERE ENAME LIKE 'SMITH';
-- FULLSCAN�� �����ؼ� ��������.


--IS NULL
SELECT * FROM EMP;

-- COMM �� NULL�� �ƴ� ���
SELECT * FROM EMP
WHERE NOT COMM IS NULL ;

-- MGR �� NULL�� ����� ��ȸ�Ѵ�.
SELECT * FROM EMP
WHERE MGR IS NULL;

--  = �����ڷ� NULL�� ��ȸ�� �� ����.
--  �̴� ���� �������̱� �����̴�.



--QUIZ

SELECT * FROM EMP;

-- �μ���ȣ�� 30�̰� ������ ������ ��� ��ȸ
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO = 30 AND JOB = 'SALESMAN';

-- �μ���ȣ�� 30�̰� ������ ������ �ƴ� ��� ��ȸ
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO = 30 AND JOB != 'SALESMAN';

 -- �μ���ȣ�� 30�� �ƴϰ� ������ ������ �ƴ� ��� ��ȸ
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO != 30 AND JOB != 'SALESMAN';

 -- �����ȣ�� 7782���� 7900 ������ ��� ��ȸ
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE EMPNO BETWEEN 7782 AND 7900;

 -- ������� 'A'���� 'C'�� �����ϴ� ��� ��ȸ
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE ENAME BETWEEN 'A' AND 'C'; 
-- C �ν����ϴ� �̸��� �������� ���Ѵ�.

SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE ENAME BETWEEN 'A' AND 'C~'; 
-- ~ �� �ƽ�Ű�ڵ��� ������ ����

SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE ENAME BETWEEN 'A' AND 'D';
-- D �� �̸��̸� ��ȸ�� �ȴ�.

SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE ENAME >= 'A' AND ENAME < 'D' ; 

 -- �μ���ȣ�� 10 �Ǵ� 30�� ��� ��ȸ (IN ���)
SELECT EMPNO, ENAME, DEPTNO FROM EMP
WHERE DEPTNO IN ('10', '30' );

--COMM �� NULL �λ�� ��ȸ
SELECT * FROM EMP
WHERE COMM IS NULL ;




--ORDER BY

SELECT * FROM EMP
ORDER BY EMPNO;
-- EMPNO�÷��� �������� ASC ����(��������)

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
WHERE DEPTNO IS NOT NULL -- NULL �� ����
AND  ENAME IS NOT NULL
ORDER BY DEPTNO DESC , EMPNO ASC;

-- NULL ���� ���� ������ �߰� ����
SELECT EMPNO, ENAME, DEPTNO FROM EMP
ORDER BY DEPTNO DESC NULLS LAST , EMPNO ASC NULLS FIRST;

-- ��ȸ�Ǵ� �÷����� �������� �ʾƵ� ���ı������� ����� �� �ִ�.
SELECT EMPNO, ENAME, COMM FROM EMP
ORDER BY SAL DESC NULLS LAST;


-- DISTINCT,  �ߺ�����
-- ������� �Ҽӵ� �μ���ȣ ����
SELECT DISTINCT DEPTNO FROM EMP
ORDER BY DEPTNO;

-- �ߺ��� �����͸� �Ǵ��� ������ �� ���� ���
-- �÷��� ���ƾ� �ߺ����� �Ǻ�
SELECT DISTINCT * FROM EMP;
-- �ߺ����� �ȵ�


SELECT DISTINCT JOB FROM EMP;

-- ���ÿ� �ΰ��� �÷��� ���� �ߺ�����
-- �ΰ� �÷���� ���ƾ� �ߺ����� �ν�
SELECT DISTINCT 
    DEPTNO, JOB 
FROM EMP;

-- DISTINCT�� SELECT �ٷ� �ڿ��� ���� �� �ִ�.


-- ������ ���� ������,  ||
SELECT ENAME || ' IS ' ||JOB
FROM EMP;

SELECT ENAME || ' IS ' || JOB 
    AS "������ ����"
FROM EMP;

SELECT ENAME || ' IS HIRED AT  ' || HIREDATE 
    AS "HIREDATE"
FROM EMP;


-- DUAL ���̺�
SELECT
    'A' || 1 || 2 || 3 || 4 RESULT
FROM DUAL;
    
 SELECT 1 + 10 FROM DUAL;   
 
 SELECT 1+2, 65 * 3, 'TEST' || 'DATA' FROM DUAL;

--SQL  FUNCTIONS

--LENGTH ���ڿ� �÷��� ���̸� �����ش�. AS�� ����
SELECT ENAME, LENGTH(ENAME) LEN FROM EMP;

-- COUNT�� ���̺��� �����ͼ�(��)�� �����Ѵ�.
SELECT COUNT(*) CNT FROM EMP;


--���� �Լ�
SELECT ABS(-56) FROM DUAL;
-- ���밪 ���ϴ� �Լ�

--QUIZ

-- 12.523 -> �Ҽ������� �ݿø�
SELECT ROUND(12.523) FROM DUAL;
-- -12.723 -> �Ҽ������� �ݿø�
SELECT ROUND(-12.723) FROM DUAL;

-- 12.567 -> �Ҽ��� 3°�ڸ����� �ݿø�
SELECT ROUND(12.567,  2) FROM DUAL;

-- 12345 -> 1�� �ڸ����� �ݿø�
SELECT ROUND(1234.5) * 10  FROM DUAL;
SELECT ROUND(12345, -1)  FROM DUAL;
-- -1�� ����.


-- 56789 -> 10�� �ڸ����� �ݿø�
SELECT ROUND(567.89) * 100  FROM DUAL;
SELECT ROUND(56789, -2)  FROM DUAL;

-- 12.456 -> �Ҽ������� ����
SELECT TRUNC(12.456) FROM DUAL;

-- 12.456 -> �Ҽ��� 3°�ڸ����� ����
SELECT TRUNC(12.456, 2) FROM DUAL;

-- 12345 -> 1���ڸ����� ����
SELECT TRUNC(1234.5) * 10 FROM DUAL;
SELECT TRUNC(12345, -1)  FROM DUAL;

-- 56789 -> 10���ڸ����� ����
SELECT TRUNC(567.89) * 100 FROM DUAL;
SELECT TRUNC(56789, -2) FROM DUAL;

-- 13�� 8�� ���� ������
SELECT MOD (13 , 8) FROM DUAL;


-- 12.345 �ø� -> 13
SELECT CEIL (12.345) FROM DUAL;

-- -12.567 �ø� -> -12
SELECT CEIL (-12.567) FROM DUAL;

-- 12.567 ���� -> 12
SELECT FLOOR (12.567) FROM DUAL;

-- 12.123 ���� -> 12
SELECT FLOOR (12.123) FROM DUAL;

-- -12.567 ���� -> -13
SELECT FLOOR (-12.567) FROM DUAL;

-- -12.123 ���� -> -13
SELECT CEIL (12.123) FROM DUAL;

-- 3�� 4���� -> 81
SELECT POWER(3, 4) FROM DUAL;

-- 3�� -1 ���� -> 0.33333333333
SELECT POWER(3, -1) FROM DUAL;

-- 9�� ������ -> 3
SELECT CEIL (12.567) FROM DUAL;

-- 11�� ������ -> 3.3166.
SELECT SQRT(11) FROM DUAL;


-- ���� �Լ� ����

-- 'hELlo' ��� �빮�ڷ� ��ȯ -> HELLO
SELECT NLS_UPPER('hELlo') FROM DUAL;

-- 'hELlo' ��� �ҹ��ڷ� ��ȯ -> hello
SELECT NLS_LOWER('hELlo') FROM DUAL;

-- 'hELlo' �̴ϼ�(ù����) �빮�� -> Hello
SELECT INITCAP('hELlo') FROM DUAL;

-- 'Alice Bob'�� ���ڿ� ���� -> 9
SELECT LENGTH('Alice Bob') FROM DUAL;
-- '�ȳ��ϼ���'�� ���ڿ� ���� -> 5
SELECT LENGTH('�ȳ��ϼ���') FROM DUAL;

-- 'Alice Bob' ���ڿ� ����Ʈ �� -> 9
SELECT LENGTHB('Alice Bob') FROM DUAL;

-- 'ACE �ȳ��ϼ���'���ڿ� ����Ʈ �� -> 19
-- (����Ŭ�� �ѱ� ���ڵ��� UTF-8�� �⺻���� �ϸ�
--  UTF-8�� �ѱ� �ѱ��ڿ� 3����Ʈ�� �ʿ��ϴ�)
SELECT LENGTHB('ACE �ȳ��ϼ���') FROM DUAL;


-- 'ABCDEFGHI'���� 'D' �� ��ġ -> 4
SELECT INSTR('ABCDEFGHI', 'D') FROM DUAL;

-- 'ABCDEFGHI'���� 'DEF'���ڿ��� ��ġ -> 4
SELECT INSTR('ABCDEFGHI', 'DEF') FROM DUAL;

-- 'ABCDEFGHI'���� 'DF'���ڿ��� ��ġ -> 0 (���� ��� 0)
SELECT INSTR('ABCDEFGHI', 'DF') FROM DUAL;

-- '�ȳ��ϼ���'���� '��'���ڿ��� ��ġ -> 3
SELECT INSTR('�ȳ��ϼ���', '��') FROM DUAL;

-- 'ABCABCDDD'���� 'C'���ڿ��� ��ġ -> 3
SELECT INSTR('ABCABCDDD', 'C') FROM DUAL;

--'Oracle SQL Developer'���� 5��° �ε��� ������ ���ڿ��� �ڸ���
SELECT SUBSTR('Oracle SQL Developer', 1, 5) FROM DUAL;

--'Oracle SQL Developer'���� 5��° �ε������� 5���ڷ� �ڸ���
SELECT 
SUBSTR('Oracle SQL Developer', 1, 5), 
SUBSTR('Oracle SQL Developer', 6, 11), 
SUBSTR('Oracle SQL Developer', 12, 17) 
FROM DUAL;

--'����Ŭ SQL'���� 2��° �ε������� 5���ڷ� �ڸ���
SELECT 
SUBSTR('Oracle SQL Developer', 2, 6), 
SUBSTR('Oracle SQL Developer', 7, 12), 
SUBSTR('Oracle SQL Developer', 13, 18) 
FROM DUAL;


--'�ȳ��ϼ������Ŭ'���� 3��° ���� �ڸ���
SELECT 
SUBSTR('�ȳ��ϼ������Ŭ', 3)
FROM DUAL;


