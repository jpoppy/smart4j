package com.poppy.smart4j.service;

import com.poppy.smart4j.helper.DataBaseHelper;
import com.poppy.smart4j.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 *
 * @author henb-c
 * @date2017/1/5.
 */
public class CustomerService {


    /**
     * 获取客户列表
     *
     * @param key
     * @return
     */
    public List<Customer> getCustomerList(String key) {
        Connection conn = DataBaseHelper.getConnection();
        String sql = "select * from customer";
        List<Customer> customers = new ArrayList<Customer>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DataBaseHelper.closeConnection(conn);
        }

        return customers;
    }

    /**
     * 获取客户
     *
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        //TODO
        return null;
    }

    /**
     * 创建客户
     *
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        //TODO
        return false;
    }

    /**
     * 更新客户
     *
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        //TODO
        return false;
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        //TODO
        return false;
    }
}
