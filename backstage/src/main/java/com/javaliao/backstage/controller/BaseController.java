package com.javaliao.backstage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


@ControllerAdvice
public class BaseController {

    private final static Logger logger = LoggerFactory.getLogger(BaseController.class);


    //非法参数异常
    @ExceptionHandler(IllegalArgumentException.class)
    public String illegalArgumentException(IllegalArgumentException e) throws UnsupportedEncodingException {
        String error = "非法参数异常:" + e.getMessage();
        logger.info(error);
        return "redirect:toError?message=" + URLEncoder.encode(error,"UTF-8");
    }

    //数组下标越界异常
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public String arrayIndexOutOfBoundsException(ArrayIndexOutOfBoundsException e) throws UnsupportedEncodingException {
        String error = "数组下标越界异常:" + e.getMessage();
        logger.info(error);
        return "redirect:toError?message=" + URLEncoder.encode(error,"UTF-8");
    }

    //类型强制转换类型
    @ExceptionHandler(ClassCastException.class)
    public String classCastException(ClassCastException e) throws UnsupportedEncodingException {
        String error = "类型强制转换类型:" + e.getMessage();
        logger.info(error);
        return "redirect:toError?message=" + URLEncoder.encode(error,"UTF-8");
    }

    //数据格式异常
    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatException(NumberFormatException e) throws UnsupportedEncodingException {
        String error = "数据格式异常:" + e.getMessage();
        logger.info(error);
        return "redirect:toError?message=" + URLEncoder.encode(error,"UTF-8");
    }

    //捕获空指针异常
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerException(NullPointerException e) throws UnsupportedEncodingException {
        String error = "空指针异常:" + e.getMessage();
        logger.info(error);
        return "redirect:toError?message=" + URLEncoder.encode(error,"UTF-8");
    }

    //捕获除0异常
    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticException(ArithmeticException e) throws UnsupportedEncodingException {
        String error = "算数异常:" + e.getMessage();
        logger.info(error);
        return "redirect:toError?message=" + URLEncoder.encode(error,"UTF-8");
    }


    //异常
    @ExceptionHandler(Exception.class)
    public String exception(Exception e) throws UnsupportedEncodingException {
        String error = "异常:" + e.getMessage();
        logger.info(error);
        return "redirect:toError?message=" + URLEncoder.encode(error,"UTF-8");
    }

}
