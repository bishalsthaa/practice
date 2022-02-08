package com.kuebiko.hello.repo;

import com.kuebiko.hello.dto.HelloDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepo extends JpaRepository <HelloDto, Long> {
}
