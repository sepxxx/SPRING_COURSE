package aop.Aspects;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить что-либо из библиотеки");
    }

    @Before("execution(* return*())")
    public void beforeReturnSmthAdvice() {
        System.out.println("beforeReturnSmthAdvice: попытка вернуть что-либо в библиотеку");
    }
}
