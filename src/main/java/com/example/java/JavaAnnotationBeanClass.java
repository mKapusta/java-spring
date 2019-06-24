package com.example.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Cette classe est un POJO Java
 * Il sera à transformer en Bean Spring via des annotations Spring
 * Ses propriétés devront être valorisées pour que le test fonctionne
 * Est concerné par le test ComponentJavaTestClass
 */
@Component
public class JavaAnnotationBeanClass {


    private JavaBeanClass javaBeanClass;
    private UpperJavaBeanClass upperJavaBeanClass;

    public JavaAnnotationBeanClass(@Autowired JavaBeanClass monBean2,@Autowired UpperJavaBeanClass upperJavaBeanClass) {
        this.javaBeanClass = monBean2;
        this.upperJavaBeanClass = upperJavaBeanClass;
    }

    public JavaBeanClass getJavaBeanClass() {
        return javaBeanClass;
    }

    public void setJavaBeanClass(JavaBeanClass javaBeanClass) {
        this.javaBeanClass = javaBeanClass;
    }

    public UpperJavaBeanClass getUpperJavaBeanClass() {
        return upperJavaBeanClass;
    }

    public void setUpperJavaBeanClass(UpperJavaBeanClass upperJavaBeanClass) {
        this.upperJavaBeanClass = upperJavaBeanClass;
    }
}
