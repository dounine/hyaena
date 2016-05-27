package com.dounine.preys.ss.core.initializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.dounine.preys.ss.web",useDefaultFilters = false,includeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,value= Controller.class)})
public class MvcConfig extends WebMvcConfigurerAdapter {

}
