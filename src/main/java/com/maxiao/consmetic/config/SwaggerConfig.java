package com.maxiao.consmetic.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan("com.maxiao.consmetic")
public class SwaggerConfig {
    @Bean
    public Docket createAPI() {
        return new Docket(DocumentationType.SWAGGER_2).forCodeGeneration(true).select().apis(RequestHandlerSelectors.any())
                //过滤生成链接
                .paths(PathSelectors.any()).build();
    }
}
