package com.skaari;

public class Test {
    public static void main(String[] args) {
        Fridge fridge1 = new Fridge(10,20,30,400,100,3,Brand.BRAND1);
        Washer washer1 = new Washer(15.5,25,30,400,100,6,Brand.BRAND3);
        System.out.println(fridge1.toString());
        System.out.println(washer1.toString());
        System.out.println(fridge1.cost());
        System.out.println(washer1.elecCons());
    }
}
