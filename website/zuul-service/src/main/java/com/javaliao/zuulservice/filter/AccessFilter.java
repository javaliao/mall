package com.javaliao.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;

@Component
public class AccessFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(AccessFilter .class);

    /**
     * filterType代表过滤类型
     * PRE: 该类型的filters在Request routing到源web-service之前执行。用来实现Authentication、选择源服务地址等
     * ROUTING：该类型的filters用于把Request routing到源web-service，源web-service是实现业务逻辑的服务。
     * 这里使用HttpClient请求web-service。
     * POST：该类型的filters在ROUTING返回Response后执行。用来实现对Response结果进行修改，收集统计数据以及把Response传输会客户端。
     * ERROR：上面三个过程中任何一个出现错误都交由ERROR类型的filters进行处理。
     * 主要关注 pre、post和error。分别代表前置过滤，后置过滤和异常过滤。
     * 如果你的filter是pre的，就是指请求先进入pre的filter类，你可以进行一些权限认证，日志记录，
     * 或者额外给Request增加一些属性供后续的filter使用。pre会优先按照order从小到大执行，然后再去执行请求转发到业务服务。
     * 再说post，如果type为post，那么就会执行完被路由的业务服务后，再进入post的filter，在post的filter里，
     * 一般做一些日志记录，或者额外增加response属性什么的。
     * 最后error，如果在上面的任何一个地方出现了异常，就会进入到type为error的filter中。
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * filterOrder代表过滤器顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /***
     * shouldFilter代表这个过滤器是否生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 这个是主要的处理逻辑的地方，我们做权限控制、日志等都是在这里。
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("filter过滤器");
        log.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());
        //获取传来的参数accessToken
        Object accessToken = request.getParameter("accessToken");
        //不允许accessToken为空
//        if(accessToken == null) {
//            log.warn("access token is empty");
//            //过滤该请求，不往下级服务去转发请求，到此结束
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            ctx.setResponseBody("{\"result\":\"accessToken为空!\"}");
//            ctx.getResponse().setContentType("text/html;charset=UTF-8");
//            return null;
//        }
        //如果有token，则进行路由转发
        log.info("access token ok");
        //这里return的值没有意义，zuul框架没有使用该返回值
        return null;
    }

}
