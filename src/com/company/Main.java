package com.company;

public class Main {

    public static void main(String[] args) {
        Girl ira = new Girl("Ira", 24);
        ira.goToCinema();
        System.out.println(ira.countInts(1, 2, 3, 4, 5));
        System.out.println(ira.goToRest("Mac"));
        Girl ira1 = new Girl();
        System.out.println(ira);
        System.out.println(ira1);
        ira1.goToCinema();
    }
}
