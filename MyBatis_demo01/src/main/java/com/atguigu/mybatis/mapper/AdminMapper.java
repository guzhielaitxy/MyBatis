package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Admin;

import java.util.List;

/**
 * @author txy
 * @create 2022-06-21 15:56
 */
public interface AdminMapper {
    /*
     * MyBatis面向接口编程的两个一致：
     * 1. 映射文件的namespace要和mapper接口的全类名保持一致
     * 2. 映射文件中的SQL语句的id要和mapper接口中方法名一致
     *
     * 表 -- 实体类 -- mapper接口 -- 映射文件     *
     */


    /**
     * 添加用户
     */
    int insertAdmin();

    /**
     * 更新用户
     *
     * @return
     */
    int updateAdmin();

    /**
     * 删除用户
     *
     * @return
     */
    int deleteAdmin();

    /**
     * 查询一个
     * @return
     */
    Admin selectAdmin();

    /**
     * 查询全部
     * @return
     */
    List<Admin> selectAll();
}
