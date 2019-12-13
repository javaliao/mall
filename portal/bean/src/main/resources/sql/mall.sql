/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.27 : Database - mall
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mall` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mall`;

/*Table structure for table `tb_activity` */

DROP TABLE IF EXISTS `tb_activity`;

CREATE TABLE `tb_activity` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `activity_pic` varchar(500) DEFAULT NULL COMMENT '活动图片',
  `hotwords` varchar(200) DEFAULT NULL COMMENT '热门词汇',
  `activity_name` varchar(20) DEFAULT NULL COMMENT '活动名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动表';

/*Data for the table `tb_activity` */

LOCK TABLES `tb_activity` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_advertisement` */

DROP TABLE IF EXISTS `tb_advertisement`;

CREATE TABLE `tb_advertisement` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `advertisement_name` varchar(20) DEFAULT NULL COMMENT '广告名称',
  `advertisement_icon` varchar(500) DEFAULT NULL COMMENT '广告图标',
  `advertisement_pic` varchar(500) DEFAULT NULL COMMENT '广告图片',
  `advertisement_link` varchar(500) DEFAULT NULL COMMENT '广告链接',
  `advertisement_status` varchar(20) DEFAULT NULL COMMENT '广告状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='广告表';

/*Data for the table `tb_advertisement` */

LOCK TABLES `tb_advertisement` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_agreement` */

DROP TABLE IF EXISTS `tb_agreement`;

CREATE TABLE `tb_agreement` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `agreement_name` varchar(100) DEFAULT NULL COMMENT '协议名称',
  `html` longblob COMMENT '协议页面',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='协议表';

/*Data for the table `tb_agreement` */

