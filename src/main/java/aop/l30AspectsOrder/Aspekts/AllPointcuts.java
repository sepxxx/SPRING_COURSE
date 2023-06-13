package aop.l30AspectsOrder.Aspekts;

import org.aspectj.lang.annotation.Pointcut;

public class AllPointcuts {
    @Pointcut("execution(* get*(..))")
    public void allGetMethods(){}
    @Pointcut("execution(* return*(..))")
    public void allReturnMethods(){}

    @Pointcut("allGetMethods() || allReturnMethods()")
    public void allGetAndReturnMethods(){}

}
