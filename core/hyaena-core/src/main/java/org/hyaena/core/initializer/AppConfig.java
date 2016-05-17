package org.hyaena.core.initializer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.hyaena.core.adapter","org.hyaena.core.processor","org.hyaena.dao","org.hyaena.service"})
public class AppConfig {

}
