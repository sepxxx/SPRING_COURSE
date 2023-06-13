package aop.l29PointcutCombination;
import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends Library {
    public void getBook() {
        System.out.println("Берем книгу в UniLib ");
    }
    public void getMagazine() {
        System.out.println("Берем журнал в UniLib");
    }

    public void returnBook() {
        System.out.println("Возвращаем книгу в UniLib");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в UniLib");
    }

    public void addBook() {
        System.out.println("Добавляем книгу в UniLib");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в UniLib");
    }

}
