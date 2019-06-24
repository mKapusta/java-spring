package com.example.configuration;

import com.example.java.JavaBeanClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.java")
public class JavaConfiguration {

    @Bean
    public String javaRandomString() {
        return "test";
    }

    @Bean
    public JavaBeanClass monBean() {
        JavaBeanClass javaBeanClass = new JavaBeanClass();
        javaBeanClass.setRandomValue(2);
        return javaBeanClass;
    }

    @Bean
    public JavaBeanClass monBean2() {
        JavaBeanClass javaBeanClass = new JavaBeanClass();
        javaBeanClass.setRandomValue(3);
        return javaBeanClass;
    }

}
