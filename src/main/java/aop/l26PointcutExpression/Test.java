package aop.l26PointcutExpression;


//Урок 26 - Pointcut expression
//1)Создать абстрактный класс library
//2)Создать классы наследники UniLibrary SchoolLibrary
//3)сделать так чтобы Advice вызывался после вызовов getBook обоих классов

//4)сделать метод returnBook и проверить вызовется ли Advice
//5)сделать так чтобы Advice вызывался только после  getBook schoolLibrary
//6)использовать wildcard * для методов get*
//7) протестировать измененный по типу * pointcut на методе returnBook


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLib = acac.getBean("uniLibraryBean", UniLibrary.class);
//        uniLib.getBook();
        uniLib.returnBook();
//        uniLib.getMagazine();
//        SchoolLibrary schoolLib = acac.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLib.getBook();

    }
}
