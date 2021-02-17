

--1. ������ ������ �������� ���� ȯ�� ��ȸ
SELECT PAT_NAME FROM PATIENT
WHERE PAT_NAME LIKE '��%' AND PAT_GENDER = 'M';

--2. ������ ������ �������� ���� ȯ���� 1979����� �ƴ� ��ȸ
SELECT PAT_NAME, PAT_BIRTH FROM PATIENT
WHERE PAT_NAME LIKE '��%' AND SUBSTR(PAT_BIRTH,1,4) != '1979';

--3. ��������� 1980��� ���� 1989��� ���� ȯ�� �� ���ڸ� ��ȸ
SELECT PAT_NAME, PAT_BIRTH FROM PATIENT
WHERE PAT_GENDER = 'F' 
AND PAT_BIRTH >= 19800101 AND PAT_BIRTH <= 19891231;

--4. ȯ���̸��� 4���̸� '����'���� ������ ȯ�� �� ��������� 2004��� ���� ȯ�ڸ� ��ȸ
SELECT PAT_NAME, PAT_BIRTH FROM PATIENT
WHERE PAT_NAME LIKE '__����' 
AND PAT_BIRTH <= 20050000 AND PAT_BIRTH >= 20040000;


--5. 2000��� ���� �� �̸� �� �α��ڰ� 'ȯ��'�� ������ �ʴ� ȯ����ȸ
SELECT PAT_NAME, PAT_BIRTH FROM PATIENT
WHERE PAT_NAME NOT LIKE '__ȯ��'
AND PAT_GENDER = 'F' 
AND PAT_BIRTH <= 20010000 AND PAT_BIRTH >= 20000000;


--6. ȯ���̸��� 4���λ�� �߿� �޴��� ��ȣ�� ��ϵǾ����� ���� ȯ����ȸ
SELECT PAT_NAME, PAT_BIRTH FROM PATIENT
WHERE PAT_NAME  LIKE '____'
AND PAT_TEL IS NULL;