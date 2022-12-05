package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.ParameterMapper;
import com.atguigu.mybatis.pojo.Admin;
import com.atguigu.mybatis.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.lang.model.SourceVersion;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author txy
 * @create 2022-06-24 15:25
 */
public class ParameterTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<Admin> list = mapper.getAll();
        list.forEach(admin -> System.out.println("admin = " + admin));
    }

    @Test
    public void TestGetParameter() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Admin 楚留香 = mapper.getAdminByUsername("楚留香");
        System.out.println("楚留香 = " + 楚留香);
    }

    @Test
    public void testLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Admin admin = mapper.checkLogin("令狐冲", "abc123");
        System.out.println("admin = " + admin);
    }

    @Test
    public void testLoginByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "秋凤梧");
        map.put("password", "abc123");
        Admin admin = mapper.checkLoginByMap(map);
        System.out.println("admin = " + admin);
    }

    @Test
    public void testObject() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Admin admin = new Admin(null, "傅红雪", '男', "abc123", "heidao@qq.com", "1234445", "江湖");
        mapper.insertAdmin(admin);
    }

    @Test
    public void testparameter() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Admin admin = mapper.checkLoginByParameter("傅红雪", "abc123");
        System.out.println("admin = " + admin);
    }
}
