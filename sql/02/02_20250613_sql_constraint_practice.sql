/* 練習使用約束
** 準備一個表格叫 practice_constraints，並設定約束如下
** 
** 列名	資料類型	約束條件	註解
** student_id	bigint UNSIGNED	PRIMARY KEY	學號
** name	varchar(50)	NOT NULL	姓名
** age	int UNSIGNED	CHECK(age >= 0 AND age < 120)	年齡
** phone	varchar(10)	UNIQUE KEY	電話
** email	varchar(255)	DEFAULT (concat(student_id, '@tbm.com'))	電子信箱
** registration_date	date	DEFAULT (current_date)	註冊日期
** class_id	varchar(10)	FOREIGN KEY (class_id) REFERENCES class_info (class_id)	外鍵
** 最後，請新增三筆符合上述約束的資料
*/ 

DROP TABLE IF EXISTS practice_constraints;

CREATE TABLE practice_constraints (
    student_id bigint PRIMARY KEY COMMENT '學號',
    name VARCHAR(50) NOT NULL COMMENT '姓名',
    age int NOT NULL COMMENT '年齡',
    phone VARCHAR(10) COMMENT '電話',
    email VARCHAR(255) DEFAULT (concat(student_id, '@tbm.com')) COMMENT '電子信箱',
    registration_date DATE NOT NULL DEFAULT (current_date) COMMENT '註冊日期',
    class_id varchar(10) NOT NULL COMMENT '外鍵',
    -- 限制條件
    CONSTRAINT ck_age CHECK (((age >= 0) and (age < 120))),
    CONSTRAINT uK_phone UNIQUE (phone),
    CONSTRAINT fk_class_id_class_info_class_id
        FOREIGN KEY (class_id) 
        REFERENCES class_info(class_id)
	        ON UPDATE CASCADE
) COMMENT '約束練習表格';

INSERT INTO practice_constraints (student_id, name, age, phone, email, registration_date, class_id)
VALUES (10, 'Sara', 23, '0901234567', 'sara@tbm.com', '2024-01-01', 'JAVA101'),
(12, 'Olivia', 22, '0923456780', DEFAULT, '2024-01-02', 'JAVA102'),
(24, 'Eric', 26, '0912345789','eric.t@tbm.com','2024-01-03','JAVA103');