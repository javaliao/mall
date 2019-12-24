#项目目前处于基础架构搭建中，拉取代码可能出现maven错误或者版本冲突，依赖缺失，项目跑不动等问题，请耐心等待，后期正式搭建之后会迭代版本


#项目架构

basic作为基础库，用于存放公共方法，或者工具类

bean作为实体库，用于存放实体类

service-zuul作为路由与服务链路追踪，用于请求转发与监控

config-server作为配置中心服务端，用于统一配置

home作为网站首页，访问地址：http://localhost:8880/

#项目前期测试D版本

eurakaserver作为测试的注册中心，由于单一注册中心不是高可用，后期可能更换，前期先用着

serice-feign与service-ribbon和serivce-hi作为测试feign与ribbon的项目，后期项目不可将请求路由到这二个项目中

启动zuul项目，euraka项目可访问http://localhost:5000服务链路追踪

启动euraka项目可访问http://localhost:8761注册中心

启动zuul项目，euraka项目，ribbon项目,service-hi项目可访问http://localhost:5000/api-a/hi?name=aa从zuul到ribbon到service-hi

启动zuul项目，euraka项目，feign项目,service-hi项目可访问http://localhost:5000/api-b/hi?name=aa从zuul到feign到service-hi

basic基础库，bean实体库

废弃项目：config-server,home-web,home-service,fegin

#D版本和E版本的区别

二者均基于SpringBoot的1.5.x版本。但支持其他组件的版本不同，如以 Dalston.SR4 和 Edgware.RELEASE 来对比：

spring-cloud-config 分别对应 1.3.3和 1.4.0; 
spring-cloud-netflix 分别对应 1.3.5和 1.4.0; 
spring-cloud-consul 分别对应 1.2.1和 1.3.0; 
spring-cloud-gateway 前者不支持，后者 1.0.0。

每个小版本的不同，会有细微差别。

F版本
F版本是个绝对的大版本，几乎所有组件，全部同步变更版本号为2.x。
