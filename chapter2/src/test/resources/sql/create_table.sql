CREATE table customer(
`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
`name` varchar(255) DEFAULT NULL,
`contact` varchar(255) DEFAULT NULL,
`telphone` varchar(255) DEFAULT NULL,
`emai` varchar(255) DEFAULT NULL,
`remark` TEXT,
PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;