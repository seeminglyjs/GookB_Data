SELECT * FROM dept;

SELECT * FROM emp;

--NUMBER ' --' 는 한줄 주석이다.  단축키 CTRL + /
CREATE TABLE type_test_01 (
    data1 NUMBER,
    data2 NUMBER(10),
    data3 NUMBER(5,2)
);

desc type_test_01;

--데이터 삽입, INSERT
--INSERT INTO  테이블명(컬럼명1, 컬럼명2, . . .)
--VALUES( 데이터1, 데이터2, . . .)

INSERT INTO type_test_01 (data1) VALUES(12345678992323232323);
INSERT INTO type_test_01 (DATA2) VALUES(777777);

--데이터 조회 SELECT
SELECT * FROM type_test_01;

-- 앞자리가 0이면 숫자로 표현하지 않고 문자로 표현해야 한다.
INSERT INTO type_test_01( DATA1) VALUES(01023456789);
SELECT * FROM type_test_01;


--data2 : NUMBER(10);

--INSERT INTO type_test_01 (data2) VALUES (12123456789034567890 );
-- 위의 코드는 10자리 넘어가기 떄문에 오류가 난다.

INSERT INTO type_test_01 (data2) VALUES (121234.6789 );
-- 소수점 이하는 반올림이 됨
SELECT * FROM type_test_01;

INSERT INTO type_test_01 (data3) VALUES(345.46);
-- 소수점 표시를 해주어 잘 들어간다.

SELECT * FROM type_test_01;


INSERT INTO type_test_01 (data3) VALUES(345.333334444);
-- 초과하는 소숫점 자리는 반올림되어서 보인다.

SELECT * FROM type_test_01;


--VARCHAR2 (N) : 문자

CREATE TABLE type_test_02 (
    data VARCHAR2(10)

 );

DESC type_test_02;

INSERT INTO type_test_02 (DATA) VALUES('HIHIHIHIHI');

SELECT * FROM type_test_02;


INSERT INTO type_test_02 (DATA) VALUES('안녕하');
-- 10 BYTE 는 한글3글자 까지만 허용된다.
-- 한글은 1글자에 3BYTE

SELECT * FROM type_test_02;

INSERT INTO  type_test_02 (DATA) VALUES('뷁뷁뷁');

SELECT * FROM type_test_02;

-- CHAR(N) : 고정 길이 문자

CREATE TABLE TYPE_TEST_03(
    data1 CHAR,
    data2 CHAR(10),
    data3 CHAR(10 CHAR)
);

DESC type_test_03;

INSERT INTO type_test_03 (DATA1, DATA2, DATA3) VALUES(
'1', '1234567', '1234534');

SELECT * FROM type_test_03;

INSERT INTO type_test_03 (DATA1, DATA2, DATA3) VALUES(
'1', '1234567', '안녕하세요');


INSERT INTO type_test_03 (DATA2) VALUES ('123');

-- DATE : 날짜시간타입
CREATE TABLE type_test_04 (
    data DATE
);


INSERT INTO type_test_04 VALUES(SYSDATE);
-- 현재 날짜시간

INSERT INTO type_test_04 VALUES('2021/03/13');

SELECT * FROM type_test_04;
SELECT to_char (data, 'YYYY/MM/DD/ HH24:MI:SS dy' ) FROM type_test_04;


--LONG 
CREATE TABLE type_test_05 (
    data LONG
    );
    
    DESC type_test_05;
    
INSERT INTO type_test_05 VALUES('HI HELLO');

SELECT * FROM type_test_05;

INSERT INTO type_test_05 VALUES( 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec suscipit sit amet sem ut porttitor. Donec a purus mauris. Aliquam erat volutpat. Aenean et sapien id tortor sollicitudin semper quis eu risus. Nulla et augue ut lectus rutrum consectetur. Interdum et malesuada fames ac ante ipsum primis in faucibus. Proin elementum molestie purus nec sollicitudin. Duis at tristique libero. Duis in imperdiet ante, non pharetra libero.

Duis tincidunt euismod lorem efficitur maximus. Proin pellentesque tincidunt nibh ac aliquet. Etiam convallis dolor id erat tempus, id feugiat tellus ultricies. Donec pellentesque lacus urna, nec tempor nisi pharetra sed. Quisque consectetur ligula sed tincidunt cursus. Nullam rhoncus nisl sit amet mauris venenatis posuere. Quisque vel cursus orci, non hendrerit leo.

Cras fringilla vel enim ac commodo. Aliquam mi nunc, ultrices in consequat quis, egestas nec magna. Nulla et tellus ex. Nunc dapibus gravida sodales. Nunc nisi lacus, cursus euismod urna non, bibendum sagittis neque. Integer id nisi in diam fermentum euismod eget id nibh. Vestibulum porta nisl ut odio sollicitudin pulvinar eget ut ex. Phasellus aliquet justo diam, id tempus nisl fringilla non.

Aenean consequat justo nec bibendum consectetur. Curabitur at tincidunt sapien. Etiam vestibulum magna ullamcorper purus mattis facilisis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Nunc quis lorem placerat, iaculis urna vitae, vestibulum ligula. Donec efficitur, massa blandit posuere tristique, libero urna consectetur metus, at bibendum neque risus a sem. Pellentesque eget luctus elit. Etiam eleifend lorem at purus congue, eu placerat quam mattis. Suspendisse at est varius, tincidunt dui nec, condimentum lacus. Aliquam efficitur nulla ut dapibus aliquam. Nunc aliquam dolor ac ex aliquam, ac interdum augue hendrerit. Aliquam pellentesque magna urna, sed blandit mi pharetra eu. Phasellus sollicitudin elit libero, eget efficitur est ullamcorper eget. Nulla egestas finibus malesuada. Nullam interdum leo quis neque egestas malesuada sit amet vitae ex. Nam sit amet sagittis sem, sed feugiat neque.

Duis egestas, leo ut sodales placerat, arcu nunc pellentesque orci, a dictum arcu velit eget urna. Praesent egestas porta dignissim. Etiam magna diam, tincidunt vestibulum nunc non, posuere aliquam sapien. Donec convallis sollicitudin elementum. Donec quis felis convallis, dignissim magna sed, fermentum nisl. Curabitur egestas libero nec velit dictum, non rutrum risus pellentesque. Donec nec arcu nec urna efficitur ultricies.' );

SELECT * FROM type_test_05;