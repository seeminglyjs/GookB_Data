

--권한 자료사전

SELECT * FROM USER_SYS_PRIVS; -- 사용자계정이 부여한 시스템 계정
SELECT * FROM USER_TAB_PRIVS; --사용자계정이 부여한 객체 권한

SELECT * FROM DBA_SYS_PRIVS; -- 관리자계정이 부여한 시스템 권한
SELECT * FROM DBA_TAB_PRIVS; -- 관리자 계정이 부여한

--(SCOTT계정 이용)
--TEST 사용자계정 생성하기 (TEST/1234)
CREATE USER TEST IDENTIFIED BY 1234;

--(SYSTEM계정이용)
CREATE USER TEST IDENTIFIED BY 1234;

--(SYSTEM계정이용)
--TEST계정에 데이터베이스 
GRANT CREATE SESSION
to test;

SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE = 'TEST';

-- 시스템 권한 회수
REVOKE CREATE SESSION
FROM TEST;


--(SYSTEM계정이용)
SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE = 'SCOTT';


--ROLE(롤) 자료사전
SELECT * FROM DBA_ROLE_PRIVS
WHERE GRANTEE = 'SCOTT';

-- RESOURCE, CONNECT 롤에 부여된 권한 조회
--> SCOTT에게 부여된 권한들
SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE IN ( 'RESOURCE', 'CONNECT')
ORDER BY GRANTEE, PRIVILEGE;


--ROLE을 포함한 시스템 권한 조회
SELECT * FROM DBA_SYS_PRIVS --롤을 통해 부여된 시스템권한
WHERE grantee IN (
    SELECT granted_role FROM DBA_ROLE_PRIVS
    WHERE grantee=upper('scott') )
UNION
SELECT * FROM DBA_SYS_PRIVS --계정에 부여된 시스템권한
WHERE grantee=upper('scott');


--(SYSTEM 계정이용)
GRANT RESOURCE, CONNECT
TO TEST;


--(SYSTEM 계정이용)
REVOKE RESOURCE, CONNECT
FROM TEST;

--(SYSTEM 계정이용)
GRANT RESOURCE, CONNECT
TO TEST;

--(scott계정 이용)
GRANT SELECT --객체 조회 권한 부여
ON EMP -- EMP 테이블에 대한 권한
TO TEST; -- TSET 계정에 부여




--인덱스 자료사전
SELECT * FROM user_indexes
WHERE table_name = 'EMP';

-- 인덱스가 적용된 컬럼 자료사전

SELECT * FROM user_ind_columns
--WHERE table_name = 'EMP'; -- 테이블 이름으로 조회
WHERE INDEX_NAME = 'PK_EMP'; -- 인덱스이름으로 조회


--SALGRADE 테이블에 적용된 인덱스 조회
SELECT * FROM user_indexes
WHERE table_name =  'SALGRADE';

SELECT * FROM SALGRADE;

-- 인덱스 생성
CREATE INDEX idx_salgrade
ON SALGRADE ( GRADE) ; 

SELECT * FROM SALGRADE;
INSERT INTO SALGRADE VALUES (5, 777, 8888); -- 중복 허용


--인덱스 재생성
ALTER INDEX IDX_SALGRADE REBUILD;


--인덱스 삭제
DROP INDEX IDX_SALGRADE;

--UNIQUE 인덱스 만들기
CREATE UNIQUE INDEX IDX_SALGRADE
ON SALGRADE( GRADE);

--중복행을 제거한다.
DELETE FROM SALGRADE 
WHERE HISAL ='8888';

SELECT * FROM SALGRADE;



-- 부서 , 이름을 조회
SELECT * FROM EMP
WHERE DEPTNO = 10
 AND ENAME = 'MILLER';
 
 -- 복합 컬럼 인덱스
 CREATE INDEX IDX_EMP_DEPTNO_ENAME
 ON EMP (DEPTNO, ENAME);
 
 --인덱스 삭제
DROP INDEX IDX_EMP_DEPTNO_ENAME;




SELECT * FROM 

--(SCOOTT) 계정 이용
CREATE VIEW TEST_VIEW
AS(
    SELECT * FROM EMP
    WHERE EMPNO < 7600
); -- 아직 권한 없어서 안됨

--(SYSTEM) 계정 이용 WEB_ADMIN
GRANT CREATE VIEW
TO SCOTT;

--(SCOOTT) 계정 이용 WEB
CREATE VIEW TEST_VIEW
AS(
    SELECT * FROM EMP
    WHERE EMPNO < 7600
); 

-- 뷰 자료사전
SELECT * FROM USER_VIEWS
WHERE VIEW_NAME = 'TEST_VIEW';


SELECT * FROM TEST_VIEW;
-- 인라인 뷰다.
--SELET * FROM(
--    SELECT * FROM EMP
--    WHERE EMPNO < 7600
--); 


-- 뷰 연산시의 제약성
-- CREATE VIEW -- 뷰 생성
-- CREATE OR REPLACE -- 뷰생성 OR 뷰 변경

CREATE OR REPLACE VIEW TEST_VIEW
AS (
    SELECT * FROM EMP WHERE EMPNO < 7700
);

INSERT INTO TEST_VIEW (EMPNO, ENAME)
VALUES( 7000, '뷰TEST');

INSERT INTO TEST_VIEW (EMPNO, ENAME)
VALUES( 9000, '뷰TEST');
-- 안보임 범위를 초과함

