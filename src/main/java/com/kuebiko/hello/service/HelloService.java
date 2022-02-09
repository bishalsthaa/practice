package com.kuebiko.hello.service;

import com.kuebiko.hello.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements HelloServiceInterface {
    @Autowired
    HelloDao dao;

    @Override
    public String save(String input) {
        String temp = reverse(input);
        return temp;
    }

    @Override
    public String get(Long data) {
        return dao.getFromRepo(data);
    }

    private String reverse(String data) {
        String reverseString = new StringBuilder(data).reverse().toString();
        return reverseString;
    }

}
