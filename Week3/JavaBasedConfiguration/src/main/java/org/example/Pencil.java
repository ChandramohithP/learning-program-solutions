package org.example;

import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer {
    public Pencil(){
        System.out.println("pencil cons");
    }
    public void write(){
        System.out.println("write with pencil");
    }
}
