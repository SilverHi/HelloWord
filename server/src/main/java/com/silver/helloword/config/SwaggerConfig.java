package com.silver.helloword.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Description TODO
 * @Author Tsui
 * @Date 2021/4/15 15:17
 * @Version 1.0
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket getUserDocket(){
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("快乐背单词")//api标题
                .description("快乐背单词相关接口描述")//api描述
                .version("1.0.0")//版本号
                .contact("sabre")//本API负责人的联系信息
                .build();
        return new Docket(DocumentationType.SWAGGER_2)//文档类型（swagger2）
                .apiInfo(apiInfo)//设置包含在json ResourceListing响应中的api元信息
                .select()//启动用于api选择的构建器
                .apis(RequestHandlerSelectors.basePackage("com.silver.helloword"))//扫描接口的包
                .paths(PathSelectors.any())//路径过滤器（扫描所有路径）
                .build();
    }

}