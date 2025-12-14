package com.example.Inventory.Service.Port._1;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Absolute path use kar rahe hain
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:/Users/rahulkumar/Desktop/microServices/Inventory-Service-Port-8081/pic/");
    }
}