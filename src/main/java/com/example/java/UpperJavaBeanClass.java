package com.example.java;


/**
 * Cette classe est un POJO Java
 * Il sera à transformer en Bean Spring via des une classe de configuration Java
 * Ses propriétés devront être valorisées pour que le test fonctionne
 * Est concerné par les tests ComponentJavaTestClass et MainJavaTestClass
 */
public class UpperJavaBeanClass {
    private int upperValue;
    private JavaBeanClass javaBeanClass;

    public int getUpperValue() {
        return upperValue;
    }

    public void setUpperValue(int upperValue) {
        this.upperValue = upperValue;
    }

    public JavaBeanClass getJavaBeanClass() {
        return javaBeanClass;
    }

    public void setJavaBeanClass(JavaBeanClass javaBeanClass) {
        this.javaBeanClass = javaBeanClass;
    }
}
