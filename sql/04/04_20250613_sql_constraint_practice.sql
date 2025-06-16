CREATE TABLE practice_constraints (
	student_id bigint PRIMARY KEY comment '學號',
	name varchar(50) NOT NULL comment '姓名',
	age int CHECK (age >=0 AND age < 120) comment '年齡',
	phone varchar(10) UNIQUE KEY comment '電話',
	email varchar(255) comment '電子信箱',
	registration_date date DEFAULT (current_date) comment '註冊日期',
	class_id varchar(10) comment '外鍵',
	FOREIGN key(class_id) REFERENCES class_info (class_id)
);

CREATE TRIGGER email_constraints
BEFORE INSERT ON practice_constraints
FOR EACH ROW
BEGIN
    SET NEW.email = CONCAT(NEW.student_id, '@tbm.com');
END;


INSERT INTO practice_constraints (student_id, name, age, phone, class_id)
VALUES 
(1001, 'Alice', 20, '0912345678', 'JAVA101'),
(1002, 'Bob', 25, '0922333444', 'JAVA102'),
(1003, 'Charlie', 30, '0933221144', 'JAVA103');

SELECT * FROM practice_constraints;
