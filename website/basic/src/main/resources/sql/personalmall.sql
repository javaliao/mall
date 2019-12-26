/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.27 : Database - personalmall
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`personalmall` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `personalmall`;

/*Table structure for table `tb_activity` */

DROP TABLE IF EXISTS `tb_activity`;

CREATE TABLE `tb_activity` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `activity_pic` varchar(500) DEFAULT NULL COMMENT '活动图片',
  `hotwords` varchar(200) DEFAULT NULL COMMENT '热门词汇',
  `activity_name` varchar(20) DEFAULT NULL COMMENT '活动名称',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动表';

/*Data for the table `tb_activity` */

/*Table structure for table `tb_advertisement` */

DROP TABLE IF EXISTS `tb_advertisement`;

CREATE TABLE `tb_advertisement` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `advertisement_name` varchar(20) DEFAULT NULL COMMENT '广告名称',
  `advertisement_icon` varchar(500) DEFAULT NULL COMMENT '广告图标',
  `advertisement_pic` varchar(500) DEFAULT NULL COMMENT '广告图片',
  `advertisement_link` varchar(500) DEFAULT NULL COMMENT '广告链接',
  `advertisement_status` varchar(20) DEFAULT NULL COMMENT '广告状态',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='广告表';

/*Data for the table `tb_advertisement` */

/*Table structure for table `tb_area` */

DROP TABLE IF EXISTS `tb_area`;

CREATE TABLE `tb_area` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `area_id` bigint(11) DEFAULT NULL COMMENT '市区ID',
  `cityID` bigint(11) DEFAULT NULL COMMENT '城市ID',
  `area_name` varchar(4000) DEFAULT NULL COMMENT '市区名称',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='市区表';

/*Data for the table `tb_area` */

/*Table structure for table `tb_attribute` */

DROP TABLE IF EXISTS `tb_attribute`;

CREATE TABLE `tb_attribute` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `category_id` bigint(20) DEFAULT NULL COMMENT '分类id',
  `attribute_name` varchar(30) DEFAULT NULL COMMENT '属性名称',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_attrute_category_idBC1A` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8 COMMENT='属性表';

/*Data for the table `tb_attribute` */

insert  into `tb_attribute`(`Id`,`category_id`,`attribute_name`) values (1,7,'价格'),(2,7,'屏幕尺寸'),(3,7,'分辨率'),(4,8,'价格'),(5,8,'屏幕尺寸'),(6,8,'分辨率'),(7,9,'价格'),(8,9,'屏幕尺寸'),(9,9,'分辨率'),(10,10,'使用场景'),(11,10,'商品匹数'),(12,10,'价格'),(13,11,'使用场景'),(14,11,'商品匹数'),(15,11,'价格'),(16,12,'品牌'),(17,12,'价格'),(18,12,'空调类别'),(19,13,'品牌'),(20,13,'价格'),(21,13,'洗条容量'),(22,14,'品牌'),(23,14,'价格'),(24,14,'产品类型'),(25,15,'品牌'),(26,15,'价格'),(27,15,'洗条容量'),(28,19,'品牌'),(29,19,'价格'),(30,19,'热点'),(31,20,'品牌'),(32,20,'热点'),(33,20,'价格'),(34,21,'品牌'),(35,21,'尺寸'),(36,21,'热点'),(37,22,'品牌'),(38,22,'价格'),(39,22,'网络'),(40,23,'品牌'),(41,23,'省份'),(42,23,'通话时长'),(43,24,'品牌'),(44,24,'价格'),(45,24,'归属地'),(46,25,'品牌'),(47,25,'价格'),(48,25,'适用手机品牌'),(49,26,'品牌'),(50,26,'价格'),(51,26,'适用手机品牌'),(52,27,'品牌'),(53,27,'价格'),(54,27,'容量'),(55,31,'品牌'),(56,31,'价格'),(57,31,'分类'),(58,32,'品牌'),(59,32,'价格'),(60,32,'显卡型号'),(61,33,'品牌'),(62,33,'价格'),(63,33,'运行内存'),(64,34,'品牌'),(65,34,'价格'),(66,34,'尺寸'),(67,35,'品牌'),(68,35,'价格'),(69,35,'处理器'),(70,36,'品牌'),(71,36,'价格'),(72,36,'INTEL芯片'),(73,37,'分类'),(74,37,'品牌'),(75,37,'价格'),(76,38,'品牌'),(77,38,'价格'),(78,38,'类型'),(79,39,'品牌'),(80,39,'价格'),(81,39,'连接方式');

/*Table structure for table `tb_attribute_value` */

DROP TABLE IF EXISTS `tb_attribute_value`;

CREATE TABLE `tb_attribute_value` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `attribute_id` bigint(20) DEFAULT NULL COMMENT '属性id',
  `attribute_value` varchar(50) DEFAULT NULL COMMENT '属性值名称',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_attrlue_product_id762D` (`product_id`),
  KEY `IDX_tb_attrlue_attribute_id3BB1` (`attribute_id`)
) ENGINE=InnoDB AUTO_INCREMENT=237 DEFAULT CHARSET=utf8 COMMENT='属性值表';

