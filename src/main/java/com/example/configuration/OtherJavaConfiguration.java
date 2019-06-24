package com.example.configuration;

import com.example.java.JavaBeanClass;
import com.example.java.UpperJavaBeanClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherJavaConfiguration {

    @Bean
    public UpperJavaBeanClass randomUpper(@Autowired JavaBeanClass monBean2) {
        UpperJavaBeanClass upperJavaBeanClass = new UpperJavaBeanClass();
        upperJavaBeanClass.setJavaBeanClass(monBean2);
        return upperJavaBeanClass;
    }

}
