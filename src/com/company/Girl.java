package com.company;

/**
 * created by s.a.miroshnychenko 7/5/2018
 */

public class Girl {
    String name;
    int age;

    public Girl(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Girl() {
        name = "Ket";
        age = 20;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
