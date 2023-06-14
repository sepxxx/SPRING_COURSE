package aop.l32AfterReturning;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class LogginAspect {

    @Pointcut("execution(* addStudents())")
    public void addStudentMethodPointcut(){}

    @Before("addStudentMethodPointcut()")
    private void beforeAddStudentsLogginAdvice(){
        System.out.println("beforeAddStudentsLogginAdvice: логируем получение/формирование списка студентов перед вызовом метода addStudents");
    }

    @AfterReturning(pointcut = "addStudentMethodPointcut()", returning = "studentsList")
    private void afterAddStudentsLogginAdvice(List<Student> studentsList){
        Student s = studentsList.get(0);
        s.setName("MR. "+s.getName());
        System.out.println("afterAddStudentsLogginAdvice: логируем получение/формирование списка студентов после вызова метода addStudents");
    }
}
