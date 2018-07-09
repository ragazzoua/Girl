package com.company;

public class Main {

    public static void main(String[] args) {
        aMethod(9L, 10);
    }
    public static void  aMethod(long val1, int val2){
        System.out.println("long int");
    }
    public static void  aMethod(int val1, long val2){
        System.out.println("int long");
    }
}
