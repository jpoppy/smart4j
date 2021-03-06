package com.poppy.smart4j.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 *
 * @author chenb-c
 * @date 2017/1/11
 */
public class _StringUtil {

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
