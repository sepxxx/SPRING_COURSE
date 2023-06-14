package aop.l32AfterReturning;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

//Урок 32 - Advice type @AfterReturning
//1)создать класс Student, University с методом addStudents
//2)создать аспект логгирования связынный с добавлением студентов
//3)использовать как Before так и AfterReturn
//4)С помошью afterReturn изменить возвращаемое значение addStudents
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        University uni = acac.getBean("university", University.class);
        List<Student> studentList = uni.addStudents();
        System.out.println(studentList);
    }
}
