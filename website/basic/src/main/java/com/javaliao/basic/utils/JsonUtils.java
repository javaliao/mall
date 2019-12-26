package com.javaliao.basic.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.CollectionType;

/**
 * JSON 工具类
 *
 * @Auth admin
 */
public class JsonUtils {

    private static Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    private static ObjectMapper mapper = null;

    static {
        mapper = new ObjectMapper();
        // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        // 允许key没有使用双引号的json
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 零时区
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        mapper.setDateFormat(format);

        mapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * 将对象转换成JSON字符串
     *
     * @param obj
     *            目标对象
     * @return 字符串，转换失败时返回null
     */
    public static String toJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("write to json string error:" + obj, e);
            return null;
        }
    }

    /**
     * 将单个键值对转换成JSON字符串，用于返回只有一个键值对json时的便捷方法
     *
     * @param key
     *            目标key
     * @param value
     *            目标value
     * @return 字符串，转换失败时返回null
     */
    public static String toJson(Object key, Object value) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put(key, value);
        try {
            return mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            logger.error("write to json string error:" + map, e);
            return null;
        }
    }

    /**
     * 当JSON里只含有Bean的部分属性，更新一个已存在Bean，只覆盖该部分的属性.
     */
    public static void update(String jsonString, Object object) {
        try {
            mapper.readerForUpdating(object).readValue(jsonString);
        } catch (JsonProcessingException e) {
            logger.error("update json string:" + jsonString + " to object:" + object + " error.", e);
        } catch (IOException e) {
            logger.error("update json string:" + jsonString + " to object:" + object + " error.", e);
        }
    }

    /**
     * 反序列化复杂类型<br/>
     * 针对复杂类型反序列化时，自动转化为LinkedHashMap问题
     *
     * @param jsonString
     * @param typeRef
     *            自定义解析器类型
     * @return
     */
    public static <T> T fromJson(String jsonString, TypeReference<T> typeRef) {
        if (StringUtils.isBlank(jsonString)) {
            return null;
        }
        try {
            return mapper.readValue(jsonString, typeRef);
        } catch (Exception e) {
            logger.error("parse json string error:" + jsonString, e);
            return null;
        }
    }

    /**
     * 反序列化POJO或简单Collection如List<String>.
     * <p>
     * 如果JSON字符串为Null或"null"字符串, 返回Null. 如果JSON字符串为"[]", 返回空集合.
     * <p>
     * 如需反序列化复杂Collection如List<MyBean>, 请使用fromJson(String, JavaType)
     *
     * @see #fromJson(String, JavaType)
     */
    public static <T> T fromJson(String jsonString, Class<T> clazz) {
        if (StringUtils.isBlank(jsonString)) {
            return null;
        }
        try {
            return mapper.readValue(jsonString, clazz);
        } catch (IOException e) {
            logger.error("parse json string error:" + jsonString, e);
            return null;
        }
    }

    public static <T> T convertValue(Object object, Class<T> clazz) throws IllegalArgumentException {
        if (null == object) {
            return null;
        }
        try {
            return mapper.convertValue(object, clazz);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * 反序列化复杂Collection如List<Bean>
     *
     * @param jsonString
     *            集合类型
     * @return 转换失败时返回 null
     */
    public static <L extends Collection<E>, E> L fromJson(String jsonString, Class<L> collectionClass,
                                                          Class<E> elementClass) {
        if (StringUtils.isBlank(jsonString)) {
            logger.error("要转换的json为空:" + jsonString);
            return null;
        }
        try {
            CollectionType type = mapper.getTypeFactory().constructCollectionType(collectionClass, elementClass);
            return mapper.readValue(jsonString, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 反序列化复杂Collection如List<Bean>
     *
     * @param object
     *            集合类型
     * @return 转换失败时返回 null
     */
    public static <L extends Collection<E>, E> L fromJson(Object object, Class<L> collectionClass, Class<E> elementClass)
            throws IllegalArgumentException {
        if (null == object) {
            return null;
        }
        try {
            CollectionType type = mapper.getTypeFactory().constructCollectionType(collectionClass, elementClass);
            return mapper.convertValue(object, type);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /**
     * OBJECT 转换为 byte[]
     *
     * @param obj
     * @return
     */
    public static byte[] toBytes(Object obj) {
        try {
            return mapper.writeValueAsBytes(obj);
        } catch (JsonProcessingException e) {
            logger.error("write to json string error:" + obj, e);
            return null;
        }
    }

    /**
     * 字节数字转为为OBJECT
     *
     * @param bytes
     * @param clazz
     * @return T
     */
    public static <T> T fromBytes(byte[] bytes, Class<T> clazz) {
        if (null == bytes || bytes.length == 0) {
            return null;
        }
        try {
            return mapper.readValue(bytes, clazz);
        } catch (IOException e) {
            logger.error("parse json byte error:" + bytes, e);
            return null;
        }
    }
}