/*Data for the table `tb_attribute_value` */

insert  into `tb_attribute_value`(`Id`,`product_id`,`attribute_id`,`attribute_value`) values (1,NULL,1,'小米'),(2,NULL,1,'Hisense'),(3,NULL,1,'SKYWORTH创维'),(4,NULL,2,'25000以上'),(5,NULL,2,'15000-24999'),(6,NULL,2,'10000-14999'),(7,NULL,3,'78英寸及以上'),(8,NULL,3,'70-75英寸'),(9,NULL,3,'65英寸'),(10,NULL,4,'小米'),(11,NULL,4,'Hisense'),(12,NULL,4,'SKYWORTH创维'),(13,NULL,5,'15000-24999'),(14,NULL,5,'10000-14999'),(15,NULL,5,'8000-9999'),(16,NULL,6,'78英寸及以上'),(17,NULL,6,'70-75英寸'),(18,NULL,6,'65英寸'),(19,NULL,7,'小米'),(20,NULL,7,'Hisense'),(21,NULL,7,'SKYWORTH创维'),(22,NULL,8,'25000以上'),(23,NULL,8,'15000-24999'),(24,NULL,8,'10000-14999'),(25,NULL,9,'78英寸及以上'),(26,NULL,9,'70-75英寸'),(27,NULL,9,'65英寸'),(28,NULL,10,'GREE格力'),(29,NULL,10,'Midea'),(30,NULL,10,'AUX奥克斯'),(31,NULL,11,'客厅'),(32,NULL,11,'主卧'),(33,NULL,11,'次卧'),(34,NULL,12,'1匹（15cm以下）'),(35,NULL,12,'1.5匹（15-25cm）'),(36,NULL,12,'2匹（20-30cm）'),(37,NULL,13,'GREE格力'),(38,NULL,13,'Midea'),(39,NULL,13,'AUX奥克斯'),(40,NULL,14,'客厅'),(41,NULL,14,'主卧'),(42,NULL,14,'次卧'),(43,NULL,15,'1匹（15cm以下）'),(44,NULL,15,'1.5匹（15-25cm）'),(45,NULL,15,'2匹（20-30cm）'),(46,NULL,16,'Midea'),(47,NULL,16,'Haier'),(48,NULL,16,'GREE格力'),(49,NULL,17,'0-3999'),(50,NULL,17,'4000-5499'),(51,NULL,17,'5500-6999'),(52,NULL,18,'多联机'),(53,NULL,18,'风管机'),(54,NULL,18,'天花机'),(55,NULL,19,'四室一厅（105-160）'),(56,NULL,19,'三室一厅（90-140）'),(57,NULL,19,'二室一厅（70-100）'),(58,NULL,20,'LittleSwan'),(59,NULL,20,'Haier'),(60,NULL,20,'SIEMENS'),(61,NULL,21,'0-699'),(62,NULL,21,'700-999'),(63,NULL,21,'1000-1499'),(64,NULL,22,'10KG及以上'),(65,NULL,22,'9.1-9.9kg'),(66,NULL,22,'5kg及以下'),(67,NULL,23,'LittleSwan'),(68,NULL,23,'Haier'),(69,NULL,23,'SIEMENS'),(70,NULL,24,'0-699'),(71,NULL,24,'700-999'),(72,NULL,24,'1000-1499'),(73,NULL,25,'10KG及以上'),(74,NULL,25,'9.1-9.9kg'),(75,NULL,25,'5kg及以下'),(76,NULL,28,'HUAWEI'),(77,NULL,28,'小米'),(78,NULL,28,'苹果'),(79,NULL,29,'0-499'),(80,NULL,29,'500-999'),(81,NULL,29,'1000-1699'),(82,NULL,30,'人脸识别'),(83,NULL,30,'快速充电'),(84,NULL,30,'无线充电'),(85,NULL,31,'OPPO'),(86,NULL,31,'诺基亚'),(87,NULL,31,'vivo'),(88,NULL,32,'人脸识别'),(89,NULL,32,'快速充电'),(90,NULL,32,'人工智能'),(91,NULL,33,'1000-1699'),(92,NULL,33,'1700-2799'),(93,NULL,33,'2800-4499'),(94,NULL,34,'艾尼卡'),(95,NULL,34,'纽曼'),(96,NULL,34,'SOYES'),(97,NULL,35,'5.6英寸及以上'),(98,NULL,35,'4.5-3.1英寸'),(99,NULL,35,'3.0英寸及以下'),(100,NULL,36,'快速充电'),(101,NULL,36,'屏下指纹'),(102,NULL,37,'HUAWEI'),(103,NULL,37,'中国联通'),(104,NULL,37,'苹果'),(105,NULL,38,'0-999'),(106,NULL,38,'1000-1599'),(107,NULL,38,'1600-2599'),(108,NULL,39,'移动4G'),(109,NULL,39,'联通4G'),(110,NULL,39,'电信4G'),(111,NULL,40,'中国移动'),(112,NULL,40,'中国电信'),(113,NULL,40,'联通'),(114,NULL,41,'广东'),(115,NULL,41,'河北'),(116,NULL,41,'重庆'),(117,NULL,42,'100分钟以下'),(118,NULL,42,'101-200分钟'),(119,NULL,42,'201-400分钟'),(120,NULL,43,'中国电信'),(121,NULL,43,'中国联通'),(122,NULL,43,'联通'),(123,NULL,44,'0-479'),(124,NULL,44,'480-579'),(125,NULL,44,'580-699'),(126,NULL,45,'北京'),(127,NULL,45,'上海'),(128,NULL,45,'广东'),(129,NULL,46,'亿色'),(130,NULL,46,'摩斯维'),(131,NULL,46,'ESCASE'),(132,NULL,47,'0-10'),(133,NULL,47,'11-20'),(134,NULL,47,'21-30'),(135,NULL,48,'苹果'),(136,NULL,48,'华为'),(137,NULL,48,'小米'),(138,NULL,49,'闪魔'),(139,NULL,49,'亿色'),(140,NULL,49,'邦克仕'),(141,NULL,50,'0-10'),(142,NULL,50,'11-20'),(143,NULL,50,'21-30'),(144,NULL,51,'苹果'),(145,NULL,51,'三星'),(146,NULL,51,'小米'),(147,NULL,52,'华为'),(148,NULL,52,'闪迪'),(149,NULL,52,'飞利浦'),(150,NULL,53,'0-19'),(151,NULL,53,'20-39'),(152,NULL,53,'40-49'),(153,NULL,54,'512G'),(154,NULL,54,'256G'),(155,NULL,54,'128G'),(156,NULL,55,'LENOVO'),(157,NULL,55,'ThinkPad'),(158,NULL,55,'HUAWEI'),(159,NULL,56,'0-3999'),(160,NULL,56,'4000-4499'),(161,NULL,56,'4500-4999'),(162,NULL,57,'游戏本'),(163,NULL,57,'轻薄本'),(164,NULL,57,'二合一笔记本'),(165,NULL,58,'LENOVO'),(166,NULL,58,'戴尔'),(167,NULL,58,'hp'),(168,NULL,59,'0-5499'),(169,NULL,59,'5500-5999'),(170,NULL,59,'6000-6499'),(171,NULL,60,'RTX2080Max-Q'),(172,NULL,60,'RTX2080'),(173,NULL,60,'RTX2070'),(174,NULL,61,'HUAWEI'),(175,NULL,61,'苹果'),(176,NULL,61,'Microsoft'),(177,NULL,62,'0-599'),(178,NULL,62,'600-999'),(179,NULL,62,'1000-1499'),(180,NULL,63,'16GB'),(181,NULL,63,'8GB'),(182,NULL,63,'6GB'),(183,NULL,64,'aoc'),(184,NULL,64,'samsung'),(185,NULL,64,'戴尔'),(186,NULL,65,'0-499'),(187,NULL,65,'500-799'),(188,NULL,65,'800-1299'),(189,NULL,66,'20.7英寸及以下'),(190,NULL,66,'21.5英寸'),(191,NULL,66,'22英寸'),(192,NULL,67,'intel'),(193,NULL,68,'1-599'),(194,NULL,68,'600-999'),(195,NULL,68,'1000-1999'),(196,NULL,69,'酷睿i9'),(197,NULL,69,'酷睿i7'),(198,NULL,69,'酷睿i5'),(199,NULL,70,'ASUS'),(200,NULL,70,'GIGABYTE'),(201,NULL,70,'msi'),(202,NULL,71,'0-399'),(203,NULL,71,'400-499'),(204,NULL,71,'500-599'),(205,NULL,72,'x299'),(206,NULL,72,'z390'),(207,NULL,72,'z370'),(208,NULL,73,'罗技'),(209,NULL,73,'戴尔'),(210,NULL,73,'小米'),(211,NULL,74,'0-29'),(212,NULL,74,'30-69'),(213,NULL,74,'70-119'),(214,NULL,75,'无线'),(215,NULL,75,'有线'),(216,NULL,75,'蓝牙'),(217,NULL,76,'罗技'),(218,NULL,76,'雷帕'),(219,NULL,76,'CHERRY'),(220,NULL,77,'1-39'),(221,NULL,77,'40-99 '),(222,NULL,77,'100-149'),(223,NULL,78,'键鼠套装'),(224,NULL,78,'机械键盘'),(225,NULL,78,'薄膜键盘'),(226,NULL,79,'罗技'),(227,NULL,79,'雷帕'),(228,NULL,79,'CHERRY'),(229,NULL,80,'1-39'),(230,NULL,80,'40-99'),(231,NULL,80,'100-149'),(232,NULL,81,'无线'),(233,NULL,81,'蓝牙'),(234,NULL,81,'有线'),(235,NULL,67,'AMD'),(236,NULL,67,'七彩虹');

