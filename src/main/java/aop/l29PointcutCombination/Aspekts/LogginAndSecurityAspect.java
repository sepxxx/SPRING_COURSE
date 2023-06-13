package aop.l29PointcutCombination.Aspekts;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAndSecurityAspect {

    @Pointcut("execution(* get*(..))")
    private void allGetMethods(){}
    @Pointcut("execution(* return*(..))")
    private void allReturnMethods(){}

    @Pointcut("allGetMethods() || allReturnMethods()")
    private void allGetAndReturnMethods(){}



    @Before("allGetMethods()")
    public void beforeAllGetMethods() {
        System.out.println("Выполняется запись лога #1");
    }

    @Before("allReturnMethods()")
    public void beforeAllReturnMethods() {
        System.out.println("Выполняется запись лога #2");
    }

    @Before("allGetAndReturnMethods()")
    public void beforeAllGetAndReturnMethods() {
        System.out.println("Выполняется запись лога #3");
    }
}
