DROP DATABASE IF EXISTS db_library;
CREATE DATABASE db_library;
USE db_library;

-- 创建书架表
CREATE TABLE tb_bookcase (
	id INT NOT NULL AUTO_INCREMENT COMMENT '书架id',
	name VARCHAR(30) UNIQUE NOT NULL COMMENT '书架名',
	is_delete INT DEFAULT 0 COMMENT '是否删除',
	created_user VARCHAR(30) COMMENT '创建人',
	created_time DATETIME COMMENT '创建时间',
	modified_user VARCHAR(30) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间',
	PRIMARY KEY (id)
) DEFAULT CHARSET=utf8;

-- 插入书架表数据
INSERT INTO tb_bookcase (name) VALUES ('A架'),('B架'),('C架'),('D架'),('E架');

-- 创建图书馆表
CREATE TABLE tb_library (
	name VARCHAR(50) COMMENT '图书馆名',
	curator VARCHAR(20) COMMENT '馆长名',
	tel VARCHAR(20) COMMENT '电话',
	address VARCHAR(100) COMMENT '地址',
	email VARCHAR(100) COMMENT '邮箱',
	website VARCHAR(100) COMMENT '网址',
	created_date DATE COMMENT '建馆日期',
	profile text COMMENT '简介',
	card_fee INT COMMENT '开卡费',
	card_valid_date INT COMMENT '卡有效期',	
	modified_user VARCHAR(30) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间'
) DEFAULT CHARSET=utf8;

-- 插入图书馆表数据
INSERT INTO tb_library VALUES ('梦之队图书馆','金馆长','1363********','保密','lib@dt.com','http://lib.dt.cn','2019-04-30','D.T小组web项目',5,3,'admin',now());

-- 创建管理员表
CREATE TABLE tb_user (
	id INT NOT NULL AUTO_INCREMENT COMMENT 'id',
	username VARCHAR(30) COMMENT '用户名',
	salt VARCHAR(30) COMMENT '盐值',
	password VARCHAR(30) COMMENT '密码',
	sys_set INT DEFAULT 0 COMMENT '系统设置权限',
	reader_set INT DEFAULT 0 COMMENT '读者管理权限',
	book_set INT DEFAULT 0 COMMENT '图书管理权限',
	borrowback_set INT DEFAULT 0 COMMENT '借阅管理权限',
	query_set INT DEFAULT 0 COMMENT '系统查询权限',
	is_delete INT DEFAULT 0 COMMENT '是否删除',
	created_user VARCHAR(30) COMMENT '创建人',
	created_time DATETIME COMMENT '创建时间',
	modified_user VARCHAR(30) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间',
	PRIMARY KEY (id)
) DEFAULT CHARSET=utf8;

-- 插入管理员表数据
INSERT INTO tb_user VALUES 
(null,'admin','0000','123',1,1,1,1,1,0,'admin',now(),'admin',now()),
(null,'tsoft','0000','123',1,1,1,1,1,0,'admin',now(),'admin',now()),
(null,'dt','0000','123',0,0,0,1,1,0,'admin',now(),'admin',now());

-- 创建书本信息表
CREATE TABLE tb_book(
	id INT AUTO_INCREMENT COMMENT '书本id',
	barcode VARCHAR(40) UNIQUE NOT NULL COMMENT '书本条形码',
	bookname VARCHAR(70) NOT NULL COMMENT '书本名称',
	type_id INT COMMENT '书籍类型id',
	author VARCHAR(30) NOT NULL COMMENT '作者',
	publisher_id INT COMMENT '出版社编号',
	bookcase_id INT COMMENT '书架id',
	is_delete INT COMMENT '是否删除,0代表未删除,1代表删除',
	created_user VARCHAR(30) COMMENT '创建人',
	created_time DATETIME COMMENT '创建时间',
	modified_user VARCHAR(30) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间',
	PRIMARY KEY(id)
)DEFAULT CHARSET=UTF8;

-- 书本类型表
CREATE TABLE tb_booktype(
	id INT AUTO_INCREMENT COMMENT '书本类型id',
	typename VARCHAR(30) UNIQUE NOT NULL COMMENT '书本类型名称',
	days INT NOT NULL COMMENT '可借阅天数',
	created_user VARCHAR(30) COMMENT '创建人',
	created_time DATETIME COMMENT '创建时间',
	modified_user VARCHAR(30) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间',
	PRIMARY KEY(id)
)DEFAULT CHARSET=UTF8;

-- 读者信息表
CREATE TABLE tb_reader(
	id INT AUTO_INCREMENT COMMENT '读者id',
	name VARCHAR(30) NOT NULL COMMENT '姓名',
	gender INT COMMENT '性别,0-女,1-男',
	barcode VARCHAR(40) UNIQUE NOT NULL COMMENT '读者条形码',
	papertype VARCHAR(10) NOT NULL COMMENT '证件类型',
	paperno VARCHAR(40) NOT NULL COMMENT '证件号码',
	phone VARCHAR(20) NOT NULL COMMENT '电话号码',
	email VARCHAR(30) COMMENT '邮箱',
	type_id INT COMMENT '用户类型id',
	is_delete INT COMMENT '是否删除,0代表未删除,1代表删除',
	created_user VARCHAR(30) COMMENT '创建人',
	created_time DATETIME COMMENT '创建时间',
	modified_user VARCHAR(30) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间',
	PRIMARY KEY(id)
)DEFAULT CHARSET=UTF8;

