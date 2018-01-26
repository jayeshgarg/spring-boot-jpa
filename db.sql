CREATE TABLE IF NOT EXISTS `tbl_users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` varchar(10) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`user_name`)
);


CREATE TABLE IF NOT EXISTS `tbl_employees` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(30) NOT NULL,
  `designation` varchar(20) NOT NULL,
  `manager_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `manager_id` (`manager_id`),
  CONSTRAINT `fk_employee_vs_manager` FOREIGN KEY (`manager_id`) REFERENCES `tbl_employees` (`id`)
);
