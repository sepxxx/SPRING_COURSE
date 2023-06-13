package aop.l26PointCutExpression;


import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends Library{
    @Override
    public void getBook() {
        System.out.println("Берем книгу в SchoolLib");
    }
}
