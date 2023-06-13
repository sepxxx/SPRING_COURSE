package aop.l31JoinPoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("1")
    private int id;
    @Value("1866")
    private int yop;

    public int getId() {
        return id;
    }

    public int getYop() {
        return yop;
    }
}
