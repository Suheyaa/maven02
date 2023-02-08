package com.javen.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javen.model.Login;
import com.javen.service.ILoginService;

@Controller  //返回指定页面
@RequestMapping("/login") 
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Login> findAll(){
        List<Login> logins = loginService.selectAll();
        System.out.println(logins.toString());
        return logins;
    }


}  









