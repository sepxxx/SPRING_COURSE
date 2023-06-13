package aop.l27PointcutParams.Aspekts;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {
    @Before("execution(public void get*(aop.l27PointcutParams.Book))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить что-либо из библиотеки");
    }

    @Before("execution(void return*())")
    public void beforeReturnSmthAdvice() {
        System.out.println("beforeReturnSmthAdvice: попытка вернуть что-либо в библиотеку");
    }
}
