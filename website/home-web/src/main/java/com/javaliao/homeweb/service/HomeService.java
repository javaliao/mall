package com.javaliao.homeweb.service;

import org.springframework.ui.ModelMap;

/**
 * @Author lzw
 * @Description
 * @Date 16:50 2019/12/24
 * @InterfaceName HomeService
 * @Version 1.0
 **/


public interface HomeService {

    ModelMap getHomeInfo(ModelMap modelMap) throws NoSuchMethodException, InterruptedException;

}
