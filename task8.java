package com.htp;

public class task8 {

    public static void main(String[] args) {
        int[] task8  = {5,2,9,21,21,4,21,8,7};
        int[] task8New  = new int[task8.length];
        int task8NewCounter = 0;
        for (int c:task8){
            task8New[task8NewCounter]=c;
            task8NewCounter++;
        }
        for (int c:task8New)
            System.out.println("arr copy " +c);
        System.out.println(" ");
    }
}