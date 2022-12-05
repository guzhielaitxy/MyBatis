package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author txy
 * @create 2022-06-24 14:45
 */
public interface ParameterMapper {

    List<Admin> getAll();


    /**
     * 通过id获取对象
     *
     * @return
     */
    Admin getAdminByUsername(String username);


    Admin checkLogin(String name, String password);

    Admin checkLoginByParameter(@Param("name") String name, @Param("password") String password);

    Admin checkLoginByMap(Map map);

    void insertAdmin(Admin admin);
}
