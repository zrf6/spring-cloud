package com.wn.config;

import com.wn.filter.LoginFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    @Bean
    public LoginFilter loginFilter(){
        return new LoginFilter();
    }
}
