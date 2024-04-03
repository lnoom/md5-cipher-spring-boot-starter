package com.yu.config;

import com.yu.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MD5AutoConfiguration {
    @Bean
    public MD5Service md5Service() {
        return new MD5Service();
    }

}
