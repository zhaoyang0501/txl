package com.pzy.action;

import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.pzy.entity.Grades;
import com.pzy.entity.News;
import com.pzy.entity.Notice;
import com.pzy.service.GradesService;
import com.pzy.service.NewsService;
import com.pzy.service.NoticeService;

@ParentPackage("struts-default")  
@Namespace("/")
public class IndexAction extends ActionSupport{
	private Grades grades;
	private List<News> newss;
	private List<Grades> gradess;
	@Autowired
	private GradesService gradesService;
	@Autowired
	private NewsService newsService;
	public String execute() throws Exception {
		newss=newsService.findTop3();
		gradess=gradesService.findTop4();
		return SUCCESS;
	}
	@Action(value = "apply", results = { @Result(name = "success", location = "/WEB-INF/views/apply.jsp") })
	public String apply() throws Exception {
		return SUCCESS;
	}
	@Action(value = "login", results = { @Result(name = "success", location = "/WEB-INF/views/apply.jsp") })
	public String apply() throws Exception {
		return SUCCESS;
	}
	@Action(value = "goapply", results = { @Result(name = "success", location = "/WEB-INF/views/index.jsp") })
	public String goapply() throws Exception {
		grades.setCreateDate(new Date());
		grades.setState("未审核");
		gradesService.save(grades);
		return SUCCESS;
	}
	
	public Grades getGrades() {
		return grades;
	}
	public void setGrades(Grades grades) {
		this.grades = grades;
	}
	public List<News> getNewss() {
		return newss;
	}
	public void setNewss(List<News> newss) {
		this.newss = newss;
	}
	public List<Grades> getGradess() {
		return gradess;
	}
	public void setGradess(List<Grades> gradess) {
		this.gradess = gradess;
	}
}
