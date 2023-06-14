package aop.l32AfterReturning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {

    List<Student> studentList = new ArrayList<>();
    public List<Student> addStudents() {
        Student s1 = new Student(18, 7, "A");
        Student s2 = new Student(19,8 , "B");
        Student s3 = new Student(20, 9, "C");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println(studentList);
        return studentList;
    }
}
