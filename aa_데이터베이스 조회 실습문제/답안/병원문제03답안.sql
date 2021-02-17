--1. 2013년 1월 25일 내원한 환자중 다음의 정보조회
-- 진료과명, 진료의사명, 접수시간, 환자번호, 환자이름, 생년월일, 성별
--(진료과, 진료의, 접수시간으로 내림차순 정렬)
SELECT DE.DEP_NAME, D.DOC_NAME, TRT_RECEIPT
, P.PAT_CODE, P.PAT_NAME, PAT_BIRTH, PAT_GENDER
FROM PATIENT P, DOCTOR D, TREAT T, DEPARTMENT DE
WHERE  P.PAT_CODE = T.PAT_CODE
AND D.DOC_CODE = T.DOC_CODE
AND DE.DEP_CODE = D.DEP_CODE
AND(TRT_DATE = '0125' AND TRT_YEAR = '2013')
ORDER BY DE.DEP_NAME , D.DOC_CODE DESC, TRT_RECEIPT DESC;

-- 3. 1번을 ANSI 코드로 작성하시오
SELECT DE.DEP_NAME, D.DOC_NAME, TRT_RECEIPT
, P.PAT_CODE, P.PAT_NAME, PAT_BIRTH, PAT_GENDER
FROM PATIENT P
INNER JOIN TREAT T
ON P.PAT_CODE = T.PAT_CODE
INNER JOIN DOCTOR D
ON D.DOC_CODE = T.DOC_CODE
INNER JOIN DEPARTMENT DE
ON DE.DEP_CODE = D.DEP_CODE
AND(TRT_DATE = '0125' AND TRT_YEAR = '2013')
ORDER BY DE.DEP_NAME , D.DOC_CODE DESC, TRT_RECEIPT DESC;



--2. 2013년 12월 25일 내원한 환자의 다음 정보조회
--내원일자, 환자번호, 환자이름, 생년월일, 성별
--*단 2014년 이후로 입원했던적이 있다면 입원일자, 입원시간도 출력
--(진료시간 기준 정렬)
-- OUTER JOIN (+)

SELECT INP_DATE, INP_YEAR FROM inpatient;

SELECT T.TRT_DATE, P.PAT_CODE, P.PAT_NAME, P.PAT_BIRTH, P.PAT_GENDER
, CASE 
    WHEN I.INP_YEAR >= '2014' THEN I.INP_YEAR
    ELSE NULL 
    END INP_YEAR
, CASE 
    WHEN I.INP_YEAR >= '2014' THEN I.INP_DATE
    ELSE NULL 
    END INP_DATE
,CASE 
    WHEN I.INP_YEAR >= '2014' THEN I.INP_TIME
    ELSE NULL 
    END INP_TIME
FROM PATIENT P, INPATIENT I, TREAT T
WHERE (TRT_DATE = '1225' AND TRT_YEAR = '2013') 
AND P.PAT_CODE = T.PAT_CODE
AND I.PAT_CODE (+) = P.PAT_CODE
ORDER BY T.TRT_TIME;

-- 4. 2번을 ANSI 코드로 작성하시오
SELECT T.TRT_DATE, P.PAT_CODE, P.PAT_NAME, P.PAT_BIRTH, P.PAT_GENDER
, CASE 
    WHEN I.INP_YEAR >= '2014' THEN I.INP_YEAR
    ELSE NULL 
    END INP_YEAR
, CASE 
    WHEN I.INP_YEAR >= '2014' THEN I.INP_DATE
    ELSE NULL 
    END INP_DATE
,CASE 
    WHEN I.INP_YEAR >= '2014' THEN I.INP_TIME
    ELSE NULL 
    END INP_TIME
FROM PATIENT P  
INNER JOIN TREAT T
ON P.PAT_CODE = T.PAT_CODE
RIGHT OUTER JOIN INPATIENT I
ON I.PAT_CODE = P.PAT_CODE
AND (TRT_DATE = '1225' AND TRT_YEAR = '2013')  
ORDER BY T.TRT_TIME;


