package aop.l28PointcutDeclaration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//Урок 28 - Pointcut Declaration
//1)прописать get,return,add методы для magazine, book
//2)для методов get и return написать pointcut, потом общий


public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLib = acac.getBean("uniLibraryBean", UniLibrary.class);
        uniLib.getBook();
        uniLib.getMagazine();
    }
}
