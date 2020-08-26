package com.github.hardelele;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    @Bean
    public void method() {
        System.out.println("method");
    }
}