/*Table structure for table `tb_cities` */

DROP TABLE IF EXISTS `tb_cities`;

CREATE TABLE `tb_cities` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `city_id` bigint(11) DEFAULT NULL COMMENT '城市ID',
  `provincesID` bigint(11) DEFAULT NULL COMMENT '省份ID',
  `city_name` varchar(4000) DEFAULT NULL COMMENT '城市名称',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='城市表';

/*Data for the table `tb_cities` */

/*Table structure for table `tb_column` */

DROP TABLE IF EXISTS `tb_column`;

CREATE TABLE `tb_column` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `special_topic_id` bigint(20) DEFAULT NULL COMMENT '专题id',
  `column_name` varchar(20) DEFAULT NULL COMMENT '栏目名称',
  `column_pics` varchar(500) DEFAULT NULL COMMENT '栏目图片集合',
  `product_ids` varchar(500) DEFAULT NULL COMMENT '商品id集合',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='栏目表';

/*Data for the table `tb_column` */

/*Table structure for table `tb_coupon` */

DROP TABLE IF EXISTS `tb_coupon`;

CREATE TABLE `tb_coupon` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `coupon_icon` varchar(500) DEFAULT NULL COMMENT '优惠券图标',
  `coupon_name` varchar(20) DEFAULT NULL COMMENT '优惠券名称',
  `coupon_publish_count` varchar(20) DEFAULT NULL COMMENT '优惠券发行数量',
  `coupon_use_count` varchar(20) DEFAULT NULL COMMENT '优惠券已使用数量',
  `coupon_receive_count` varchar(20) DEFAULT NULL COMMENT '优惠券领取数量',
  `coupon_amount` varchar(20) DEFAULT NULL COMMENT '优惠券抵扣金额',
  `person_limit` varchar(20) DEFAULT NULL COMMENT '每人限领张数',
  `start_time` datetime DEFAULT NULL COMMENT '开始可使用时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束可使用时间',
  `use_type` varchar(20) DEFAULT NULL COMMENT '使用类型',
  `coupon_code` varchar(50) DEFAULT NULL COMMENT '优惠码',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券表';

