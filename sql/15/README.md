DROP TABLE IF EXISTS member_info;

-- 創建一張會員資料表 member_info
CREATE TABLE member_info(
member_id INT COMMENT '會員編號',
account VARCHAR(12) COMMENT '帳號',
password VARCHAR(12) COMMENT '密碼',
member_name VARCHAR(12) COMMENT '會員名稱',
address VARCHAR(255) COMMENT '地址',
email VARCHAR(255) COMMENT '電子信箱'
)COMMENT '會員資料表';

-- 寫一個SQL語句，一次新增三筆資料
INSERT INTO member_info(member_id, account, password, member_name, address, email)VALUES
(1,'mem001','pass1234','John Doe','123 Main St, City','john.doe@example.com'),
(2,'mem002','pass5678','Jane Smith','456 Elm St, Town','jane.smith@example.com'),
(3,'mem003','pass91011','Alice Brown','789 Oak St, Village','alice.brown@example.com');

-- 寫一個SQL語句，將1號會員的密碼修改成 ji394mysql
UPDATE
    member_info
SET
    password = 'ji394mysql'
WHERE
    member_id = 1;
    
SELECT * FROM member_info;

-- 寫一個SQL語句，將3號會員的名稱及電子信箱分別修改成 Vic Liu 及 vic.liu@example.com
UPDATE
    member_info
SET
    member_name = 'Vic Liu',
    email = 'vic.liu@example.com'
WHERE
    member_id = 3;

-- 寫一個SQL語句，以帳號mem002、密碼pass5678當作搜尋條件，找出符合條件的資料
SELECT * FROM member_info
WHERE account = 'mem002'
AND password = 'pass5678';

