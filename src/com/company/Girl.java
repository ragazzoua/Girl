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
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
