package com.javaliao.basic.utils;

import net.sf.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/11 16:24
 */
public class StringTool {

    /**
     * 判断字符串是否为空字符串
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str) || str.trim().length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断字符串是否不为空字符串
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }


    /**
     * 如果为空，提供新值
     * @param value 需要判断的值
     * @param defalut_value 替换的值
     * @return
     */
    public static String getNull(String value, String defalut_value) {
        if (isEmpty(value)) {
            return defalut_value;
        }
        return value;
    }

    /**
     * 判断字符串不为空且不为null、Null
     * @param value
     * @return
     */
    public static boolean isNull(String value) {
        if (value == null || "".equals(value) || "null".equals(value) || "Null".equals(value)) {
            return true;
        }
        return false;
    }

    /**
     * 去除字符串前后空格，全角空格
     * @param source
     * @return
     */
    public static String removeBlank(String source) {
        if (source == null) {
            return "";
        } else {
            source = source.trim();
            while (source.startsWith("　")) {// 这里判断是不是全角空格
                source = source.substring(1, source.length()).trim();
            }
            while (source.endsWith("　")) {
                source = source.substring(0, source.length() - 1).trim();
            }
        }
        return source;
    }

    /**
     * 线程不安全
     * 字符串数组转String类型
     * @param value 例子：{ "0", "1", "2", "3", "4", "5" };
     * @return
     */
    public static String ArraysConvertStringUnsafe(String[] value){
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : value) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    /**
     * 线程安全
     * 字符串数组转String类型
     * @param value 例子：{ "0", "1", "2", "3", "4", "5" };
     * @return
     */
    public static String ArraysConvertStringSafe(String[] value){
        StringBuffer stringBuilder = new StringBuffer();
        for (String s : value) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    /**
     * 字符串转String[]数组并去除最后的，号
     * @param value 例子："0,1,2,3,4,5,"
     * @return
     */
    public static String[] StringConvertArrays(String value){
        String substring = "";
        substring = value.substring(value.length() - 1, value.length());
        if(",".equals(substring)){
            substring = value.substring(0, value.length() - 1);
        }
        String[] split = substring.split(",");
        return split;
    }

    /**
     * 将txt文本里的数据转化为String数组
     * @param pathToFile 文件路径
     * @return
     * @throws IOException
     */
    public static String[] TextConvertStringArrays(String pathToFile) throws IOException {
        String[] names = (String[]) Files.lines(Paths.get(pathToFile)).collect(Collectors.toList()).toArray();
        return names;
    }

    /**
     * 线程不安全
     * 将txt文本里的数据转化为String
     * @param pathToFile
     * @return
     * @throws IOException
     */
    public static String TextConvertStringUnsafe(String pathToFile) throws IOException{
        String[] arrays = TextConvertStringArrays(pathToFile);
        return ArraysConvertStringUnsafe(arrays).toString();
    }

    /**
     * 线程安全
     * 将txt文本里的数据转化为String
     * @param pathToFile
     * @return
     * @throws IOException
     */
    public static String TextConvertStringSafe(String pathToFile) throws IOException{
        String[] arrays = TextConvertStringArrays(pathToFile);
        return ArraysConvertStringSafe(arrays).toString();
    }

    /**
     * 字符串转实体类
     * @param t 自定义实体类
     * @param json json字符串
     * @return
     */
    public static Object StringConvertObject(Object t,String json){
        JSONObject jsonObject = new JSONObject().fromObject(json);
        return JSONObject.toBean(jsonObject, t.getClass());
    }

    /**
     * 自定义实体类转String
     * @param object
     * @return
     */
    public static String ObjectConvertString(Object object){
        return JSONObject.fromObject(object).toString();
    }

    /**
     * 生成随机验证码的工具方法
     * @param length：验证码的位数
     * @return
     */
    public static String randomCode(int length) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i <length; i++) {
            double random = Math.random();
            int code = (int) (random * 10);
            builder.append(code);
        }
        return builder.toString();
    }

}
