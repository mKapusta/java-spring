package com.example.java;

/**
 * Cette classe est un POJO Java
 * Il sera à transformer en Bean Spring via des annotations Spring
 * Ses propriétés devront être valorisées pour que le test fonctionne
 * Est concerné par le test ComponentJavaTestClass
 */
public class JavaAnnotationBeanClass {


    private JavaBeanClass javaBeanClass;
    private UpperJavaBeanClass upperJavaBeanClass;

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
