DROP TABLE IF EXISTS practice_constraints;
-- 創建部門表格
CREATE TABLE practice_constraints(
student_id bigint comment "學號",
name varchar(50) comment "姓名",
age int comment "年齡",
phone varchar(10) comment "電話",
email varchar(255) comment "電子信箱",
registration_date date comment "註冊日期",
class_id varchar(10) comment "外鍵"
);
-- 限制條件
CONSTRAINT student_id UNSIGNED PRIMARY KEY 學號
CONSTRAINT name varchar(50) NOT NULL 姓名
CONSTRAINT ck.age int UNSIGNED CHECK(age >= 0 AND age < 120) 年齡
CONSTRAINT uk.phone varchar(10) UNIQUE KEY 電話
CONSTRAINT email varchar(255) DEFAULT (concat(student_id, '@tbm.com')) 電子信箱
CONSTRAINT registration_date date DEFAULT ((current_date)) 註冊日期
CONSTRAINT fk.class_id varchar(10) FOREIGN KEY (class_id) REFERENCES class_info (class_id) 外鍵

-- 最後，請新增三筆符合上述約束的資料
INSERT INTO practice_constraints(student_id,name,age,phone,email,registration_date,class_id)
VALUES
(2501,"Danny",30,'0123456789','2051@tbm.com','2025-06-27','CS101'),
(2502,"ivy",30,'9123456789','2052@tbm.com','2025-06-27','CS102'),
(2503,"sandy",29,'0288456789','2051@tbm.com','2025-06-27','CS101');