-- 读者类型表
CREATE TABLE tb_readertype(
	id INT AUTO_INCREMENT COMMENT '读者类型id',
	name VARCHAR(30) UNIQUE NOT NULL COMMENT '读者类型名称',
	number INT NOT NULL COMMENT '可借书数量',
	created_user VARCHAR(30) COMMENT '创建人',
	created_time DATETIME COMMENT '创建时间',
	modified_user VARCHAR(30) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间',
	PRIMARY KEY(id)
)DEFAULT CHARSET=UTF8;

-- 书本信息
INSERT INTO tb_book (
id,barcode,bookname,type_id,author,publisher_id,bookcase_id,is_delete,created_user,created_time,modified_user,modified_time
) VALUES(
NULL,'9787302047230','Java实战教程',1,'Mr.xi',1,1,0,'tsoft',NULL,NULL,NULL),(
NULL,'111111','SpringMVC实战',1,'Mr.ai',1,2,0,'tsoft',NULL,NULL,NULL),(
NULL,'222222','SpringBoot实战',1,'Mr.bi',2,3,0,'tsoft',NULL,NULL,NULL),(
NULL,'333333','MyBatis实战',1,'Mr.lci',1,3,0,'tsoft',NULL,NULL,NULL),(
NULL,'444444','Spring实战',1,'Mr.di',1,1,0,'tsoft',NULL,NULL,NULL),(
NULL,'555555','Hibernate实战',1,'Mr.li',2,1,0,'tsoft',NULL,NULL,NULL),(
NULL,'6666666','Struts2从挖坑到吃土',1,'Mr.right',1,1,0,'tsoft',NULL,NULL,NULL);

-- 书本类型
INSERT INTO tb_booktype(
id,typename,days,created_user,created_time,modified_user,modified_time
) VALUES (
NULL,'电脑类',15,NULL,NULL,NULL,NULL),(
NULL,'人文类',25,NULL,NULL,NULL,NULL),(
NULL,'社科类',35,NULL,NULL,NULL,NULL);

-- 读者信息表
INSERT INTO tb_reader (
id,NAME,gender,barcode,papertype,paperNO,phone,email,type_id,is_delete,created_user,created_time,modified_user,modified_time
) VALUES(
NULL,'小明',1,'111','学生证','12345678','13509359312','123466@qq.com',1,0,NULL,NULL,NULL,NULL),(
NULL,'小红',0,'222','学生证','87654321','150600014567','789456@163.com',1,0,NULL,NULL,NULL,NULL);
NULL,'小黄',0,'333','学生证','87654321','150600014567','789456@163.com',1,0,NULL,NULL,NULL,NULL);
NULL,'小绿',0,'444','学生证','87654321','150600014567','789456@163.com',1,0,NULL,NULL,NULL,NULL);
NULL,'小粉',0,'55','学生证','87654321','150600014567','789456@163.com',1,0,NULL,NULL,NULL,NULL);

-- 读者类型表
INSERT INTO tb_readertype(
id,name,number,created_user,created_time,modified_user,modified_time
) VALUES (
NULL,'学生',15,NULL,NULL,NULL,NULL),(
NULL,'教师',25,NULL,NULL,NULL,NULL),(
NULL,'其他',5,NULL,NULL,NULL,NULL);

-- 出版社表
CREATE TABLE tb_publisher(
	id INT AUTO_INCREMENT COMMENT '出版社id',
	name VARCHAR(20) COMMENT '出版社名',
	is_delete INT COMMENT '是否删除',
	created_user VARCHAR(20) COMMENT '创建人',
	created_time DATETIME COMMENT '创建时间',
	modified_user VARCHAR(20) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间',
	PRIMARY KEY(id)
)DEFAULT CHARSET=utf8;

INSERT INTO tb_publisher (name) VALUES ('金山出版社'),('鼓楼出版社');

CREATE TABLE tb_borrow(
	id INT AUTO_INCREMENT COMMENT '借阅id',
	readerid INT COMMENT '读者id',
	bookid INT(10) NOT NULL COMMENT '书本id',
	borrow_time DATETIME COMMENT '借阅日期',
	back_time DATETIME COMMENT '应还日期',
	give_time DATETIME COMMENT '归还日期',
	is_back INT COMMENT '是否归还,0-未归还,1-已归还',
	is_delete INT COMMENT '是否删除',
	created_user VARCHAR(20) COMMENT '创建人',
	created_time DATETIME COMMENT '创建时间',
	modified_user VARCHAR(20) COMMENT '最后修改人',
	modified_time DATETIME COMMENT '最后修改时间',
	PRIMARY KEY(id)
)DEFAULT CHARSET=utf8;

INSERT INTO `tb_borrow`(
	id,readerid,
	bookid,borrow_Time,
	back_Time,give_Time,
	is_back,is_delete,
	created_user,created_time,
	modified_user,modified_time
) VALUES (
	NULL,4,
	1,NOW(),
	DATE_SUB(NOW(), INTERVAL -30 DAY),NULL,
	0,0,
	NULL,NULL,
	NULL,NULL
),(
	NULL,2,
	3,NOW(),
	DATE_SUB(NOW(), INTERVAL -30 DAY),NULL,
	0,0,
	NULL,NULL,
	NULL,NULL
),(
	NULL,3,
	2,NOW(),
	DATE_SUB(NOW(), INTERVAL -30 DAY),NULL,
	0,0,
	NULL,NULL,
	NULL,NULL
)
