package org.example.spring_introduction;


import org.springframework.context.support.ClassPathXmlApplicationContext;

//Урок 14 Configuration with Annotations
//1)создать файл новый context
//2)получить бин Pet

//Урок 15 Autowired для конструкторов
//1)Добавить аннотации component и autowired для person и его конструктора
//2)Получить объект класса person и вызвать метод callYourPet

//Урок 16 - Аннотация @Autowired для сеттера

//Урок 19 - Аннотация @Value
//1)добавить property-paceholder в xml
//2)добавить аннотации @value к поляк класса person



public class TestConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
//        Pet p = context.getBean("cat", Pet.class);
//        p.say();

//        Person person = context.getBean("person", Person.class);
//        person.callYourPet();

        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        context.close();
    }
}
