package aop.l27PointcutParams;


import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends Library {
    public void getBook(Book b) {
        System.out.println("Берем книгу в UniLib "+b.getId());
    }

    public void getMagazine() {
        System.out.println("Берем журнал в UniLib");
    }

    public String returnBook() {
        System.out.println("Возвращаем книгу в UniLib");
        return "OK";
    }

}
