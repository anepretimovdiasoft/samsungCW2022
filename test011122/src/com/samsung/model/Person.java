package com.samsung.model;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void birthday(){
        age++;
    }

    public void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
