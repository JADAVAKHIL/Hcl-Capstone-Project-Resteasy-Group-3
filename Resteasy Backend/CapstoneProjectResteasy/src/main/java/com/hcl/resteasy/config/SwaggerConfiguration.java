package com.hcl.resteasy.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
public class SwaggerConfiguration {
	@Bean
	public Docket restaurantAPI() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("RestEasy_API").
				select().apis(RequestHandlerSelectors.basePackage("com.hcl.resteasy.controller")).build();
	}

}
