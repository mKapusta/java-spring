package com.example.java;

/**
 * Cette classe est un POJO Java
 * Il sera à transformer en Bean Spring via de la configuration Java.
 * Est concerné par les tests ComponentJavaTestClass et MainJavaTestClass
 */
public class JavaBeanClass {

    /**
     * Valeur à intialiser correctement pour faire passer les tests
     */
    private int randomValue;

    public int getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(int randomValue) {
        this.randomValue = randomValue;
    }
}
