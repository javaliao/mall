package com.javaliao.basic.utils;

import java.math.BigDecimal;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/11 17:20
 */
public class NumberTool {

    /**
     * 字符串转Double
     * @param value
     * @return 0：为空
     */
    public static Double Double(String value){
        return value==null||"".equals(value)||"null".equals(value)?0:Double.valueOf(value);
    }

    /**
     * 字符串转Integer
     * @param value
     * @return -1：转换失败
     */
    public static int Integer(String value){
        try{
            return Integer.valueOf(value==null||"".equals(value)?"0":value);
        }catch(Exception e){
            return -1;
        }
    }

    /**
     * 字符串转Long
     * @param value
     * @return -1：转换失败
     */
    public static long Long(String value){
        try{
            return Long.valueOf(value==null||"".equals(value)?"0":value);
        }catch(Exception e){
            return -1;
        }
    }

    /**
     * 字符串转Float
     * @param value
     * @return
     */
    public static float Float(String value){
        return Float.valueOf(value==null||"".equals(value)?"0":value);
    }

    /**
     * 保留count位小数，四舍五入
     * @param value
     * @param count  小数位
     * @return
     */
    public static double KeepDecimalPlaces(double value,int count){
        BigDecimal bd = new BigDecimal(value);
        bd=bd.setScale(count,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    /**
     * 字符串转double,保留count位小数，四舍五入
     * @param value
     * @param count 小数位
     * @return
     */
    public static double KeepDecimalPlaces(String value,int count){
        BigDecimal bd = BigDecimal.ZERO;
        if(StringTool.isEmpty(value)){
            bd = new BigDecimal(0);
        }else {
            bd = new BigDecimal(value);
        }
        bd=bd.setScale(count,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }

    /**
     * 字符串转int
     * @param value
     * @return
     */
    public static int KeepDecimalPlaces(String value){
        BigDecimal bd = BigDecimal.ZERO;
        if(StringTool.isEmpty(value)){
            bd = new BigDecimal(0);
        }else {
            bd = new BigDecimal(value);
        }
        bd=bd.setScale(0,BigDecimal.ROUND_HALF_UP);
        return bd.intValue();
    }

    /**
     * double转int
     * @param value
     * @return
     */
    public static int KeepDecimalPlaces(double value){
        BigDecimal bd = new BigDecimal(value);
        bd=bd.setScale(0,BigDecimal.ROUND_HALF_UP);
        return bd.intValue();
    }
}
