package com.sinocyc.mybatis.dao;

import com.sinocyc.mybatis.po.User;

public interface UserDao {
    User findUserById(int id);
}
