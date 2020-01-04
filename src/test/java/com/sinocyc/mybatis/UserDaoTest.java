package com.sinocyc.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.sinocyc.mybatis.dao.UserDao;
import com.sinocyc.mybatis.dao.UserDaoImpl;
import com.sinocyc.mybatis.po.User;

public class UserDaoTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception {
        String mybatisConfig = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(mybatisConfig);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test() {
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}
