package aop.l31JoinPoint.Aspekts;

import org.aspectj.lang.annotation.Pointcut;

public class AllPointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods(){}



//    @Pointcut("execution(* return*(..))")
//    public void allReturnMethods(){}
//
//    @Pointcut("allGetMethods() || allReturnMethods()")
//    public void allGetAndReturnMethods(){}

}
