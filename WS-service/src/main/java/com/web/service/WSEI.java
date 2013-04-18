package com.web.service;

import javax.jws.WebService;

@WebService(name = "WSEI", targetNamespace = "http://service.web.com/")
public interface WSEI {

	public String sayHi(String text);

	public int add(int x, int y);

}