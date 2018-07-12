package com.company;

public class Main {

    public static void main(String[] args) {
        Girl ira = new Girl("ira", 23);
        aMethod(9L, 10);
        ira.getName();
        SuperGirl ane = new SuperGirl("ane", 24, true);

        System.out.println(ira);
        System.out.println(ane);
        ane.goToCinema();
    }
    public static void  aMethod(long val1, int val2){
        System.out.println("long int");
    }
    public static void  aMethod(int val1, long val2){
        System.out.println("int long");
    }


}
