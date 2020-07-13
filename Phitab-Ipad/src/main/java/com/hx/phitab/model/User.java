package com.hx.phitab.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.annotation.Unique;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

/**
 * @Date 2019-09-24 22:29:46
 * @author hx
 */
@Table(name = "user")
public class User extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@Column(comment="名称", isNull=false, length = 64, type = MySqlTypeConstant.VARCHAR)
	private String name;

	@Unique
	@Column(comment="账号", isNull=false, length = 64, type = MySqlTypeConstant.VARCHAR)
	private String account;

	@Column(comment="备注", length = 64, type = MySqlTypeConstant.VARCHAR)
	private String remark;

	public User()
	{

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
