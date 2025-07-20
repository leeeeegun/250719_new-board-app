package com.codingrecipe.new_board_app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // view 에서 사용할 경로
    private String resourcePath = "/upload/**";

    // 실제 저장을 사용할 경로
    private String savePath = "file:///C:/development/intellij_community/spring_upload_files/";

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(resourcePath)
                .addResourceLocations(savePath);
    }
}