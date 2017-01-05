package com.poppy.smart4j.service;

import com.poppy.smart4j.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 * @author henb-c
 * @date2017/1/5.
 */
public class CustomerService {
    /**
     * 获取客户列表
     * @param key
     * @return
     */
    public List<Customer> getCustomerList(String key){
        //TODO
        return  null;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id){
        //TODO
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        //TODO
        return  false;
    }
}
