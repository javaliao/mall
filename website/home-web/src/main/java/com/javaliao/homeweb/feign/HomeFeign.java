package com.javaliao.homeweb.feign;

import com.javaliao.basic.common.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author lzw
 * @Description
 * @Date 16:55 2019/12/24
 * @InterfaceName HomeFeign
 * @Version 1.0
 **/

@FeignClient(value = "home-service")
public interface HomeFeign {

    /**
     * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
     * 注意：两个坑：1. @GetMapping不支持   2. @PathVariable和@RequestParam得设置value
     */
    @RequestMapping(value = "/productController/getProductCategory",method = RequestMethod.GET)
    CommonResult getProductCategory();
}
