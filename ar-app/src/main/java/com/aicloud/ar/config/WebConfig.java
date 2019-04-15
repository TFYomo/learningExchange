package com.aicloud.ar.config;

import com.coldwind.common.handler.GlobalExceptionHandler;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by tfyomo@qq.com on 2019-03-04 17:54
 */
@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(getClientInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**")
//                .excludePathPatterns("/error");
//        registry.addInterceptor(getJWTInterceptor()).addPathPatterns("/**")
//                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**")
//                .excludePathPatterns("/error");
//    }
//
//    @Bean
//    JWTInterceptor getJWTInterceptor(){
//        return new JWTInterceptor();
//    }
//
//    @Bean
//    ClientInterceptor getClientInterceptor(){
//        return new ClientInterceptor();
//    }
//
//    @Bean
//    ClientTokenInterceptor getClientTokenInterceptor(){
//        return new ClientTokenInterceptor();
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
