package com.samsung;

import com.samsung.model.Person;

public class App {

    public static void main(String[] args) {

        Person person = new Person("Valera", 18);
        Person person1 = new Person("Kolia", 14);


        person.printInfo();
        person.birthday();
        person.printInfo();

        person1.printInfo();

    }

}
