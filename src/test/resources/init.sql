CREATE TABLE customer(
id BIGINT(20) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) DEFAULT NULL,
`contact` VARCHAR(255) DEFAULT NULL,
`telephone` VARCHAR(255) DEFAULT NULL,
`email` VARCHAR(255) DEFAULT NULL,
remark text,
PRIMARY KEY(id)
)ENGINE =Innodb DEFAULT CHARSET =utf8;

INSERT INTO customer VALUES ('1','customer1','Jack','13358556698','jack@qq.com',null);
INSERT INTO customer VALUES ('2','customer2','Rose','13358556699','rose@qq.com',null);