package org.example;

public class Pen implements Writer{
    public Pen(){
        System.out.println("pen cons");
    }
    public void write(){
        System.out.println("write using pen");
    }
}
