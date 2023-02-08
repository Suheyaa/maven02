package com.javen.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javen.dao.LoginDao;
import com.javen.model.Login;
import com.javen.service.ILoginService;

@Service
public class ILoginServiceImpl implements ILoginService{

    @Autowired
    private LoginDao loginDao;

    public List<Login> selectAll() {
        List<Login> logins = loginDao.selectAll();
        return logins;
    }
}
