package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.AdminMapper;
import com.atguigu.mybatis.pojo.Admin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author txy
 * @create 2022-06-21 16:39
 */
public class AdminTest {
    @Test
    public void testMybatis() throws IOException {
//      加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//      获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//      获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//      获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//      获取mapper接口对象
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
//      测试功能
        int i = mapper.insertAdmin();
//      提交事务
//        sqlSession.commit();
        System.out.println("i = " + i);
    }

    @Test
    public void testUpdate() throws IOException {
        InputStream resources = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(resources).openSession(true);
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        int i = mapper.updateAdmin();
        System.out.println("i = " + i);

    }

    @Test
    public void testDelete() throws IOException {
        InputStream resources = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(resources).openSession(true);
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        int i = mapper.deleteAdmin();
        System.out.println("i = " + i);

    }

    @Test
    public void testSelectAdmin() throws IOException {
        InputStream resources = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(resources).openSession(true);
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        Admin admin = mapper.selectAdmin();
        System.out.println("admin = " + admin);
    }  @Test
    public void testSelectAll() throws IOException {
        InputStream resources = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(resources).openSession(true);
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        List<Admin> admins = mapper.selectAll();
        admins.forEach(admin -> System.out.println("admin = " + admin));
    }
}
