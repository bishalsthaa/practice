package com.kuebiko.hello.dao;

import com.kuebiko.hello.dto.HelloDto;
import com.kuebiko.hello.repo.HelloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloDao {

    @Autowired
    HelloRepo repo;

    public String saveMessage(String input) {
        HelloDto dto = new HelloDto();
        dto.setMessage(input);
        repo.save(dto);
        return dto.getMessage();
    }

    public String getFromRepo(Long id){
        HelloDto response = repo.getById(id);
        return response.getMessage();
    }
}
