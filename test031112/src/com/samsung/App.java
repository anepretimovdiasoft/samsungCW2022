package com.samsung;

import com.samsung.model.Person;

public class App {

    public static void main(String[] args) {

        Person person = new Person("Ivan", 18);
        Person person1 = new Person(person);

        person.printInfo(5);





    }

}
