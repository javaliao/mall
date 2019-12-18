#分布式电商网站前台技术选型

##使用freemark作为模板引擎,后期SEO推广

##使用springCould全家桶+mybatis作为主体框架

####使用eureka作为服务注册中心,这里并没有做高可用的注册中心，仅为单一注册中心，便于后期更换注册中心consul或者zookeeper

####使用Zipkin作为分布式的跟踪系统

####使用zuul作为路由网关，实现请求转发

####使用Hystrix作为断路器，实现异常熔断

####使用Feign作为服务消费者，对外暴露接口

####使用ribbon作为负载均衡客户端

####使用config作为统一的配置中心

##使用mybatisGenerator作为mybatis代码生成器

##使用Swagger-UI作为API文档生产工具，实现在线调试，接口文档查看

##使用Redis作为缓存，实现数据存储，快速读取

##使用solr作为全文搜索服务器，实现了可配置、可扩展并对查询性能进行了优化，并且提供了一个完善的功能管理界面

##使用kafka作为消息中间件，实现高吞吐，完全的分布式系统，适合处理海量数据

##使用ClouderaFlume作为日志收集系统，支持在日志系统中定制各类数据发送方，用来收集数据

##使用Hadoop的HDFS作为分布式文件系统，实现图片存储

##使用Hadoop的yarn作为资源管理器

##使用Hadoop的mapreduce作为并行处理的计算模型、框架和平台，来计算  

##使用Hadoop的common一些工具

#项目架构

basic作为基础库，用于存放公共方法，或者工具类

bean作为实体库，用于存放实体类

service-zuul作为网关路由

service-ribbon作为负载均衡

service-feign作为服务暴露

eurekaserver作为注册中心

config-service作为配置中心服务端

http://localhost:5000服务链路追踪

http://localhost:8761注册中心

http://localhost:5000/api-a/hi?name=aa从zuul到ribbon到service-hi

http://localhost:5000/api-b/hi?name=aa从zuul到feign到service-hi

