package org.example;


import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet {

    public void say() {
        System.out.println("MEOW");
    }
}
