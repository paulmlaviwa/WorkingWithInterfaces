package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // First, compare by last name
        int lastNameComparison = this.lastName.compareTo(otherPerson.lastName);

        // If last names are the same, compare by first name
        if (lastNameComparison == 0) {
            return this.firstName.compareTo(otherPerson.firstName);
        }

        return lastNameComparison;
    }
}

class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();

        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));

        Collections.sort(myFamily);

        for (Person person : myFamily) {
            System.out.println(person.firstName + " " + person.lastName + " - Age: " + person.age);
        }
    }
}

