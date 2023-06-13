package aop.l27PointcutParams;


//Урок 27 - Pointcut expression
//1)изменить метод getbook добавив параметр типа string
//2) в pointcut добавить wildcard для методов c любым названием с 1 параметром
//3) в pointcut добавить wildcard для методов с любым названием с любым колвом параметров
//4) создать класс book, добавить в параметры getBook и изменить pointcut под объекты класса Book

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLib = acac.getBean("uniLibraryBean", UniLibrary.class);
        Book b = acac.getBean("bookBean", Book.class);
        uniLib.getBook(b);
    }
}
