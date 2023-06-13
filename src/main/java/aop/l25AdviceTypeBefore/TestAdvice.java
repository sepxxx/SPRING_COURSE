package aop.l25AdviceTypeBefore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Урок 25 - Advice type @Before
//1)создать класс library с методом getBook
//2)создать класс  MyConfig для IoC и AOP, EnableAspectJAutoProxy добавив аннотацию
//3)создать Aspect класс LoggingAspect
//4)создать метод beforeGetBookAdvice - содержит сквозную логику
//5)перед методом указать тип Advice - Before("execution()") - называется pointcut -  где должен вызываться Advice
public class TestAdvice {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        Library lib = acac.getBean("libraryBean", Library.class);
        lib.getBook();
        acac.close();
    }

}
