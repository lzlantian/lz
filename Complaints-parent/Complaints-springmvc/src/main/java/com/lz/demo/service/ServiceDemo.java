package com.lz.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lz.demo.dao.UserDao;
import com.lz.demo.entity.UserVO;

@Component
public class ServiceDemo
{
    @Autowired
    private UserDao userDao;
    
    public List<UserVO> queryUser()
    {
        return userDao.queryUser();
    }
    
}
