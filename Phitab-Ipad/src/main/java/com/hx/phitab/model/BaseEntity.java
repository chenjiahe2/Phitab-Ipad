package com.hx.phitab.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import com.hx.phitab.common.Constants;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类
 */
public class BaseEntity implements Serializable {

    @Column(type = MySqlTypeConstant.VARCHAR,length=64,isKey=true,comment="标识",isNull=false)
    private String id;

    @Column(comment="是否删除",isNull = false, length = 2, type = MySqlTypeConstant.TINYINT)
    private Integer isDel = Constants.NO;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @Column(comment="创建时间",type = MySqlTypeConstant.DATETIME, isNull = false)
    private Date createTime = new Date();

    public BaseEntity()
    {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
