# mall 分布式电商

## backstage：分布式电商总后台技术选型

###使用freemark作为模板引擎，先简单练练手，主要是网站前台后期要做seo推广
后台首页：http://localhost:8085/jumpController/

###使用bootstrap作为响应式框架

###使用springBoot+mybatis作为主体框架

###使用IntelliJ IDEA的Database生成实体类

###使用tk.mybatis作为通用mapper

###使用druid数据库连接池，以及监控启动项目
druid监控地址：http://localhost:8085/druid/login.html。
使用用户名：druid密码：druid登录后，必须先访问一个后台应用的URL，执行了后台程序后，才能看到监控数据。

###使用actuator用于在项目运行时，查看运行中的各种配置及参数等
类似：Mapped "{[/jumpController/toProductCategoryModify],methods=[GET]}" 

###使用devtools用于修改代码自动重启

###使用Swagger-UI作为API文档生产工具
访问文档地址：http://localhost:8085/swagger-ui.html

###使用Hadoop的HDFS作为分布式文件系统，实现图片存储

###使用log4j作为日志文件,我配置的日志文件路径是E:\Project\PersonalProject\DistributedProject\Log\spring.log

##  portal: 测试项目，SpringCould的Dalston与SpringBoot的1.5.x版本测试

###该项目目前仅用于SpringCould测试，于电商项目无关，可用于对SpringCould架构测试使用

##  website：分布式电商网站前台技术选型

###使用freemark作为模板引擎,后期SEO推广

###使用springCould全家桶+mybatis作为主体框架

#####使用eureka作为服务注册中心,这里并没有做高可用的注册中心，仅为单一注册中心，便于后期更换注册中心consul或者zookeeper

#####使用Zipkin作为分布式的跟踪系统

#####使用zuul作为路由网关，实现请求转发

#####使用Hystrix作为断路器，实现异常熔断

#####使用Feign作为服务消费者，对外暴露接口

#####使用ribbon作为负载均衡客户端

#####使用config作为统一的配置中心

###使用mybatisGenerator作为mybatis代码生成器

###使用Swagger-UI作为API文档生产工具，实现在线调试，接口文档查看

###使用Redis作为缓存，实现数据存储，快速读取

###使用solr作为全文搜索服务器，实现了可配置、可扩展并对查询性能进行了优化，并且提供了一个完善的功能管理界面

###使用kafka作为消息中间件，实现高吞吐，完全的分布式系统，适合处理海量数据

###使用ClouderaFlume作为日志收集系统，支持在日志系统中定制各类数据发送方，用来收集数据

###使用Hadoop的HDFS作为分布式文件系统，实现图片存储

###使用Hadoop的yarn作为资源管理器

###使用Hadoop的mapreduce作为并行处理的计算模型、框架和平台，来计算

###使用Hadoop的common一些工具

#linux环境部署以及集群搭建




