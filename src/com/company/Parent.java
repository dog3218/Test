package com.company;

public class Parent {
    String name = "Parent";

    public Parent(String name) {
        this.name = name;
        System.out.print("P(String) : "+ this.name);
    }

    public void Paretnt(){
        System.out.print("P"+ this.name);
    }

}

class Child extends Parent{
    int num;

    public Child(String name, int i) {
        super(name);
        this.num = num;
        System.out.print(this.name);
    }

    public Child(String name) {
        super(name);
        this.num = num;
        System.out.print(this.name);
    }

    void info(){
        System.out.print(num);
    }
}

