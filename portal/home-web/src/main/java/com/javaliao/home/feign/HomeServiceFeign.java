package com.javaliao.home.feign;

import com.javaliao.home.component.ServiceHystric;
import common.CommonResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author lzw
 * @Description
 * @Date 13:16 2019/12/18
 * @InterfaceName HomeServiceFeign
 * @Version 1.0
 **/

@FeignClient(value = "home-service",fallback = ServiceHystric.class)
public interface HomeServiceFeign {

    //两个坑：1. @GetMapping不支持   2. @PathVariable和@RequestParam得设置value
    @RequestMapping(value = "/homeService/getProductCategory",method = RequestMethod.GET)
    CommonResult getProductCategory();
}
