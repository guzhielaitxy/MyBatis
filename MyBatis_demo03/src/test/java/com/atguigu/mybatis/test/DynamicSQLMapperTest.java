package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Admin;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author txy
 * @create 2022-06-29 16:42
 */
public class DynamicSQLMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Admin> admin = mapper.getAdminByConditions(new Admin(null, "楚留香", '男', null, null, null, null));
        System.out.println("admin = " + admin);

    }
}