/*Data for the table `tb_coupon` */

/*Table structure for table `tb_order` */

DROP TABLE IF EXISTS `tb_order`;

CREATE TABLE `tb_order` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
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
  `order_status` varchar(20) DEFAULT NULL COMMENT '订单状态 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单',
  `total_amount` varchar(20) DEFAULT NULL COMMENT '订单总金额',
  `pay_amount` varchar(20) DEFAULT NULL COMMENT '支付金额',
  `freight_amount` varchar(20) DEFAULT NULL COMMENT '运费金额',
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
  `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `product_icon` varchar(500) DEFAULT NULL COMMENT '商品图标',
  `product_specifications` varchar(20) DEFAULT NULL COMMENT '商品规格',
  `product_brand` varchar(20) DEFAULT NULL COMMENT '商品品牌',
  `product_price` varchar(20) DEFAULT NULL COMMENT '商品价格',
  `product_quantity` varchar(20) DEFAULT NULL COMMENT '商品数量',
  `product_seller` varchar(20) DEFAULT NULL COMMENT '商品卖家',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_order_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

/*Data for the table `tb_order` */

/*Table structure for table `tb_payment_info` */

DROP TABLE IF EXISTS `tb_payment_info`;

CREATE TABLE `tb_payment_info` (
  `Id` bigint(20) NOT NULL COMMENT '主键id',
  `out_trade_no` varchar(20) DEFAULT NULL COMMENT '对外业务编号',
  `order_sn` varchar(50) DEFAULT NULL COMMENT '订单编号',
  `alipay_trade_no` varchar(50) DEFAULT NULL COMMENT '支付宝交易编号',
  `total_amount` varchar(20) DEFAULT NULL COMMENT '支付金额',
  `payment_status` varchar(20) DEFAULT NULL COMMENT '支付状态',
  `create_time` datetime DEFAULT NULL COMMENT '支付时间',
  `callback_content` datetime DEFAULT NULL COMMENT '同步回调时间',
  `subject` varchar(200) DEFAULT NULL COMMENT '交易内容',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付信息表';

/*Data for the table `tb_payment_info` */

/*Table structure for table `tb_price_gradient` */

DROP TABLE IF EXISTS `tb_price_gradient`;

CREATE TABLE `tb_price_gradient` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_price` varchar(20) DEFAULT NULL COMMENT '商品价格',
  `product_count` varchar(20) DEFAULT NULL COMMENT '数量',
  `discount_pice` varchar(20) DEFAULT NULL COMMENT '折扣价格 (满足指定数量的折扣价格)',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='价格梯度表 满多少减价多少';

