package com.web.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "WsSEI", targetNamespace = "http://service.web.com/")
public interface WsSEI {

	@WebMethod(operationName = "sayHi", action = "urn:SayHi")
	public String sayHi(String text);
	@WebMethod(operationName = "add", action = "urn:Add")
	public int add(int x,int y);
}