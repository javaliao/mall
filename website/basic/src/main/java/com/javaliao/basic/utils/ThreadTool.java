package com.javaliao.basic.utils;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.ui.ModelMap;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

public class ThreadTool {

    static ThreadPoolTaskExecutor threadPoolTaskExecutor;

    static {
        threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.setQueueCapacity(100);
        threadPoolTaskExecutor.initialize();
    }

    /**
     * 使用线程池执行业务方法并加入视图
     * @param tasks 计数器
     * @param modelMap 视图
     * @param modelName 视图名
     * @param service 要调用的service
     * @param method 被调用的方法
     * @param param 方法参数
     */
    public static void runMethod(CountDownLatch tasks, ModelMap modelMap, String modelName, Object service, Method method, Object... param){
        threadPoolTaskExecutor.submit(new RunInThreadPool(
                tasks,modelMap,modelName,service,method,param));
    }


}
