package utils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/11 16:20
 */
public class PropertyClone {

    private final static String SET_METHOD_FIX = "set";

    private final static String GET_METHOD_FIX = "get";

    private PropertyClone() {

    }

    private static <T> Map<String, Method> findPublicMethod(T t, String fix) {
        Map<String, Method> methodMap = new HashMap<String, Method>();
        Class<?> clz = t.getClass();
        while (!clz.equals(Object.class)) {
            Method[] methods = clz.getDeclaredMethods();
            for (Method method : methods) {
                int status = method.getModifiers();
                if (!Modifier.isPublic(status)) {
                    continue;
                }
                if (method.getName().startsWith(fix)) {
                    String field = method.getName().substring(3, 4).toLowerCase() + method.getName().substring(4);
                    if (methodMap.keySet().contains(field)) {
                        continue;
                    }
                    methodMap.put(field, method);
                }
            }
            clz = clz.getSuperclass();
        }
        return methodMap;
    }

    /**
     * <pre>
     * 属性拷贝工具方法
     * </pre>
     *
     * @param <T>  对象类型
     * @param dest 目标对象
     * @param orig 源对象
     * @param copyNullFlag 当属性值为null时，是否赋值. true:赋值,false:不赋值
     */
    public static <T, K> void copyProperties(T dest, K orig, Boolean copyNullFlag) {
        copyProperties(dest, orig, copyNullFlag, null);
    }

    /**
     * @param <T>
     * @param <K>
     * @param dest
     * @param orig
     * @param copyNullFlag
     * @param uncope       非克隆属性名
     */
    public static <T, K> void copyProperties(T dest, K orig, Boolean copyNullFlag, Set<String> uncope) {
        Map<String, Method> destSetMethodMap = findPublicMethod(dest, SET_METHOD_FIX);
        // 源对象中的所有get方法集合
        Map<String, Method> origGetMethodMap = findPublicMethod(orig, GET_METHOD_FIX);
        Set<String> fields = origGetMethodMap.keySet();
        boolean flag = (uncope == null || uncope.size() <= 0) ? false : true;
        for (String field : fields) {
            if (flag && uncope.contains(field)) {
                continue;
            }
            Method getMethod = origGetMethodMap.get(field);
            try {
                Object value = getMethod.invoke(orig, new Object[]{});
                if (!copyNullFlag) {
                    if (value == null) {
                        continue;
                    }
                }
                Method setMethod = destSetMethodMap.get(field);
                if (setMethod != null)
                    setMethod.invoke(dest, value);
            } catch (Exception e) {
                throw new RuntimeException("实体属性克隆发生异常");
            }
        }
    }
}
