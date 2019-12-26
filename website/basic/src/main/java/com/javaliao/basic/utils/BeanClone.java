package com.javaliao.basic.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/11 16:19
 */
public class BeanClone {

    public static <T, K> K clone(T po, Class<K> clz) {
        try {
            if (po != null) {
                K k = clz.newInstance();
                PropertyClone.copyProperties(k, po, true);
                return k;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
        return null;
    }

    public static <T, K> List<K> clone(List<T> tlist, Class<K> clz) {
        List<K> klist = new ArrayList<K>();
        if (tlist != null && tlist.size() > 0) {
            for (T t : tlist) {
                klist.add(clone(t, clz));
            }
        }
        return klist;
    }
}