/*Data for the table `tb_price_gradient` */

/*Table structure for table `tb_product` */

DROP TABLE IF EXISTS `tb_product`;

CREATE TABLE `tb_product` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_category_id` bigint(20) DEFAULT NULL COMMENT '产品分类id',
  `product_sn` varchar(20) DEFAULT NULL COMMENT '商品编号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `product_pic` varchar(500) DEFAULT NULL COMMENT '商品图片',
  `product_sale` bigint(50) DEFAULT NULL COMMENT '商品销量',
  `product_pice` decimal(20,4) DEFAULT NULL COMMENT '商品价格',
  `product_brand` varchar(50) DEFAULT NULL COMMENT '商品品牌',
  `product_stock` bigint(50) DEFAULT NULL COMMENT '商品库存',
  `product_appraise` bigint(50) DEFAULT NULL COMMENT '商品评价数',
  `product_publish_time` datetime DEFAULT NULL COMMENT '商品上架发布时间',
  `product_title` varchar(100) DEFAULT NULL COMMENT '商品标题',
  `product_seller` varchar(50) DEFAULT NULL COMMENT '商品卖家',
  `product_place_of_delivery` varchar(200) DEFAULT NULL COMMENT '商品发货地',
  `product_status` varchar(20) DEFAULT NULL COMMENT '商品状态 以逗号分割的商品状态：1->下架；2->上架；3->不推荐；4->推荐；5->未审核；6->审核通过；7->审核中；8->审核未通过',
  `product_weight` double(20,4) DEFAULT NULL COMMENT '商品重量',
  `product_album_pics` varchar(500) DEFAULT NULL COMMENT '商画册图片 图片以逗号分割',
  `product_specifications` varchar(100) DEFAULT NULL COMMENT '商品规格',
  `product_credit` varchar(50) DEFAULT NULL COMMENT '商品信用',
  `product_service_ids` varchar(50) DEFAULT NULL COMMENT '商品服务类型 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮',
  `product_detail_pics` varchar(500) DEFAULT NULL COMMENT '商品详情图册 图片以逗号分割',
  `product_description` varchar(500) DEFAULT NULL COMMENT '商品描述说明',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_product_product__id3D1D` (`product_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

/*Data for the table `tb_product` */

/*Table structure for table `tb_product_category` */

DROP TABLE IF EXISTS `tb_product_category`;

CREATE TABLE `tb_product_category` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父id',
  `category_name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `category_icon` varchar(500) DEFAULT NULL COMMENT '分类的图标',
  `category_down_product_count` varchar(20) DEFAULT NULL COMMENT '分类下的产品数量',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COMMENT='产品分类表';

/*Data for the table `tb_product_category` */

insert  into `tb_product_category`(`Id`,`parent_id`,`category_name`,`category_icon`,`category_down_product_count`) values (1,0,'家用电器',NULL,NULL),(2,0,'手机/运营商/数码',NULL,NULL),(3,0,'电脑/办公',NULL,NULL),(4,1,'电视',NULL,NULL),(5,1,'空调',NULL,NULL),(6,1,'洗衣机',NULL,NULL),(7,4,'超薄电视',NULL,NULL),(8,4,'全面屏电视',NULL,NULL),(9,4,'智能电视',NULL,NULL),(10,5,'空调挂机',NULL,NULL),(11,5,'空调柜机',NULL,NULL),(12,5,'中央空调',NULL,NULL),(13,6,'滚筒洗衣机',NULL,NULL),(14,6,'洗烘一体机',NULL,NULL),(15,6,'波轮洗衣机',NULL,NULL),(16,2,'手机通讯',NULL,NULL),(17,2,'运营商',NULL,NULL),(18,2,'手机配件',NULL,NULL),(19,16,'手机',NULL,NULL),(20,16,'游戏手机',NULL,NULL),(21,16,'老人机',NULL,NULL),(22,17,'合约机',NULL,NULL),(23,17,'选号码',NULL,NULL),(24,17,'固态宽带',NULL,NULL),(25,18,'手机壳',NULL,NULL),(26,18,'贴膜',NULL,NULL),(27,18,'手机存储卡',NULL,NULL),(28,3,'电脑整机',NULL,NULL),(29,3,'电脑配件',NULL,NULL),(30,3,'外设产品',NULL,NULL),(31,28,'笔记本',NULL,NULL),(32,28,'游戏本',NULL,NULL),(33,28,'平板电脑',NULL,NULL),(34,29,'显示器',NULL,NULL),(35,29,'CPU',NULL,NULL),(36,29,'主板',NULL,NULL),(37,30,'鼠标',NULL,NULL),(38,30,'键盘',NULL,NULL),(39,30,'键鼠套装',NULL,NULL);

/*Table structure for table `tb_product_parameter_type` */

DROP TABLE IF EXISTS `tb_product_parameter_type`;

CREATE TABLE `tb_product_parameter_type` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `product_id` bigint(11) DEFAULT NULL COMMENT '商品id',
  `parameter_type` varchar(50) DEFAULT NULL COMMENT '参数类型',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_prodype_product_id082F` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品参数类型表';

/*Data for the table `tb_product_parameter_type` */

/*Table structure for table `tb_product_paramter` */

DROP TABLE IF EXISTS `tb_product_paramter`;

CREATE TABLE `tb_product_paramter` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `product_paramter_type_id` bigint(20) DEFAULT NULL COMMENT '关联编号',
  `product_paramter_name` varchar(50) DEFAULT NULL COMMENT '商品参数名称',
  `product_paramter_value` varchar(50) DEFAULT NULL COMMENT '商品参数值',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_prodter_product__idFA12` (`product_paramter_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品参数表';

/*Data for the table `tb_product_paramter` */

/*Table structure for table `tb_product_specifications` */

DROP TABLE IF EXISTS `tb_product_specifications`;

CREATE TABLE `tb_product_specifications` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `specifications_name` varchar(300) DEFAULT NULL COMMENT '规格名称',
  `specifications_corresponding_pice` decimal(20,4) DEFAULT NULL COMMENT '规格对应的价格',
  `specifications_corresponding_icon` varchar(500) DEFAULT NULL COMMENT '规格对应的图标',
  `specifications_sorresponding_pic` varchar(500) DEFAULT NULL COMMENT '规格对应的图片',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品规格表';

/*Data for the table `tb_product_specifications` */

/*Table structure for table `tb_product_unit` */

DROP TABLE IF EXISTS `tb_product_unit`;

CREATE TABLE `tb_product_unit` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `unit_name` varchar(20) DEFAULT NULL COMMENT '计量名称',
  `unit_number` varchar(20) DEFAULT NULL COMMENT '计量数量',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_prodnit_product_id9B58` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品计量表';

/*Data for the table `tb_product_unit` */

/*Table structure for table `tb_province` */

DROP TABLE IF EXISTS `tb_province`;

CREATE TABLE `tb_province` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `province_id` bigint(11) DEFAULT NULL COMMENT '省份ID',
  `province_name` varchar(4000) DEFAULT NULL COMMENT '省份名称',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省份表';

/*Data for the table `tb_province` */

/*Table structure for table `tb_seller` */

DROP TABLE IF EXISTS `tb_seller`;

CREATE TABLE `tb_seller` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `seller_name` varchar(20) DEFAULT NULL COMMENT '卖家名',
  `seller_credit_level` varchar(20) DEFAULT NULL COMMENT '卖家信用级别',
  `seller_detail_address` varchar(100) DEFAULT NULL COMMENT '卖家详细地址',
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
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家表';

/*Data for the table `tb_seller` */

/*Table structure for table `tb_seller_product_post_sale` */

DROP TABLE IF EXISTS `tb_seller_product_post_sale`;

CREATE TABLE `tb_seller_product_post_sale` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `seller_product_id` bigint(20) DEFAULT NULL COMMENT '卖家商品id',
  `seller_product_post_sale_pics` varchar(500) DEFAULT NULL COMMENT '卖家商品售后图册',
  `seller_product_post_sale_explain` varchar(500) DEFAULT NULL COMMENT '卖家商品售后说明',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_sellale_seller_p_id2CBF` (`seller_product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家商品售后';

/*Data for the table `tb_seller_product_post_sale` */

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
  `seller_store_new_products` varchar(50) DEFAULT NULL COMMENT '卖家店铺新品',
  `seller_store_home_page_carousel_pic` varchar(500) DEFAULT NULL COMMENT '卖家店铺首页轮播图',
  `seller_store_pics` varchar(500) DEFAULT NULL COMMENT '卖家店铺图册',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_sellore_seller_id5380` (`seller_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家店铺';

/*Data for the table `tb_seller_store` */

/*Table structure for table `tb_special_topic` */

DROP TABLE IF EXISTS `tb_special_topic`;

CREATE TABLE `tb_special_topic` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `activity_id` bigint(20) DEFAULT NULL COMMENT '活动id',
  `special_icon` varchar(500) DEFAULT NULL COMMENT '专题图标',
  `special_topic_name` varchar(50) DEFAULT NULL COMMENT '专题名称',
  `discount_describe` varchar(20) DEFAULT NULL COMMENT '优惠描述',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专题表';

/*Data for the table `tb_special_topic` */

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
  `user_account_status` varchar(20) DEFAULT NULL COMMENT '用户账户状态',
  `user_account_create_time` datetime DEFAULT NULL COMMENT '用户账户创建时间',
  `user_birthday` datetime DEFAULT NULL COMMENT '用户生日',
  `user_icon` varchar(500) DEFAULT NULL COMMENT '用户头像',
  `user_real_name` varchar(20) DEFAULT NULL COMMENT '用户真实姓名',
  `user_idcard` varchar(50) DEFAULT NULL COMMENT '用户身份证',
  `user_secret_protection_problem` varchar(100) DEFAULT NULL COMMENT '用户密保问题',
  `user_secret_protection_answer` varchar(100) DEFAULT NULL COMMENT '用户密保回答',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `tb_user` */

/*Table structure for table `tb_user_attention` */

DROP TABLE IF EXISTS `tb_user_attention`;

CREATE TABLE `tb_user_attention` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `product_collections_time` datetime DEFAULT NULL COMMENT '商品关注时间',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_userion_product_idAF60` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户关注表';

/*Data for the table `tb_user_attention` */

/*Table structure for table `tb_user_collections` */

DROP TABLE IF EXISTS `tb_user_collections`;

CREATE TABLE `tb_user_collections` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品id',
  `product_collections_time` datetime DEFAULT NULL COMMENT '商品收藏时间',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_userons_product_idF645` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户收藏表';

/*Data for the table `tb_user_collections` */

/*Table structure for table `tb_user_coupon` */

DROP TABLE IF EXISTS `tb_user_coupon`;

CREATE TABLE `tb_user_coupon` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `coupon_id` bigint(20) DEFAULT NULL COMMENT '关联编号',
  `coupon_code` varchar(20) DEFAULT NULL COMMENT '优惠码',
  `user_coupon_create_time` datetime DEFAULT NULL COMMENT '用户领取优惠券的时间',
  `use_status` varchar(20) DEFAULT NULL COMMENT '使用状态 使用状态：0->未使用；1->已使用；2->已过期',
  `order_id` decimal(20,0) DEFAULT NULL COMMENT '订单id',
  `order_sn` varchar(20) DEFAULT NULL COMMENT '订单编号',
  PRIMARY KEY (`Id`),
  KEY `IDX_tb_user_coupon_user_id` (`user_id`),
  KEY `IDX_tb_userpon_coupon_id9157` (`coupon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户优惠券表';

/*Data for the table `tb_user_coupon` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
