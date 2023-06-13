package org.example.spring_introduction;


import org.springframework.context.support.ClassPathXmlApplicationContext;

//Урок 8 DI
//1)для начала создать класс person с зависимостью pet и методом callYourPet
//2)в тесте создать person, pet и вызвать метод
//3)сделать то же с IOC
//4)отредактировать xml и сделать то же с DI
//Урок 9 DI
//1)добавить age и name поля в person
//2)с помощью DI проинициализировать их
//Урок 10 DI файл properties
//создать файл properties

public class TestDependecyInjection {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = context.getBean(Person.class);
        System.out.println(p);
        context.close();
    }

}
