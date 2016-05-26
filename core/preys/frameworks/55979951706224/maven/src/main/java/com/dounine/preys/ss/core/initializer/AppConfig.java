package com.dounine.preys.ss.core.initializer;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.dounine.preys.ss.dao","com.dounine.preys.ss.service"})
public class AppConfig {

}
