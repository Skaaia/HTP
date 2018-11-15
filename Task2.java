package com.lesson1;

public class Task2 {
    public static void main(String[] args) {
        double[] mas = {1,2,3,4,5,6,7,8,9,10};
        double multiplier = 1.1;
        System.out.print("mas = ");
        for(double x:mas) System.out.print(x + " ");
        System.out.println(" ");
        for(int i = 0; i<mas.length; i++){
            mas[i]=mas[i]*multiplier;
        }
        System.out.print("new mas = ");
        for(double x:mas) System.out.print(x + " ");
    }
}
