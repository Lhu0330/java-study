CREATE TABLE tblMember (
 id VARCHAR(20) primary KEY,
 pwd CHAR(20) NOT NULL,
 name VARCHAR(20) NOT NULL,
 phone CHAR(13) NOT NULL,
 team CHAR(20) NOT null
)

INSERT tblmember 
VALUES ('aaa', '1234', 'ȫ�浿', '010-2222-1234', '����')


INSERT tblmember 
VALUES ('bbb', '1234', '��ȣ��', '010-1234-4444', 'MC')

INSERT tblmember 
VALUES ('ccc', '1234', '�嵿��', '010-5555-4321', '���')