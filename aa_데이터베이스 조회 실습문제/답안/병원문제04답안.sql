--1. 2014�� 1�� 2�� ����ȯ�� ��ü ������ȸ
--   ȯ�ڹ�ȣ, ȯ���̸�, �������, ����, �����ǻ��, �������
-- ��Į�� ���������� ǥ��

SELECT P.PAT_CODE
, P.PAT_NAME 
, P.PAT_BIRTH
, P.PAT_GENDER
, (SELECT D. DOC_NAME FROM DOCTOR D 
    WHERE T.DOC_CODE = D.DOC_CODE) AS "�����ǻ��"
, (SELECT DE. DEP_NAME FROM DEPARTMENT DE, DOCTOR D
    WHERE DE.DEP_CODE = D.DEP_CODE
    AND T.DOC_CODE = D.DOC_CODE ) "�������"
FROM PATIENT P, TREAT T
WHERE P.PAT_CODE = T.PAT_CODE
AND T.TRT_YEAR = '2014' AND T.TRT_DATE = '0102'
ORDER BY PAT_CODE;


--2.2014�� 1�� 2�� ����ȯ�� �� �μ����̺��� WHERE �� SubQuery�� 
--����Ͽ� ��ȸ
--   ȯ�ڹ�ȣ, ȯ���̸�, �������, ����, �����ǻ��, �������

-- �� �ܰ��迭 ȯ�ڸ���ȸ('02xx')
-- where�� subquery

SELECT DISTINCT P.PAT_CODE
, P.PAT_NAME
, P.PAT_BIRTH
, P.PAT_GENDER
, D.DOC_NAME
, DE.DEP_NAME
FROM PATIENT P , TREAT T, DOCTOR D, DEPARTMENT DE
WHERE T.TRT_YEAR = '2014' AND T.TRT_DATE = '0102'
AND '02' = SUBSTR(DE.DEP_CODE,1,2)
AND P.PAT_CODE = T.PAT_CODE
AND D.DOC_NAME IN(SELECT DOC_NAME FROM DOCTOR D 
    WHERE D.DOC_CODE = T.DOC_CODE )
AND DE.DEP_NAME IN(SELECT DEP_NAME FROM DEPARTMENT DE, DOCTOR D
    WHERE DE.DEP_CODE = D.DEP_CODE
    AND D.DOC_CODE = T.DOC_CODE)
ORDER BY P.PAT_CODE;


