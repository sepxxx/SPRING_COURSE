package aop.l27PointcutParams;


import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends Library {
    public void getBook() {
        System.out.println("Берем книгу в SchoolLib");
    }
}
