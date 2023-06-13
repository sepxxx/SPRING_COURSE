package aop.l31JoinPoint.Aspekts;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class SecurityAspect {
    @Before("aop.l31JoinPoint.Aspekts.AllPointcuts.allAddMethods()")
    public void beforeAllAddMethods() {
        System.out.println("Выполняется проверка прав пользователя");
    }
}
