package com.javaliao.home.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Author lzw
 * @Description
 * @Date 13:02 2019/12/18
 * @InterfaceName HomeService
 * @Version 1.0
 **/

@FeignClient(value = "home-service")
public interface HomeService {

    void getHomeInfo();
}
