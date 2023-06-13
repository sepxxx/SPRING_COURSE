package aop.l25AdviceTypeBefore;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("Берем книгу");
    }
}
