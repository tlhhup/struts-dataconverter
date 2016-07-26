package com.conver.action;

import com.conver.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = 1L;

	private User user;

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	public String regist() {
		System.out.println(user);
		return "main";
	}

}
