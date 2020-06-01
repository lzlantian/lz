package com.lz.demo.dao;

import java.util.List;

import com.lz.demo.entity.UserVO;

public interface UserDao
{
    List<UserVO> queryUser();
}
