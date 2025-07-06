package com.example.FirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//if we give this it will handle the object and create
//@Scope("singleton")//small must be design patterns prototype
//@Scope("prototype")
public class Student {
    //int age;
    //@Autowired filed injection done
    //Pen p;
//      @Autowired setter injection
//    public void setP(Pen p) {
//        this.p = p;
//    }
//@Autowired constructor injection
//    public Student(Pen p) {
//        this.p = p;
//    }
    //loosely coupled using writer interface
    @Autowired
            @Qualifier("pen")
     Writer write;
    public void show()
    {
        System.out.println("hello world");
    }
    public void write(){
       write.write();
    }
}
