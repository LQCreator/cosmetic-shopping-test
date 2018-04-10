package com.maxiao.cosmetic.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CopyUtil {
    /**
     * bean转为另一个bean
     *
     * @param source
     * @param targetClass
     * @param <T>
     * @return
     */
    public static <T> T transfer(Object source, Class<T> targetClass) {
        if (source == null) {
            return null;
        }
        try {
            T t = targetClass.newInstance();
            BeanUtils.copyProperties(source, t);
            return t;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 泛型为一种bean的list转为另一种泛型bean的list
     *
     * @param sourceList
     * @param targetClass
     * @param <T>
     * @return
     */
    public static <T> List<T> transferList(List<?> sourceList, Class<T> targetClass) {
        if (CollectionUtils.isEmpty(sourceList)) {
            return new ArrayList<T>();
        }
        return sourceList.stream().map((source) -> transfer(source, targetClass)).collect(Collectors.toList());
    }

    /**
     * map转换为bean
     *
     * @param map
     * @param targetClass
     * @param <T>
     * @return
     */
    public static <T> T mapTransferBean(Map map, Class<T> targetClass) {
        if (map == null) {
            return null;
        }
        try {
            T t = targetClass.newInstance();
            org.apache.commons.beanutils.BeanUtils.populate(t, map);
            return t;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }

    }
}

