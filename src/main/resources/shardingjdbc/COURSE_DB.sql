CREATE   DATABASE COURSE_DB;
USE COURSE_DB;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course_1`
-- ----------------------------
DROP TABLE IF EXISTS `course_1`;
CREATE TABLE `course_1` (
  `cid` bigint(16) NOT NULL,
  `cname` varchar(255) DEFAULT NULL,
  `userId` bigint(16) DEFAULT NULL,
  `cstatus` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_1
-- ----------------------------


-- ----------------------------
-- Table structure for `course_2`
-- ----------------------------
DROP TABLE IF EXISTS `course_2`;
CREATE TABLE `course_2` (
  `cid` bigint(16) NOT NULL,
  `cname` varchar(255) DEFAULT NULL,
  `userId` bigint(16) DEFAULT NULL,
  `cstatus` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;