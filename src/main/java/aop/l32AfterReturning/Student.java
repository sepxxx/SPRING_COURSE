package aop.l32AfterReturning;



public class Student {
    private int age;
    private int grade;
    private String name;

    public Student(int age, int grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
