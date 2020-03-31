# Mybatis-缓存机制 demo
文档：Mybatis-缓存机制
## 演示了mybatis 一级缓存和二级缓存的基本使用

## 数据库SQL
```sql
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(2) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user(id,`name`,sex)
VALUES(1,'tom',1),(2,'jerry',1);
```