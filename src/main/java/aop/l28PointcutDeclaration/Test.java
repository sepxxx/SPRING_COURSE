package aop.l28PointcutDeclaration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//Урок 28 - Pointcut Declaration
//1)создать 2 Advice: BeforeGetLogginAdvice, BeforeGetSecurityAdvice
//2)создать общий pointcut
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLib = acac.getBean("uniLibraryBean", UniLibrary.class);
        uniLib.getBook();
        uniLib.getMagazine();
    }
}
