package aop.l30AspectsOrder.Aspekts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(30)
public class LogginAspect {

    @Before("aop.l30AspectsOrder.Aspekts.AllPointcuts.allGetMethods()")
    public void beforeAllGetMethods() {
        System.out.println("Выполняется запись лога");
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
