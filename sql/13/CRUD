CREATE TABLE member_info (
    member_id BIGINT COMMENT '會員編號',
    account VARCHAR(255) COMMENT '帳號',
    password VARCHAR(255) COMMENT '密碼',
    member_name VARCHAR(255) COMMENT '會員名稱',
    address VARCHAR(255) COMMENT '地址',
    email VARCHAR(255) COMMENT '電子信箱',
);

INSERT INTO member_info (member_id, account, password, member_name, address, email) 
VALUES 
(1, 'mem001', 'pass1234', 'John Doe', '123 Main St, City', 'john.doe@example.com'),
(2, 'mem002', 'pass5678', 'Jane Smith', '456 Elm St, Town', 'jane.smith@example.com'),
(3, 'mem003', 'pass91011', 'Alice Brown', '789 Oak St, Village', 'alice.brown@example.com');

UPDATE
    member_info
SET
    password = 'ji394mysql'
WHERE
    member_id = 1;

UPDATE
    member_info
SET
    name = 'Vic Liu' , email = 'vic.liu@example.com'
WHERE
    member_id = 3;

SELECT * FROM member_info
WHERE account = 'mem002' 
AND password = 'pass5678';

SELECT * FROM member_info
WHERE account = 'mem001' 
AND password = 'ji394mysql';
