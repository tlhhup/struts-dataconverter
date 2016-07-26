package com.conver.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class RightInterceptor implements Interceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	/**
	 * 逻辑视图名
	 */
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		System.out.println("RightInterceptor");
		//Action的代理对象
		ActionProxy proxy = actionInvocation.getProxy();
		//获取namespace
		String namespace = proxy.getNamespace();
		if("/".equals(namespace)||isValidate(namespace)){
			namespace="";
		}
		//获取actionname
		String actionName = proxy.getActionName();
		String url=namespace+"/"+actionName;
		//查询数据库--->某个用户是否具有该权限
		ServletActionContext.getRequest().getSession();
		if("/UserAction_regist".equals(url)){
			return "noRight";
		}
		return actionInvocation.invoke();
	}

	private boolean isValidate(String str){
		if(str==null||"".equals(str)){
			return false;
		}
		return true;
	}
	
}
