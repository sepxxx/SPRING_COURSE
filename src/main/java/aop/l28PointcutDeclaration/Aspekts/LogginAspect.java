package aop.l28PointcutDeclaration.Aspekts;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

    @Pointcut("execution(public void get*())")
    private void allGetMethods(){};
    @Before("allGetMethods()")
    public void beforeGetLogginAdvice() {
        System.out.println("beforeGetLogginAdvice: попытка получить что-либо из библиотеки");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка прав доступа");
    }

}
