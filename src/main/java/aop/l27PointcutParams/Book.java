package aop.l27PointcutParams;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("1")
    private int id;

    public int getId() {
        return id;
    }
}
