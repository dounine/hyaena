package com.dounine.hyaena.core.initializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.dounine.hyaena.core.adapter","com.dounine.hyaena.core.processor","com.dounine.hyaena.dao","com.dounine.hyaena.service"})
public class AppConfig {

}
