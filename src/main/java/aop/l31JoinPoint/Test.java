package aop.l31JoinPoint;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Урок 31 - Join Point
//1)добавить поля name, author, yop в класс Book
//2)добавить аргументы в addBook имя добавляющего, книгу
//3)переписать аспекты и поинткаты под add
//4)в агументы аспекта логирования передать JoinPoint, внутри с помощью него получить сигнатуру метода от которого произошел вызов
//5)внутри аспекта логгирования добавить обработку информации из метода addBook
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLib = acac.getBean("uniLibraryBean", UniLibrary.class);
        Book book = acac.getBean("bookBean", Book.class);
        uniLib.getBook();
        uniLib.addBook("Nikola", book);
    }
}

