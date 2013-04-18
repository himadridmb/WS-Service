package com.web.service;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    int add(int x, int y);
}

