package aop.l30AspectsOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//Урок 30 - Порядок выполнения Aspect-ов
//1)Вынести Pointcut и Aspect в отдельные классы
//2)Создать Aspect ExceptionsHandling
//3)аннотацией Order задать порядок
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLib = acac.getBean("uniLibraryBean", UniLibrary.class);
        uniLib.getBook();
        uniLib.getMagazine();
    }
}