SELECT * FROM EMP 
WHERE EMPNO = 9000;


-- WITH CHECK OPTION 적용하기
CREATE OR REPLACE VIEW TEST_VIEW
AS (
    SELECT EMPNO,ENAME FROM EMP WHERE EMPNO < 7700
)
WITH CHECK OPTION;

INSERT INTO TEST_VIEW VALUES ( 7650, 'TEST22');
INSERT INTO TEST_VIEW VALUES ( 7750, 'TEST22'); -- 범위 초과해서 인설트 안됨


-- 시퀀스, Sequence
-- 시퀀스 생성
CREATE SEQUENCE SEQ_EMP;
--시퀀스 자료사전
SELECT * FROM USER_SEQUENCES;



--현재 시퀀스의 값 : 시퀀스명.currval ->(current value)
--다음 시퀀스 값 생성 : 시퀀스명.nextval ->(next value)

SELECT SEQ_EMP.CURRVAL FROM DUAL;
-- 한번도 NEXTVAL를 하지 않으면 CURRVAL은 존재하지 않는다.

SELECT SEQ_EMP.NEXTVAL FROM DUAL;
SELECT SEQ_EMP.CURRVAL FROM DUAL;

SELECT * FROM USER_VIEWS;

INSERT INTO EMP (EMPNO, ENAME)
VALUES (SEQ_EMP.NEXTVAL, 'SE_NO');

SELECT * FROM EMP WHERE EMPNO < 1000;

-- 시쿼스 삭제
DROP SEQUENCE SEQ_EMP;



--조건(옵션)을 부여해서 시퀀스 생성하기
CREATE SEQUENCE TEST_SEQ
START WITH 2001 -- 시작값
INCREMENT BY 100 -- 증가값
MINVALUE 2001 -- 최소값
MAXVALUE 3000; -- 최대값

SELECT TEST_SEQ.NEXTVAL FROM DUAL;

--에러, 캐시의 숫자가 한 사이클보다 작아야함
ALTER SEQUENCE TEST_SEQ
CYCLE;


SELECT * FROM USER_SEQUENCES
WHERE SEQUENCE_NAME = 'TEST_SEQ';


-- 해결, 캐시의 크기를 한 사이클의 개수보다 작게 설정한다.
ALTER SEQUENCE TEST_SEQ
CACHE 5
CYCLE;

SELECT TEST_SEQ.NEXTVAL FROM DUAL;



--	1.
--	MyBoard Table 생성
--	  boardno NUMBER, title VARCHAR2(300)
--	SEQ_MyBoard Sequence 생성
CREATE TABLE MyBoard (
boardno NUMBER PRIMARY KEY
, title VARCHAR2(300)
);
--DROP TABLE MYBOARD;

CREATE SEQUENCE SEQ_MyBoard;


--	2.
--	AttachFile Table 생성
--	  fileno NUMBER, boardno NUMBER, filename VARCHAR2(200)
--	SEQ_AttachFile Sequence 생성

CREATE TABLE AttachFile (
fileno NUMBER PRIMARY KEY
, boardno NUMBER
, filename VARCHAR2(200)
, FOREIGN KEY (BOARDNO) 
REFERENCES MYBOARD (BOARDNO) 
);

CREATE SEQUENCE SEQ_AttachFile;

--	** 게시글과 첨부파일이 관계를 가지도록 PK,FK를 적절히 설정
--ALTER TABLE MYBOARD ADD PRIMARY KEY(BOARDNO);
--ALTER TABLE ATTACHFILE ADD PRIMARY KEY(FILENO);
--ALTER TABLE ATTACHFILE ADD FOREIGN KEY(BOARDNO)
--REFERENCES MYBOARD(BOARDNO);

--	3. (시퀀스 활용할 것)
--	MyBoard TB에 게시글 INSERT
--	AttachFile TB에 첨부파일 INSERT
--
--	게시글제목 : 안녕하세요
--	첨부파일명 : Hello.jpg

INSERT INTO MYBOARD 
VALUES ( SEQ_MyBoard.NEXTVAL, '안녕하세요');

INSERT INTO AttachFile 
VALUES ( SEQ_AttachFile.NEXTVAL, SEQ_MyBoard.CURRVAL,'Hello.JPG');
 
SELECT * FROM MYBOARD;
SELECT * FROM AttachFile;


--조인해사 한번에 확인하기
SELECT * FROM MYBOARD B, AttachFile A
WHERE B.BOARDNO = A.BOARDNO;

--첨부파일 없이 게시글이 등록되는 상황 테스트
INSERT INTO MYBOARD VALUES (SEQ_MYBOARD.NEXTVAL, 'HI');
INSERT INTO MYBOARD VALUES (SEQ_MYBOARD.NEXTVAL, 'HELLO');

SELECT * FROM MYBOARD;

--외부 조인 -- 첨부파일 없이 게시글만 작성된 경우
SELECT * FROM MYBOARD B, AttachFile A
WHERE B.BOARDNO = A.BOARDNO(+);

DESC ATTACHFILE;
--VIEW 생성 게시글과 첨부파일 보는 뷰
CREATE OR REPLACE VIEW BOARD_WITH_FILE
AS (
    SELECT B.BOARDNO, TITLE, FILENO, FILENAME 
    FROM MYBOARD B, AttachFile A
    WHERE B.BOARDNO = A.BOARDNO(+)
)WITH READ ONLY;

SELECT * FROM BOARD_WITH_FILE;