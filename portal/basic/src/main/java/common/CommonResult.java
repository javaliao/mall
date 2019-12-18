package common;

import constant.DataConstant;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/11 17:40
 */
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    protected CommonResult() {}

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 对象空判断
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }else if (obj instanceof CharSequence){//CharSequence接口的实现类：CharBuffer、String、StringBuffer、StringBuilder
            return ((CharSequence) obj).length() == 0;
        }
        else if (obj instanceof Collection) {//集合根接口Collection
            return ((Collection) obj).isEmpty();
        }
        else if (obj instanceof Map) {//Map接口
            return ((Map) obj).isEmpty();
        }
        else if (obj.getClass().isArray()) {//是否为数组
            return Array.getLength(obj) == 0;
        }
        return false;
    }

    /**
     * 判断集合或者对象是否为空
     * @param data
     * @return
     */
    public static Object checkNull(Object data){
        //对象判断是否为空
        if(isEmpty(data)){
            return DataConstant.NO_DATA;
        }else {
            return data;
        }
    }

    public static Object ckeckModify(int num ){
        if(num <= 0){
            return DataConstant.MODIFY_DATA_FALSE;
        }else {
            return DataConstant.MODIFY_DATA_SUCCESS;
        }

    }

    /**
     * 成功返回结果
     * @param data 获取的数据
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     * @param data 获取的数据
     * @param message 提升信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode) {
        return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

}