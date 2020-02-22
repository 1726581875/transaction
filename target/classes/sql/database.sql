--创建数据库

CREATE DATABASE transaction;

-- 创建表

CREATE TABLE person(
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户Id',
  `name` varchar(120) NOT NULL COMMENT '用户名字',
  `money` bigint NOT NULL COMMENT '账户余额',
  PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET = utf8 COMMENT '人员表';

-- 插入数据

insert into person(name,money) 
values
("张三",12000),
("李四",1000),
("王五",32000),
("赵六",7000),
("田七",180000);