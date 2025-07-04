package org.example;

public class Student {
private int age;
private int rno;
    //loosely coupling
private Writer writer;

    public Student()
    {
    }

    public Student(int age, int rno, Writer writer)
    {
        this.age = age;
        this.rno = rno;
        this.writer = writer;
    }
//    public void setWriter(Writer writer) {
//        this.writer = writer;
//    }
//    public void setP(Pen p) {
//        this.p = p;
//    }

//    public int getRno() {
//        return rno;
//    }
//
//    public void setRno(int rno) {
//        this.rno = rno;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        System.out.println("setter is called by spring");
//        this.age = age;
//    }

    public void show()
    {
        System.out.println("In show method ");
    }
    public void write_exam()
    {
        writer.write();
    }
}
