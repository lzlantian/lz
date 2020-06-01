package com.lz.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lz.demo.entity.UserVO;
import com.lz.demo.service.ServiceDemo;

@Controller
@RequestMapping(value = "/user")
public class UserController 
{
    @Autowired
    private ServiceDemo service;

    @RequestMapping(value = "/getUser" ,method=RequestMethod.GET)
    @ResponseBody
    public String getUser(){
        List<UserVO> aa=service.queryUser();
        return aa.toString();
    }
}
