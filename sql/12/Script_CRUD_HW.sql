-- 建立表格叫做student_info (欄位一 student_id, 欄位二 name)
CREATE TABLE student_info(
	student_id bigint comment '學號',
	name varchar(255) comment '姓名'
) comment '學生資料表';

DROP TABLE student_info;


DROP TABLE student_info;

CREATE TABLE member_info(
	member_id bigint comment '會員編號',
	account varchar(255) comment '帳號',
	password varchar(255) comment '密碼',
	member_name varchar(255) comment '會員名稱',
	address varchar(255) comment '地址',
	email varchar(255) comment '電子信箱'
) comment '會員資料表';

-- create => insert into
INSERT INTO member_info (member_id, account, password, member_name, address, email) VALUES
(1, 'mem001', 'pass1234', 'John Doe', '123 Main St,City', 'john.doe@example.com'),
(2, 'mem002', 'pass5678', 'Jane Smith', '456 Elm St,Town','jane.smith@example.com'),
(3, 'mem003', 'pass91011', 'Alice Brown', '789 Oak St,Village','alice.brown@example.com');

UPDATE member_info
SET
	password = 'ji394mysql'
WHERE member_id = 1;

UPDATE member_info
SET 
	member_name = 'Vic Liu',
	email = 'vic.liu@example.com'
WHERE member_id = 3;


SELECT * FROM member_info
WHERE account = 'mem002'
AND password = 'pass5678';

SELECT * FROM member_info
WHERE account = 'mem001'
AND password = 'pass1234';

SELECT * FROM member_info
WHERE account = 'mem003'
AND password = 'pass91011';






