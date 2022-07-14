CREATE   DATABASE COURSE_DB_RW;
USE COURSE_DB_RW;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` bigint(16) NOT NULL,
  `cname` varchar(255) DEFAULT NULL,
  `userId` bigint(16) DEFAULT NULL,
  `cstatus` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

