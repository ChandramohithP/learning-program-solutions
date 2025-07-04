package org.example;

public class Student {
    private int rno;//0
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
}
