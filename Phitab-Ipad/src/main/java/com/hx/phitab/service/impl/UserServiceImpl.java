package com.hx.phitab.service.impl;

import com.hx.exception.TipsException;
import com.hx.mybatisTool.SqlParam;
import com.hx.phitab.dao.mapper.UserMapper;
import com.hx.phitab.model.User;
import com.hx.phitab.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**查询列表，大数据类型不拿取*/
    @Override
    public List<User> selectList(SqlParam sqlParam) {
        return userMapper.selectList(sqlParam);
    }

    /**查询单个，大数据不拿取*/
    @Override
    public User selectOne(SqlParam sqlParam) {
        return userMapper.selectOne(sqlParam);
    }

    /**查询单个，大数据不拿取*/
    @Override
    public User selectOneByKey(Object object) {
        return userMapper.selectOneByKey(object);
    }

    /**新增*/
	@Override
	public void add(User sysUser) {
		Object count = userMapper.insert(sysUser);
		if(count == null) {
			throw new TipsException("新增失败！");
		}
	}
}