LOCK TABLES `tb_agreement` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_area` */

DROP TABLE IF EXISTS `tb_area`;

CREATE TABLE `tb_area` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `area_id` bigint(20) DEFAULT NULL COMMENT '市区ID',
  `cityID` bigint(20) DEFAULT NULL COMMENT '城市ID',
  `area_name` varchar(20) DEFAULT NULL COMMENT '市区名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(20) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_area_area_id` (`area_id`),
  KEY `IDX_tb_area_cityID` (`cityID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='市区表';

/*Data for the table `tb_area` */

LOCK TABLES `tb_area` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_attribute` */

DROP TABLE IF EXISTS `tb_attribute`;

CREATE TABLE `tb_attribute` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `category_id` bigint(20) DEFAULT NULL COMMENT '分类id',
  `attribute_name` varchar(30) DEFAULT NULL COMMENT '属性名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_attrute_category_idBC1A` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='属性表';

/*Data for the table `tb_attribute` */

LOCK TABLES `tb_attribute` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_attribute_value` */

DROP TABLE IF EXISTS `tb_attribute_value`;

CREATE TABLE `tb_attribute_value` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `attribute_id` bigint(20) DEFAULT NULL COMMENT '属性id',
  `attribute_value` varchar(50) DEFAULT NULL COMMENT '属性值名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_attrlue_product_id762D` (`product_id`),
  KEY `IDX_tb_attrlue_attribute_id3BB1` (`attribute_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='属性值表';

/*Data for the table `tb_attribute_value` */

LOCK TABLES `tb_attribute_value` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_channel` */

DROP TABLE IF EXISTS `tb_channel`;

CREATE TABLE `tb_channel` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `channel_name` varchar(20) DEFAULT NULL COMMENT '渠道名称',
  `channel_phone` varchar(30) DEFAULT NULL COMMENT '渠道手机号',
  `channel_QR_code` varchar(500) DEFAULT NULL COMMENT '渠道二维码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='渠道表';

/*Data for the table `tb_channel` */

LOCK TABLES `tb_channel` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_cities` */

DROP TABLE IF EXISTS `tb_cities`;

CREATE TABLE `tb_cities` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `city_id` bigint(20) DEFAULT NULL COMMENT '城市ID',
  `provincesID` bigint(20) DEFAULT NULL COMMENT '省份ID',
  `city_name` varchar(20) DEFAULT NULL COMMENT '城市名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_cities_city_id` (`city_id`),
  KEY `IDX_tb_cities_provincesID` (`provincesID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='城市表';

/*Data for the table `tb_cities` */

LOCK TABLES `tb_cities` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_column` */

DROP TABLE IF EXISTS `tb_column`;

CREATE TABLE `tb_column` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `special_topic_id` bigint(20) DEFAULT NULL COMMENT '专题id',
  `column_name` varchar(20) DEFAULT NULL COMMENT '栏目名称',
  `column_pics` varchar(500) DEFAULT NULL COMMENT '栏目图片集合',
  `product_ids` varchar(500) DEFAULT NULL COMMENT '商品id集合',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='栏目表';

/*Data for the table `tb_column` */

LOCK TABLES `tb_column` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_consultation` */

DROP TABLE IF EXISTS `tb_consultation`;

CREATE TABLE `tb_consultation` (
  `Id` bigint(20) NOT NULL COMMENT '编号',
  `consultation_name` varchar(20) DEFAULT NULL COMMENT '咨询人姓名',
  `consultation_phone` varchar(30) DEFAULT NULL COMMENT '咨询人手机号',
  `user_id` varchar(20) DEFAULT NULL COMMENT '咨询用户id',
  `seller_id` varchar(20) DEFAULT NULL COMMENT '咨询卖家id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_consultation_user_id` (`user_id`),
  KEY `IDX_tb_consion_seller_idA35C` (`seller_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='咨询表';

/*Data for the table `tb_consultation` */

LOCK TABLES `tb_consultation` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_coupon` */

DROP TABLE IF EXISTS `tb_coupon`;

CREATE TABLE `tb_coupon` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `coupon_icon` varchar(500) DEFAULT NULL COMMENT '优惠券图标',
  `coupon_name` varchar(20) DEFAULT NULL COMMENT '优惠券名称',
  `coupon_publish_count` varchar(20) DEFAULT NULL COMMENT '优惠券发行数量',
  `coupon_use_count` varchar(20) DEFAULT NULL COMMENT '优惠券已使用数量',
  `coupon_receive_count` varchar(20) DEFAULT NULL COMMENT '优惠券领取数量',
  `coupon_amount` varchar(20) DEFAULT NULL COMMENT '优惠券抵扣金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `person_limit` varchar(20) DEFAULT NULL COMMENT '每人限领张数',
  `start_time` datetime DEFAULT NULL COMMENT '开始可使用时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束可使用时间',
  `use_type` varchar(20) DEFAULT NULL COMMENT '使用类型',
  `coupon_code` varchar(50) DEFAULT NULL COMMENT '优惠码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券表';

/*Data for the table `tb_coupon` */

LOCK TABLES `tb_coupon` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_customer_service_employee` */

DROP TABLE IF EXISTS `tb_customer_service_employee`;

CREATE TABLE `tb_customer_service_employee` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `customer_service_name` varchar(20) DEFAULT NULL COMMENT '客服人员名称',
  `customer_service_phone` varchar(50) DEFAULT NULL COMMENT '客服人员电话',
  `customer_service_wechar` varchar(50) DEFAULT NULL COMMENT '客服人员微信号',
  `customer_service_QQ` varchar(50) DEFAULT NULL COMMENT '客服人员QQ',
  `customer_service_type` varchar(20) DEFAULT NULL COMMENT '客服人员类型',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客服人员表';

/*Data for the table `tb_customer_service_employee` */

LOCK TABLES `tb_customer_service_employee` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_form_problem` */

DROP TABLE IF EXISTS `tb_form_problem`;

CREATE TABLE `tb_form_problem` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `consultation_id` bigint(20) DEFAULT NULL COMMENT '咨询人id',
  `customer_service_employee_id` bigint(20) DEFAULT NULL COMMENT '客服人员id',
  `is_success` varchar(20) DEFAULT NULL COMMENT '处理是否成功',
  `create_time` datetime DEFAULT NULL COMMENT '表单创建时间',
  `success_time` datetime DEFAULT NULL COMMENT '表单处理成功时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_formlem_consulta_idA124` (`consultation_id`),
  KEY `IDX_tb_formlem_customer_id8AFE` (`customer_service_employee_id`),
  KEY `IDX_tb_formlem_is_successBF7F` (`is_success`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='问题表单表';

/*Data for the table `tb_form_problem` */

LOCK TABLES `tb_form_problem` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_frequent_problem` */

DROP TABLE IF EXISTS `tb_frequent_problem`;

CREATE TABLE `tb_frequent_problem` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `problem_type` varchar(20) DEFAULT NULL COMMENT '问题类型',
  `problem` longblob COMMENT '问题',
  `problem_frequent` bigint(20) DEFAULT NULL COMMENT '问题频率',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='常见问题表';

/*Data for the table `tb_frequent_problem` */

LOCK TABLES `tb_frequent_problem` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_log_visit` */

DROP TABLE IF EXISTS `tb_log_visit`;

CREATE TABLE `tb_log_visit` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `ip_address` varchar(20) DEFAULT NULL COMMENT 'ip地址',
  `host_name` varchar(30) DEFAULT NULL COMMENT '机器名称',
  `channel` varchar(10) DEFAULT NULL COMMENT '渠道',
  `service_description` varchar(50) DEFAULT NULL COMMENT '业务描述',
  `visit_api` varchar(50) DEFAULT NULL COMMENT '接口',
  `visit_method` varchar(20) DEFAULT NULL COMMENT '方法',
  `visit_url` varchar(50) DEFAULT NULL COMMENT '资源路径',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日志访客信息';

/*Data for the table `tb_log_visit` */

LOCK TABLES `tb_log_visit` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_log_visit_statistics` */

DROP TABLE IF EXISTS `tb_log_visit_statistics`;

CREATE TABLE `tb_log_visit_statistics` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `log_visit_id` bigint(20) DEFAULT NULL COMMENT '日志访客关联id',
  `visit_method` varchar(20) DEFAULT NULL COMMENT '访问方法',
  `visit_params` varchar(500) DEFAULT NULL COMMENT '访问参数',
  `visit_throwing_erro` varchar(500) DEFAULT NULL COMMENT '访问抛的异常',
  `visit_result` varchar(20) DEFAULT NULL COMMENT '访问结果',
  `visit_num` bigint(50) DEFAULT NULL COMMENT '调用次数',
  `visit_start_time` datetime DEFAULT NULL COMMENT '访问开始时间',
  `visit_end_time` datetime DEFAULT NULL COMMENT '访问结束时间',
  `visit_time_consuming` bigint(50) DEFAULT NULL COMMENT '访问耗时',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='日志访客统计';

/*Data for the table `tb_log_visit_statistics` */

LOCK TABLES `tb_log_visit_statistics` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_order` */

DROP TABLE IF EXISTS `tb_order`;

CREATE TABLE `tb_order` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `seller_id` bigint(20) DEFAULT NULL COMMENT '卖家id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `user_name` varchar(4000) DEFAULT NULL COMMENT '用户名',
  `order_sn` varchar(50) DEFAULT NULL COMMENT '订单编号',
  `receiver_person_name` varchar(20) DEFAULT NULL COMMENT '收货人姓名',
  `receiver_person_phone` varchar(20) DEFAULT NULL COMMENT '收货人电话',
  `receiver_province` varchar(20) DEFAULT NULL COMMENT '收货省份',
  `receiver_city` varchar(20) DEFAULT NULL COMMENT '收货城市',
  `receiver_region` varchar(20) DEFAULT NULL COMMENT '收货区',
  `receiver_detail_address` varchar(200) DEFAULT NULL COMMENT '收货默认地址',
  `place_order_person_name` varchar(20) DEFAULT NULL COMMENT '下单人姓名',
  `place_order_person_phone` varchar(20) DEFAULT NULL COMMENT '下单人电话',
  `alipay_trade_no` varchar(20) DEFAULT NULL COMMENT '阿里的交易订单号',
  `order_status` varchar(20) DEFAULT NULL COMMENT '订单状态：订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单',
  `total_amount` varchar(20) DEFAULT NULL COMMENT '订单总金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `pay_amount` varchar(20) DEFAULT NULL COMMENT '支付金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `freight_amount` varchar(20) DEFAULT NULL COMMENT '运费金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `delivery_sn` varchar(50) DEFAULT NULL COMMENT '物流单号',
  `delivery_company` varchar(20) DEFAULT NULL COMMENT '物流公司(配送方式)',
  `order_create_time` datetime DEFAULT NULL COMMENT '下单时间',
  `order_comment_time` datetime DEFAULT NULL COMMENT '订单评价时间',
  `order_pay_time` datetime DEFAULT NULL COMMENT '订单支付时间',
  `order_delivery_time` datetime DEFAULT NULL COMMENT '订单发货时间',
  `order_receive_time` datetime DEFAULT NULL COMMENT '订单收货时间',
  `use_integration` varchar(20) DEFAULT NULL COMMENT '下单使用的积分',
  `order_note` varchar(500) DEFAULT NULL COMMENT '订单备注',
  `add_user_integration` varchar(20) DEFAULT NULL COMMENT '下单可增加的积分',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  UNIQUE KEY `IDXU_tb_order_order_sn` (`order_sn`),
  KEY `IDX_tb_order_user_id` (`user_id`),
  KEY `IDX_tb_order_seller_id` (`seller_id`),
  KEY `IDX_tb_order_product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

/*Data for the table `tb_order` */

LOCK TABLES `tb_order` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_order_assessment` */

DROP TABLE IF EXISTS `tb_order_assessment`;

CREATE TABLE `tb_order_assessment` (
  `Id` bigint(20) NOT NULL COMMENT '主键',
  `order_sn` bigint(20) DEFAULT NULL COMMENT '订单号',
  `assessment_desc` varchar(2000) DEFAULT NULL COMMENT '评价描述',
  `assessment_star` varchar(50) DEFAULT NULL COMMENT '订单评分',
  `assessment_star1` varchar(50) DEFAULT NULL COMMENT '评分1',
  `assessment_star2` varchar(50) DEFAULT NULL COMMENT '评分2',
  `assessment_star3` varchar(50) DEFAULT NULL COMMENT '评分3',
  `assessment_star4` varchar(50) DEFAULT NULL COMMENT '评分4',
  `share_num` bigint(20) DEFAULT NULL COMMENT '分享次数',
  `like_num` bigint(20) DEFAULT NULL COMMENT '点赞次数',
  `is_hidden` varchar(10) DEFAULT NULL COMMENT '是否隐藏',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单评价表';

/*Data for the table `tb_order_assessment` */

LOCK TABLES `tb_order_assessment` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_order_seller` */

DROP TABLE IF EXISTS `tb_order_seller`;

CREATE TABLE `tb_order_seller` (
  `Id` bigint(20) NOT NULL COMMENT '主键',
  `order_sn` bigint(20) DEFAULT NULL COMMENT '订单号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '买家id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `user_coupon_id` bigint(20) DEFAULT NULL COMMENT '买家优惠券id',
  `store_coupon_id` bigint(20) DEFAULT NULL COMMENT '卖家优惠券id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_order_seller_user_id` (`user_id`),
  KEY `IDX_tb_ordeler_product_id4AE8` (`product_id`),
  KEY `IDX_tb_ordeler_user_cou_id8D46` (`user_coupon_id`),
  KEY `IDX_tb_ordeler_store_co_id55E7` (`store_coupon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家订单表';

/*Data for the table `tb_order_seller` */

LOCK TABLES `tb_order_seller` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_payment_info` */

DROP TABLE IF EXISTS `tb_payment_info`;

CREATE TABLE `tb_payment_info` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `out_trade_no` bigint(20) DEFAULT NULL COMMENT '对外业务编号',
  `order_sn` varchar(50) DEFAULT NULL COMMENT '订单编号',
  `alipay_trade_no` varchar(50) DEFAULT NULL COMMENT '支付宝交易编号',
  `total_amount` varchar(20) DEFAULT NULL COMMENT '支付金额 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `payment_status` varchar(20) DEFAULT NULL COMMENT '支付状态',
  `callback_content` datetime DEFAULT NULL COMMENT '同步回调时间',
  `subject` varchar(200) DEFAULT NULL COMMENT '交易内容',
  `create_time` datetime DEFAULT NULL COMMENT '支付时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付信息表';

/*Data for the table `tb_payment_info` */

LOCK TABLES `tb_payment_info` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_price_gradient` */

DROP TABLE IF EXISTS `tb_price_gradient`;

CREATE TABLE `tb_price_gradient` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_price` varchar(20) DEFAULT NULL COMMENT '商品价格',
  `product_count` varchar(20) DEFAULT NULL COMMENT '数量',
  `discount_pice` varchar(20) DEFAULT NULL COMMENT '折扣价格:(满足指定数量的折扣价格) mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='价格梯度表';

/*Data for the table `tb_price_gradient` */

LOCK TABLES `tb_price_gradient` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_product` */

DROP TABLE IF EXISTS `tb_product`;

CREATE TABLE `tb_product` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `seller_id` bigint(20) DEFAULT NULL COMMENT '卖家id',
  `product_sn` varchar(20) DEFAULT NULL COMMENT '商品编号',
  `product_name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `product_pic` varchar(500) DEFAULT NULL COMMENT '商品图片',
  `product_sale` varchar(50) DEFAULT NULL COMMENT '商品销量',
  `product_pice` varchar(20) DEFAULT NULL COMMENT '商品价格 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `product_now_price` varchar(20) DEFAULT NULL COMMENT '商品现价 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `product_brand` varchar(50) DEFAULT NULL COMMENT '商品品牌',
  `product_stock` varchar(50) DEFAULT NULL COMMENT '商品库存',
  `product_appraise` varchar(50) DEFAULT NULL COMMENT '商品评价数',
  `product_publish_time` datetime DEFAULT NULL COMMENT '商品上架发布时间',
  `product_title` varchar(100) DEFAULT NULL COMMENT '商品标题',
  `product_seller` varchar(50) DEFAULT NULL COMMENT '商品卖家',
  `product_place_of_delivery` varchar(200) DEFAULT NULL COMMENT '商品发货地',
  `product_status` varchar(20) DEFAULT NULL COMMENT '商品状态：以逗号分割的商品状态：1->下架；2->上架；3->不推荐；4->推荐；5->未审核；6->审核通过；7->审核中；8->审核未通过',
  `product_weight` varchar(20) DEFAULT NULL COMMENT '商品重量',
  `product_album_pics` varchar(500) DEFAULT NULL COMMENT '商画册图片：图片以逗号分割',
  `product_specifications` varchar(100) DEFAULT NULL COMMENT '商品规格',
  `product_credit` varchar(50) DEFAULT NULL COMMENT '商品信用',
  `product_service_ids` varchar(50) DEFAULT NULL COMMENT '商品服务类型：以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮',
  `product_detail_pics` varchar(500) DEFAULT NULL COMMENT '商品详情图册：图片以逗号分割',
  `product_description` varchar(500) DEFAULT NULL COMMENT '商品描述说明',
  `product_icon` varchar(500) DEFAULT NULL COMMENT '商品小图标',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_product_seller_id` (`seller_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

/*Data for the table `tb_product` */

LOCK TABLES `tb_product` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_product_category` */

DROP TABLE IF EXISTS `tb_product_category`;

CREATE TABLE `tb_product_category` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父id',
  `category_name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `category_icon` varchar(500) DEFAULT NULL COMMENT '分类的图标',
  `category_down_product_count` varchar(20) DEFAULT NULL COMMENT '分类下的产品数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_prodory_parent_idD88A` (`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品分类表';

/*Data for the table `tb_product_category` */

LOCK TABLES `tb_product_category` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_product_parameter_type` */

DROP TABLE IF EXISTS `tb_product_parameter_type`;

CREATE TABLE `tb_product_parameter_type` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `product_id` int(11) DEFAULT NULL COMMENT '商品id',
  `parameter_type` varchar(50) DEFAULT NULL COMMENT '参数类型',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_prodype_product_id082F` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品参数类型表';

/*Data for the table `tb_product_parameter_type` */

LOCK TABLES `tb_product_parameter_type` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_product_paramter` */

DROP TABLE IF EXISTS `tb_product_paramter`;

CREATE TABLE `tb_product_paramter` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `product_paramter_type_id` bigint(20) DEFAULT NULL COMMENT '关联编号',
  `product_paramter_name` varchar(50) DEFAULT NULL COMMENT '商品参数名称',
  `product_paramter_value` varchar(50) DEFAULT NULL COMMENT '商品参数值',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_prodter_product__idFA12` (`product_paramter_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品参数表';

/*Data for the table `tb_product_paramter` */

LOCK TABLES `tb_product_paramter` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_product_specifications` */

DROP TABLE IF EXISTS `tb_product_specifications`;

CREATE TABLE `tb_product_specifications` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `specifications_name` varchar(300) DEFAULT NULL COMMENT '规格名称',
  `specifications_corresponding_pice` varchar(20) DEFAULT NULL COMMENT '规格对应的价格',
  `specifications_corresponding_icon` varchar(500) DEFAULT NULL COMMENT '规格对应的图标',
  `specifications_sorresponding_pic` varchar(500) DEFAULT NULL COMMENT '规格对应的图片',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品规格表';

/*Data for the table `tb_product_specifications` */

LOCK TABLES `tb_product_specifications` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_product_unit` */

DROP TABLE IF EXISTS `tb_product_unit`;

CREATE TABLE `tb_product_unit` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `unit_name` varchar(20) DEFAULT NULL COMMENT '计量名称',
  `unit_number` varchar(20) DEFAULT NULL COMMENT '计量数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_prodnit_product_id9B58` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品计量表';

/*Data for the table `tb_product_unit` */

LOCK TABLES `tb_product_unit` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_province` */

DROP TABLE IF EXISTS `tb_province`;

CREATE TABLE `tb_province` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `province_id` bigint(20) DEFAULT NULL COMMENT '省份ID',
  `province_name` varchar(20) DEFAULT NULL COMMENT '省份名称',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_province_province_id` (`province_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省份表';

/*Data for the table `tb_province` */

LOCK TABLES `tb_province` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_root` */

DROP TABLE IF EXISTS `tb_root`;

CREATE TABLE `tb_root` (
  `Id` bigint(20) NOT NULL COMMENT '编号',
  `root_name` varchar(20) DEFAULT NULL COMMENT '权限名称',
  `root_level` bigint(20) DEFAULT NULL COMMENT '权限级别',
  `role_name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `relation_id` bigint(20) DEFAULT NULL COMMENT '关联id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_root_relation_id` (`relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

/*Data for the table `tb_root` */

LOCK TABLES `tb_root` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_seckill` */

DROP TABLE IF EXISTS `tb_seckill`;

CREATE TABLE `tb_seckill` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `state` varchar(20) DEFAULT NULL COMMENT '秒杀是否成功',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_seckill_user_id` (`user_id`),
  KEY `IDX_tb_seckill_product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀表';

/*Data for the table `tb_seckill` */

LOCK TABLES `tb_seckill` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_seller` */

DROP TABLE IF EXISTS `tb_seller`;

CREATE TABLE `tb_seller` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `seller_name` varchar(20) DEFAULT NULL COMMENT '卖家名',
  `seller_credit_level` varchar(20) DEFAULT NULL COMMENT '卖家信用级别',
  `liaison_name` varchar(20) DEFAULT NULL COMMENT '联系人姓名',
  `liaison_wechart` varchar(20) DEFAULT NULL COMMENT '联系人微信',
  `liaison_phone` varchar(20) DEFAULT NULL COMMENT '联系人手机',
  `liaison_email` varchar(20) DEFAULT NULL COMMENT '联系人邮箱',
  `account_number_status` varchar(20) DEFAULT NULL COMMENT '账号状态',
  `license_number` varchar(50) DEFAULT NULL COMMENT '营业执照号',
  `tax_number` varchar(50) DEFAULT NULL COMMENT '税务登记证号',
  `bank_user_name` varchar(20) DEFAULT NULL COMMENT '开户行账号名称',
  `bank_account` varchar(50) DEFAULT NULL COMMENT '开户行账号',
  `legal_person` varchar(20) DEFAULT NULL COMMENT '法定代表人',
  `legal_person_card_id` varchar(50) DEFAULT NULL COMMENT '法定代表人身份证',
  `province_id` bigint(20) DEFAULT NULL COMMENT '省份id',
  `cities_id` bigint(20) DEFAULT NULL COMMENT '城市id',
  `area_id` bigint(20) DEFAULT NULL COMMENT '区域id',
  `seller_detail_address` varchar(100) DEFAULT NULL COMMENT '卖家详细地址',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_seller_province_id` (`province_id`),
  KEY `IDX_tb_seller_cities_id` (`cities_id`),
  KEY `IDX_tb_seller_area_id` (`area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家表';

/*Data for the table `tb_seller` */

LOCK TABLES `tb_seller` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_seller_product_post_sale` */

DROP TABLE IF EXISTS `tb_seller_product_post_sale`;

CREATE TABLE `tb_seller_product_post_sale` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `seller_product_id` bigint(20) DEFAULT NULL COMMENT '卖家商品id',
  `post_sale_pics` varchar(500) DEFAULT NULL COMMENT '卖家商品售后图册',
  `post_sale_explain` varchar(500) DEFAULT NULL COMMENT '卖家商品售后说明',
  `post_sale_service` varchar(50) DEFAULT NULL COMMENT '卖家商品服务类型',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_sellale_seller_p_id2CBF` (`seller_product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家商品售后';

/*Data for the table `tb_seller_product_post_sale` */

LOCK TABLES `tb_seller_product_post_sale` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_seller_store` */

DROP TABLE IF EXISTS `tb_seller_store`;

CREATE TABLE `tb_seller_store` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `seller_id` bigint(20) DEFAULT NULL COMMENT '卖家id',
  `seller_store_name` varchar(50) DEFAULT NULL COMMENT '卖家店铺名称',
  `seller_store_synopsis` varchar(50) DEFAULT NULL COMMENT '卖家店铺简介',
  `seller_store_icon` varchar(500) DEFAULT NULL COMMENT '卖家店铺logo图标',
  `seller_store_create_time` datetime DEFAULT NULL COMMENT '卖家店铺创建日期',
  `seller_store_category_attribute_name` varchar(50) DEFAULT NULL COMMENT '卖家店铺分类属性名称',
  `seller_store_category_attribute_values` varchar(50) DEFAULT NULL COMMENT '卖家店铺分类属性值',
  `seller_store_sell_well_products` varchar(500) DEFAULT NULL COMMENT '卖家店铺热销的商品',
  `seller_store_hot_attention_products` varchar(500) DEFAULT NULL COMMENT '卖家店铺热门关注的商品',
  `seller_store_new_products` varchar(500) DEFAULT NULL COMMENT '卖家店铺新品',
  `seller_store_home_page_carousel_pic` varchar(500) DEFAULT NULL COMMENT '卖家店铺首页轮播图',
  `seller_store_pics` varchar(500) DEFAULT NULL COMMENT '卖家店铺图册',
  `seller_store_products` varchar(500) DEFAULT NULL COMMENT '卖家店铺商品',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_sellore_seller_id5380` (`seller_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家店铺';

/*Data for the table `tb_seller_store` */

LOCK TABLES `tb_seller_store` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_seller_store_coupon` */

DROP TABLE IF EXISTS `tb_seller_store_coupon`;

CREATE TABLE `tb_seller_store_coupon` (
  `Id` bigint(20) NOT NULL COMMENT '编号',
  `seller_id` bigint(20) DEFAULT NULL COMMENT '卖家id',
  `coupon_id` bigint(20) DEFAULT NULL COMMENT '优惠券id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_sellpon_seller_id201C` (`seller_id`),
  KEY `IDX_tb_sellpon_coupon_id78AF` (`coupon_id`),
  KEY `IDX_tb_sellpon_product_idDDF0` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家店铺优惠券';

/*Data for the table `tb_seller_store_coupon` */

LOCK TABLES `tb_seller_store_coupon` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_shop_char` */

DROP TABLE IF EXISTS `tb_shop_char`;

CREATE TABLE `tb_shop_char` (
  `Id` bigint(20) NOT NULL COMMENT '主键',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `product_img` varchar(500) DEFAULT NULL COMMENT '商品图片',
  `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `product_specifications` varchar(200) DEFAULT NULL COMMENT '商品规格',
  `product_price` varchar(20) DEFAULT NULL COMMENT '商品价格 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `product_now_price` varchar(20) DEFAULT NULL COMMENT '商品现价 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `product_num` varchar(20) DEFAULT NULL COMMENT '商品数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_shop_char_product_id` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';

/*Data for the table `tb_shop_char` */

LOCK TABLES `tb_shop_char` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_special_topic` */

DROP TABLE IF EXISTS `tb_special_topic`;

CREATE TABLE `tb_special_topic` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `activity_id` bigint(20) DEFAULT NULL COMMENT '活动id',
  `special_icon` varchar(500) DEFAULT NULL COMMENT '专题图标',
  `special_topic_name` varchar(50) DEFAULT NULL COMMENT '专题名称',
  `discount_describe` varchar(20) DEFAULT NULL COMMENT '优惠描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专题表';

/*Data for the table `tb_special_topic` */

LOCK TABLES `tb_special_topic` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_sub_order` */

DROP TABLE IF EXISTS `tb_sub_order`;

CREATE TABLE `tb_sub_order` (
  `Id` bigint(20) NOT NULL COMMENT '主键',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `seller_id` bigint(20) DEFAULT NULL COMMENT '卖家id',
  `user_coupon_id` bigint(20) DEFAULT NULL COMMENT '用户优惠券id',
  `order_no` bigint(20) DEFAULT NULL COMMENT '子订单号',
  `order_sn` bigint(20) DEFAULT NULL COMMENT '父订单号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `product_icon` varchar(500) DEFAULT NULL COMMENT '商品图标',
  `product_specifications` varchar(500) DEFAULT NULL COMMENT '商品规格',
  `product_brand_name` varchar(20) DEFAULT NULL COMMENT '商品品牌名称',
  `product_seller_name` varchar(20) DEFAULT NULL COMMENT '商品卖家名称',
  `product_price` varchar(20) DEFAULT NULL COMMENT '商品价格 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `product_quantity` varchar(20) DEFAULT NULL COMMENT '商品数量',
  `product_now_price` varchar(20) DEFAULT NULL COMMENT '商品现价 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `order_state` varchar(20) DEFAULT NULL COMMENT '订单状态',
  `product_coupon_price` varchar(20) DEFAULT NULL COMMENT '商品优惠券价格 mybatis在进行数据映射的时候，若数据库中字段的类型是decimal、float、double，java类对应字段的类型为BigDecimal、Float、Double时，映射得到的数据不会保留值为0的小数位，此时可将java对应字段转换为string类型',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  UNIQUE KEY `IDXU_tb_sub_order_order_no` (`order_no`),
  KEY `IDX_tb_sub_order_product_id` (`product_id`),
  KEY `IDX_tb_sub_order_seller_id` (`seller_id`),
  KEY `IDX_tb_sub_der_user_cou_id626A` (`user_coupon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子订单表';

/*Data for the table `tb_sub_order` */

LOCK TABLES `tb_sub_order` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(100) DEFAULT NULL COMMENT '用户密码',
  `user_nick_name` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `user_phone` varchar(50) DEFAULT NULL COMMENT '用户手机号',
  `user_email` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `user_rank` varchar(20) DEFAULT NULL COMMENT '用户等级',
  `user_accumulate_points` varchar(20) DEFAULT NULL COMMENT '用户累计积分',
  `user_gender` varchar(20) DEFAULT NULL COMMENT '用户性别',
  `user_icon` varchar(500) DEFAULT NULL COMMENT '用户头像',
  `user_real_name` varchar(20) DEFAULT NULL COMMENT '用户真实姓名',
  `user_idcard` varchar(50) DEFAULT NULL COMMENT '用户身份证',
  `secret_protection_problem` varchar(100) DEFAULT NULL COMMENT '用户密保问题',
  `secret_protection_answer` varchar(100) DEFAULT NULL COMMENT '用户密保回答',
  `account_status` varchar(20) DEFAULT NULL COMMENT '用户账户状态',
  `user_type` varchar(20) DEFAULT NULL COMMENT '用户类型',
  `positive_img` varchar(500) DEFAULT NULL COMMENT '身份证正面照',
  `opposite_img` varchar(500) DEFAULT NULL COMMENT '身份证反面照',
  `occupation` varchar(20) DEFAULT NULL COMMENT '职业',
  `pay_password` varchar(20) DEFAULT NULL COMMENT '用户支付密码',
  `is_certification` varchar(10) DEFAULT NULL COMMENT '是否实名认证',
  `qq_open_id` varchar(50) DEFAULT NULL COMMENT 'qq唯一标识',
  `weixin_open_id` varchar(50) DEFAULT NULL COMMENT '微信唯一标识',
  `weixin_lite_open_id` varchar(50) DEFAULT NULL COMMENT '微信小程序唯一标示',
  `weixin_app_open_id` varchar(50) DEFAULT NULL COMMENT '微信app唯一标识',
  `alipay_app_open_id` varchar(50) DEFAULT NULL COMMENT '支付宝app唯一id',
  `weibo_open_id` varchar(50) DEFAULT NULL COMMENT '微博唯一标识',
  `user_birthday` datetime DEFAULT NULL COMMENT '用户生日',
  `account_create_time` datetime DEFAULT NULL COMMENT '用户账户创建时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `tb_user` */

LOCK TABLES `tb_user` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_user_address` */

DROP TABLE IF EXISTS `tb_user_address`;

CREATE TABLE `tb_user_address` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `province_id` bigint(20) DEFAULT NULL COMMENT '省份id',
  `cities_id` bigint(20) DEFAULT NULL COMMENT '城市id',
  `area_id` bigint(20) DEFAULT NULL COMMENT '区域id',
  `detail_address` varchar(100) DEFAULT NULL COMMENT '地址详情',
  `is_default` bigint(10) DEFAULT NULL COMMENT '是否默认',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_useress_province_id7C7C` (`province_id`),
  KEY `IDX_tb_useress_cities_id9B98` (`cities_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户地址表';

/*Data for the table `tb_user_address` */

LOCK TABLES `tb_user_address` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_user_attention` */

DROP TABLE IF EXISTS `tb_user_attention`;

CREATE TABLE `tb_user_attention` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `product_collections_time` datetime DEFAULT NULL COMMENT '商品关注时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_userion_product_idAF60` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户关注表';

/*Data for the table `tb_user_attention` */

LOCK TABLES `tb_user_attention` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_user_collections` */

DROP TABLE IF EXISTS `tb_user_collections`;

CREATE TABLE `tb_user_collections` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `product_collections_time` datetime DEFAULT NULL COMMENT '商品收藏时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_userons_product_idF645` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户收藏表';

/*Data for the table `tb_user_collections` */

LOCK TABLES `tb_user_collections` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_user_coupon` */

DROP TABLE IF EXISTS `tb_user_coupon`;

CREATE TABLE `tb_user_coupon` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `coupon_id` bigint(20) DEFAULT NULL COMMENT '关联编号',
  `coupon_code` varchar(20) DEFAULT NULL COMMENT '优惠码',
  `user_coupon_create_time` datetime DEFAULT NULL COMMENT '用户领取优惠券的时间',
  `use_status` varchar(20) DEFAULT NULL COMMENT '使用状态:使用状态：0->未使用；1->已使用；2->已过期',
  `order_id` bigint(20) DEFAULT NULL COMMENT '订单id',
  `order_sn` varchar(20) DEFAULT NULL COMMENT '订单编号',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_user_coupon_user_id` (`user_id`),
  KEY `IDX_tb_userpon_coupon_id9157` (`coupon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户优惠券表';

/*Data for the table `tb_user_coupon` */

LOCK TABLES `tb_user_coupon` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_user_return_order` */

DROP TABLE IF EXISTS `tb_user_return_order`;

CREATE TABLE `tb_user_return_order` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `order_sn` bigint(20) DEFAULT NULL COMMENT '订单号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `seller_id` bigint(20) DEFAULT NULL COMMENT '卖家id',
  `reason` varchar(200) DEFAULT NULL COMMENT '退货原因',
  `return_order_time` datetime DEFAULT NULL COMMENT '退货时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_userder_user_idE97B` (`user_id`),
  KEY `IDX_tb_userder_seller_idBF1C` (`seller_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户退货订单表';

/*Data for the table `tb_user_return_order` */

LOCK TABLES `tb_user_return_order` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_verification_code` */

DROP TABLE IF EXISTS `tb_verification_code`;

CREATE TABLE `tb_verification_code` (
  `Id` bigint(20) NOT NULL COMMENT '主键',
  `mobile` bigint(20) DEFAULT NULL COMMENT '手机号',
  `code` bigint(20) DEFAULT NULL COMMENT '验证码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_delete` bigint(10) DEFAULT NULL COMMENT '是否删除：1删除，0未删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='验证码';

/*Data for the table `tb_verification_code` */

LOCK TABLES `tb_verification_code` WRITE;

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
