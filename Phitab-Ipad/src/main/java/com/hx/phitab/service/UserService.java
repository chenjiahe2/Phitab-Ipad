package com.hx.phitab.service;

import com.hx.mybatisTool.SqlParam;
import com.hx.phitab.model.User;

import java.util.List;

public interface UserService {

    List<User> selectList(SqlParam sqlParam);

    User selectOne(SqlParam sqlParam);

    User selectOneByKey(Object object);

	void add(User sysUser);
    

}
