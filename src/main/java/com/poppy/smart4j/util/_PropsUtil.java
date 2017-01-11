package com.poppy.smart4j.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件工具类
 * @author chenb-c
 * @date 2017/1/6
 */
public class _PropsUtil {
    private static  final Logger LOGGER= LoggerFactory.getLogger(_PropsUtil.class);

    public static Properties loadProps(String fileName){
        Properties properties = null;
        InputStream in = null;
        try {
            in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(in==null){
                throw  new FileNotFoundException(fileName+" file is not found");
            }
            properties = new Properties();
            properties.load(in);
        }catch (IOException e){
            LOGGER.error("load properties file failure",e);
        }finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failure",e);
                }
            }
        }
        return properties;
    }


    /**
     * 获取字符串属性，默认值为空
     * @param props
     * @param key
     * @return
     */
    public static  String getString(Properties props, String key) {
        return getString(props, key, "");
    }

    /**
     * 获取字符串属性，可指定默认值
     * @param props
     * @param key
     * @param defaultValue
     * @return
     */
    public static  String getString(Properties props,String key,String defaultValue){
        String value = defaultValue;
        if(props.containsKey(key)){
            value = props.getProperty(key);
        }
        return value;
    }
}
