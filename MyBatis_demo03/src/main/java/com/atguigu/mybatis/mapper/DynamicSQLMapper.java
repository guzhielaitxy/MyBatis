package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author txy
 * @create 2022-06-29 16:26
 */
public interface DynamicSQLMapper {

    List<Admin> getAdminByConditions(Admin admin);
}
