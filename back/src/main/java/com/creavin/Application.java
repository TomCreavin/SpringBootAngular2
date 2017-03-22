package com.creavin;

import com.creavin.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
    
    @Bean
    public FilterRegistrationBean jwtFilter() {
      final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
      registrationBean.setFilter(new JwtFilter());
      registrationBean.addUrlPatterns("/rest/*");
      return registrationBean;
    }
  
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}