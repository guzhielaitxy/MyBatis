package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SqlMapper;
import com.atguigu.mybatis.pojo.Admin;
import com.atguigu.mybatis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author txy
 * @create 2022-06-27 14:26
 */
public class SqlMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<Admin> admins = mapper.getAdminByLike("京");
        System.out.println("admins = " + admins);
    }

    @Test
    public void testdeleteMore() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        int i = mapper.deleteAdmin("1,2,162");
        System.out.println("i = " + i);
    }
    @Test
    public void testinsert() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        Admin admin = new Admin(null, "白玉京", '男', "abc123", "长生剑@qq.com", "123123", "江湖");
        mapper.insert(admin);
        System.out.println("admin = " + admin);
    }
}
