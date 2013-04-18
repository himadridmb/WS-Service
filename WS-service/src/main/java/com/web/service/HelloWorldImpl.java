
package com.web.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.web.service.WSEI")
public class HelloWorldImpl implements HelloWorld, WsSEI, WSEI {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public int add(int x, int y) {
		return x+y;
	}
}

