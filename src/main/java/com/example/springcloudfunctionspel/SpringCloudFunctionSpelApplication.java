package com.example.springcloudfunctionspel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.MultiValueMap;
import reactor.core.publisher.Flux;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringCloudFunctionSpelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionSpelApplication.class, args);
    }

}