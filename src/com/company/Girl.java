package com.company;

import java.util.Arrays;

/**
 * created by s.a.miroshnychenko 7/5/2018
 */

public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Girl() {
        name = "ket";
        age = 20;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void goToCinema() {
        System.out.println("go with " + name);
    }

    public String goToRest(String rest) {
        if ("Mac".equals(rest)) {
            return "No";
        } else {
            return "Yes";
        }
    }

    public int countInts(String s, int... a) {
        System.out.println(s);

        return Arrays.stream(a).sum();
    }

    @Override
    protected void finalize()  {
        System.out.println("Good Bye");
        System.out.printf("Good Bye %s", name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16 && age < 30)
        this.age = age;
        else {
            System.out.println("hello");        }
    }
}
