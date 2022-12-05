package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author txy
 * @create 2022-06-27 14:25
 */
public interface SqlMapper {

    List<Admin> getAdminByLike(@Param("name") String name);

    int deleteAdmin(@Param("ids") String ids);

    void insert (@Param("admin") Admin admin);
}
