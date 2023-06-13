package aop.l30AspectsOrder.Aspekts;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class ExceptionsHandlingAspect {
    @Before("aop.l30AspectsOrder.Aspekts.AllPointcuts.allGetMethods()")
    public void beforeAllGetMethods() {
        System.out.println("Выполняется проверка исключений");
    }
}
