/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50643
 Source Host           : localhost:3306
 Source Schema         : ssm

 Target Server Type    : MySQL
 Target Server Version : 50643
 File Encoding         : 65001

 Date: 23/02/2020 12:17:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for check
-- ----------------------------
DROP TABLE IF EXISTS `check`;
CREATE TABLE `check` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `number` varchar(50) DEFAULT NULL COMMENT '编号',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  `check_in_time` datetime DEFAULT NULL COMMENT '考勤时间',
  `check_out_time` datetime DEFAULT NULL COMMENT '退勤时间',
  `duration` double(10,2) DEFAULT NULL COMMENT '时长',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of check
-- ----------------------------
BEGIN;
INSERT INTO `check` VALUES (6, '马云', '1111', 22, '2018-12-30 02:02:00', '2018-12-30 13:02:00', 11.00);
INSERT INTO `check` VALUES (7, '张三', '1111', 12, '2019-12-29 02:02:00', '2019-12-29 19:22:00', 17.00);
INSERT INTO `check` VALUES (8, '22', '22', 11, '2019-12-29 00:02:00', '2019-12-29 20:01:00', 19.98);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
