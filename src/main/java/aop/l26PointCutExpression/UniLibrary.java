package aop.l26PointCutExpression;


import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends Library{
    @Override
    public void getBook() {
        System.out.println("Берем книгу в UniLib");
    }

    public void getMagazine() {
        System.out.println("Берем журнал в UniLib");
    }

    public String returnBook() {
        System.out.println("Возвращаем книгу в UniLib");
        return "OK";
    }

}
