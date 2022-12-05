package com.atguigu.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author txy
 * @create 2022-06-24 15:26
 */
public class SqlSessionUtils {
    public static SqlSession getSqlSession()  {
        SqlSessionFactory build;
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
            build = sqlSessionFactoryBuilder.build(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return build.openSession(true);
    }
}
