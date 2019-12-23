package com.javaliao.home.component;

import com.javaliao.home.feign.HomeServiceFeign;
import common.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @Description :SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
 * @Author :USE
 * @Date :13:20 2019/12/18
 * @ClassName :ServiceHystric
 **/
@Component
public class ServiceHystric implements HomeServiceFeign {

    @Override
    public CommonResult getProductCategory() {
        return null;
    }
}
