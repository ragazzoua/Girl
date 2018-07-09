package com.company;

/**
 * created by s.a.miroshnychenko 7/9/2018
 */

public class A {
    void m(){
        System.out.println("m()");
        Integer p = 20; /*ссылочные и значимые типы данных*/
        int o = 20;

        System.out.println(p.byteValue());
        System.out.println(o);

    }
    /*void m(int a){
        System.out.println("int a");
    }*/
    void m(int a, int b){
        System.out.println("int a, int b");
    }
    void m(int ...a){
        System.out.println("int ...a");
    }
    /*double m(double a){
        System.out.println("double a");
        return 10.0;
    }*/
}
