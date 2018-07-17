DROP DATABASE IF EXISTS book;
CREATE DATABASE book;
USE book;


DROP TABLE IF EXISTS books;
CREATE TABLE books(
id INT(11) PRIMARY KEY AUTO_INCREMENT COMMENT '每一本书',
ISBN  INT (11) NOT NULL COMMENT '编号',
`name` VARCHAR (250) NOT NULL COMMENT '姓名',
price VARCHAR (50) NOT NULL COMMENT '价格',
discout VARCHAR (20) COMMENT '折扣',
publisher VARCHAR (100) NOT NULL COMMENT '出版社'
 );



INSERT INTO books (ISBN,`name`,price,discout,publisher) VALUES (12315,'光人日记','20','8.5','青鸟出版社');
INSERT INTO books (ISBN,`name`,price,discout,publisher) VALUES (12316,'光之子','30','8','青鸟出版社');
INSERT INTO books (ISBN,`name`,price,discout,publisher) VALUES (12317,'龙王传说','120','7','青鸟出版社');
INSERT INTO books (ISBN,`name`,price,discout,publisher) VALUES (12318,'钢铁是怎么炼成的','10','9','青鸟出版社');
INSERT INTO books (ISBN,`name`,price,publisher) VALUES (22536,'元尊','20','青鸟出版社');


SELECT * FROM books;