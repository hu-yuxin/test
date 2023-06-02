package com.cooper.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.cooper.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
