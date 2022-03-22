SET NAMES utf8;
SET time_zone = '+08:00';

CREATE TABLE `student` (
  `id` bigint NOT NULL AUTO_INCREMENT，
  `name` varchar(255) DEFAULT NULL,
  `delete_flag` bit(1) NOT NULL,
  `fcu` varchar(255) DEFAULT NULL,
  `fcd` datetime DEFAULT NULL,
  `lcu` varchar(255) DEFAULT NULL,
  `lcd` datetime DEFAULT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;




