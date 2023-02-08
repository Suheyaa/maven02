package com.javen.service;

import java.util.List;

import com.javen.model.Login;

import javax.servlet.http.HttpServletRequest;


public interface ILoginService {
    List<Login> selectAll();
}
