package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("22")
    private int rno;//0
    //@Autowired
    //@Qualifier("pen") field injection
    private Writer writer;//null

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Writer getWriter() {
        return writer;
    }
    //@Autowired//setter injection
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Student(){
        System.out.println("Student Constructor");
    }
    public void show(){
        System.out.println("in the show method in studen");
    }
    public void write_exam(){
        writer.write();
    }
    @Autowired//constructor injection
    public Student(@Qualifier("pencil") Writer writer) {//here qualifier must be inside for constructor injection
        this.writer = writer;
    }
}
