package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Урок 21 - Конфигурация с помощью Java code
//1)Создать класс MyConfig, указав пакет
//2)создать в тесте context и от него получить person
public class TestConfigJavaCode {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = acac.getBean("person", Person.class);
        System.out.println(person);
    }
}
