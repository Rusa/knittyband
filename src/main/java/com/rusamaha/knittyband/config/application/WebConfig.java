package com.rusamaha.knittyband.config.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by rusamaha on 4/6/17.
 */
@Configuration
@EnableWebMvc
@EnableSpringDataWebSupport //// TODO: 4/9/17 FOR WHAT IS USEFUL?
@ComponentScan({"com.rusamaha.knittyband.*"})
public class WebConfig extends WebMvcConfigurerAdapter{


    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setContentType("text/html; charset=utf-8");
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/views/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/views/js/");
        registry.addResourceHandler("/lib/**").addResourceLocations("/WEB-INF/views/lib/");
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/views/images/");
        registry.addResourceHandler("/imgProduct/**").addResourceLocations("/WEB-INF/views/imgProduct/"); ////FIXME: delete it
        registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/views/resources/");
    }
}
