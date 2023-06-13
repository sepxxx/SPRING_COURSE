package aop.l29PointcutCombination;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//Урок 29 - Pointcut Combination
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLib = acac.getBean("uniLibraryBean", UniLibrary.class);
        uniLib.getBook();
        uniLib.getMagazine();
        uniLib.returnBook();
        uniLib.returnMagazine();
        uniLib.addBook();
        uniLib.addMagazine();
    }
}
