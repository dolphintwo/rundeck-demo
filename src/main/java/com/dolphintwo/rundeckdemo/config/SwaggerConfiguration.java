package com.dolphintwo.rundeckdemo.config;

import static springfox.documentation.builders.PathSelectors.regex;


import com.google.common.base.Predicate;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Created by dd on 2018/8/21 15:23
 */

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("rundeck-demo-api")
                .apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any()).paths(postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return (regex("/.*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("RUNDECK DEMO API")
                .description("RUNDECK DEMO API reference for developers")
                .termsOfServiceUrl("http://localhost:8070")
                .contact("dtdinghui@126.com")//contact url
                .license("No License")
                .licenseUrl("dtdinghui@126.com")
                .version("1.0").build();
    }
}
