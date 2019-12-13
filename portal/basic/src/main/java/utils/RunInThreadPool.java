package utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class RunInThreadPool implements Runnable {

    CountDownLatch countDownLatch;
    Map modelMap;
    String keyName;
    Object service;
    Method method;
    Object[] param;

    /**
     * @param countDownLatch 计数器
     * @param modelMap       视图
     * @param keyName        参数名
     * @param service        要调用的service
     * @param method         被调用的方法
     * @param param          方法参数
     */
    public RunInThreadPool(CountDownLatch countDownLatch, Map modelMap, String keyName, Object service, Method method, Object... param) {
        this.countDownLatch = countDownLatch;
        this.modelMap = modelMap;
        this.keyName = keyName;
        this.service = service;
        this.method = method;
        this.param = param;
    }

    @Override
    public void run() {
        Object result = null;
        try {
            Long start = System.currentTimeMillis();
            result = method.invoke(service, param);
            Long end = System.currentTimeMillis();
            System.out.println(String.format("%s *** 执行 ((( %s ))) 方法,耗时 <<< %s 秒 >>> 参数",
                    service.getClass(),
                    method.getName(),
                    (end - start),
                    JsonUtils.toJson(param)));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        modelMap.put(keyName, result);
        countDownLatch.countDown();
    }
}
