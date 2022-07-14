
CREATE   DATABASE COURSE_DB_3;
USE COURSE_DB_3;
/*
Navicat MySQL Data Transfer

Source Server         : local-mysql
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : course_db

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2022-07-13 00:11:52
*/

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

CREATE TABLE `t_udict`  (
  `dict_id` bigint(16) NOT NULL,
  `ustatus` varchar(16) ,
  `uvalue` varchar(255),
  PRIMARY KEY (`dict_id`)
)
