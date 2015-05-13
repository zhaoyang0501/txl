package com.pzy.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.pzy.entity.User;
import com.pzy.entity.*;
import com.pzy.service.UserService;

@Namespace("/")
@ParentPackage("json-default") 
public class CenterAction extends PageAction {
	private User user;
	private String tip;
	@Autowired
	private UserService userService;
	/***
	 * 
	 * @return
	 */
	@Action(value = "doCenter", results = { @Result(name = "success", location = "center.jsp") })
	public String doCenter(){
		user.setGrades((Grades)ActionContext.getContext().getSession().get("grades"));
		userService.save(user);
		ActionContext.getContext().getSession().put("user", user);
		tip="用户信息修改成功";
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
}
