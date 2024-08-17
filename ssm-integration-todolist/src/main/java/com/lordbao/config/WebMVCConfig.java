package com.lordbao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Lord_Bao
 * @Date 2024/8/15 16:56
 * @Version 1.0
 */
@EnableWebMvc
@ComponentScan("com.lordbao.controller")
@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
}
