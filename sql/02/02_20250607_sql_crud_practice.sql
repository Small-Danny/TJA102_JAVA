-- 寫一個SQL語句，創建一張會員資料表 member_info，欄位有
-- member_id, account, password, member_name, address 以及 email，以下是詳細資訊:
-- 
-- Column Name	Data Type	Comment
-- member_id	數字類型	會員編號
-- account	字串類型	帳號
-- password	字串類型	密碼
-- member_name	字串類型	會員名稱
-- address	字串類型	地址
-- email	字串類型	電子信箱
DROP TABLE member_info;

CREATE TABLE member_info (
	member_id bigint comment '會員編號',
	account	varchar(255) comment '帳號',
	password varchar(255) comment '密碼',
	member_name varchar(255) comment '會員名稱',
	address varchar(255) comment '地址',
	email varchar(255) comment '電子信箱'
) comment '會員資料表';

-- 寫一個SQL語句，一次新增三筆資料
-- member_id	account	password	member_name	address	email
-- 1	mem001	pass1234	John Doe	123 Main St, City	john.doe@example.com
-- 2	mem002	pass5678	Jane Smith	456 Elm St, Town	jane.smith@example.com
-- 3	mem003	pass91011	Alice Brown	789 Oak St, Village	alice.brown@example.com

INSERT INTO member_info (member_id, account, password, member_name, address, email) VALUES
(1, 'mem001', 'pass1234', 'John Doe', '123 Main St, City', 'john.doe@example.com'),
(2, 'mem002', 'pass5678', 'Jane Smith', '456 Elm St, Town','jane.smith@example.com'),
(3, 'mem003', 'pass91011', 'Alice Brown', '789 Oak St, Village', 'alice.brown@example.com');

-- 修改資料
-- 寫一個SQL語句，將1號會員的密碼修改成 ji394mysql
-- 寫一個SQL語句，將3號會員的名稱及電子信箱分別修改成 Vic Liu 及 vic.liu@example.com
UPDATE member_info SET password='ji394mysql'
WHERE member_id=1;

UPDATE member_info SET member_name='Vic Liu', email='vic.liu@example.com'
WHERE member_id=3;

-- 搜尋資料
-- 寫一個SQL語句，以帳號mem002、密碼pass5678當作搜尋條件，找出符合條件的資料
-- 情境題: 你是一位正在進行登入操作的1號會員，請輸入你的帳號密碼，藉此讓資料庫撈出屬於你的那筆數據。
-- 搜尋資料參考範例:

SELECT * FROM member_info
WHERE account = 'mem002'
AND password = 'pass5678';

SELECT * FROM member_info
WHERE account = 'mem001'
AND password = 'ji394mysql';