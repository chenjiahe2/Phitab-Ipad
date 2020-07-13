package com.hx.phitab.dao.mapper;

import com.hx.mybatisTool.SqlParam;
import com.hx.phitab.model.User;

import java.util.List;

public interface UserMapper {
	/**新增，返回主键*/
    int insert(User sysUser);
    /**查询，返回数组没有大数据的*/
    List<User> selectList(SqlParam sqlParam);
    /**查询，返回实体类没有大数据的*/
    User selectOne(SqlParam sqlParam);
    /**查询，返回实体类没有大数据的*/
    User selectOneByKey(Object object);
}