package com.javaliao.sericefeign.component;

import com.javaliao.sericefeign.feignInterface.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/21 11:47
 * SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }
}
