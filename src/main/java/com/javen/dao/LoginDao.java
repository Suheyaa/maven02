package com.javen.dao;

import com.javen.model.Login;


import java.util.List;

public interface LoginDao {
    List<Login> selectAll();
}
