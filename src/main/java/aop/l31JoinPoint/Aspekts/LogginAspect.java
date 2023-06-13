package aop.l31JoinPoint.Aspekts;

import aop.l31JoinPoint.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(30)
public class LogginAspect {

    @Before("aop.l31JoinPoint.Aspekts.AllPointcuts.allAddMethods()")
    public void beforeAllAddMethods(JoinPoint jp) {
        System.out.println("Выполняется запись лога");
        MethodSignature ms = (MethodSignature)jp.getSignature();
        System.out.println("Jointpoint.getSignature(): " + ms);

        if(ms.getName().equals("addBook")) {
            Object [] objects = jp.getArgs();
            for (Object obj:objects) {
                if(obj instanceof Book) {
                    Book b = (Book) obj;
                    System.out.println("Book id: "+b.getId()+" yop: "+b.getYop());
                } else if(obj instanceof String) {
                    System.out.println("Имя добавляющего: "+ (String)obj);
                }
            }
        }
    }

//    @Before("allReturnMethods()")
//    public void beforeAllReturnMethods() {
//        System.out.println("Выполняется запись лога #2");
//    }
//
//    @Before("allGetAndReturnMethods()")
//    public void beforeAllGetAndReturnMethods() {
//        System.out.println("Выполняется запись лога #3");
//    }
}
