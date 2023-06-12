package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Урок 21 - Конфигурация с помощью Java code
//1)Создать класс MyConfig, указав пакет
//2)создать в тесте context и от него получить person

//Урок 22 - Конфигурация с помощью Java code без скнирования классов
//те не нужно писать аннотации компонент
//все бины и DI описываются внутри класса
public class TestConfigJavaCode {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfigNoScan.class);
        Person person = acac.getBean("personBean", Person.class);
//        person.callYourPet();
        System.out.println(person);
    }
}
