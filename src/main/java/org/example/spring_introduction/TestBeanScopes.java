package org.example.spring_introduction;


//Singletone - default scope
//1)бин создается сразу послепрочтения контейнером context файла
//2)бин является общим для всех, кто его запросит у контейнера
//3)соотв-но подходит для stateless объектов

//Prototype
//1)бин создается только после вызова метода getBean
//2)бин является уникальным
//3)подходит для statefull объектов
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Урок 12 BeanScope
//1)Скопировать и изменить context file, оставив только pet
//2)запросить 2 пета, сравнить адреса


public class TestBeanScopes {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext2.xml");

        Pet p1 = context.getBean(Pet.class);
        Pet p2 = context.getBean(Pet.class);
        System.out.println(p1==p2);
        context.close();
    }
}
