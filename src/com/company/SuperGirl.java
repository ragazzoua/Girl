package com.company;

/**
 * created by s.a.miroshnychenko 7/12/2018
 */

public class SuperGirl extends Girl {
    boolean cook;

    public SuperGirl(String name, int age, boolean cook) {
        super(name, age);
        this.cook = cook;
    }

    @Override
    public String toString() {
        return "SuperGirl{" +
                "cook=" + cook +
                "} " + super.toString();
    }
}
