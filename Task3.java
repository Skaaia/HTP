package com.lesson1;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = {1,2,3,5,4,3,2,1};
        boolean po = true;
        for(int i=0; i < mas.length;i++) {
            if(mas[i] != mas[mas.length-i-1]){
                po=false;
                break;
            }
        }
        if(po){
            System.out.println("Это полиндром ");
        }else System.out.println("Это не полиндром ");
    }
}
