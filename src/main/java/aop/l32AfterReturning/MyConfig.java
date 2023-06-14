package aop.l32AfterReturning;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("aop.l32AfterReturning")
@EnableAspectJAutoProxy
public class MyConfig {
}
