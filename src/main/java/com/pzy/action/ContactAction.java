package com.pzy.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.pzy.entity.Grades;
import com.pzy.entity.User;
import com.pzy.service.UserService;

@Namespace("/")
@ParentPackage("json-default") 
public class ContactAction extends PageAction {
	private List<User> users;
	private String tip;
	@Autowired
	private UserService userService;
	public String execute() throws Exception {
		Grades grades = (Grades) ServletActionContext.getRequest().getSession().getAttribute("grades");
		users=userService.findByGrades(grades);
		return SUCCESS;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
}
