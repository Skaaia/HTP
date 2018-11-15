package com.lesson1;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        double[] mas = {4,3,2,7,5,9,8,1,6};
        Arrays.sort(mas);
        double max = mas[8];
        for(double x:mas){
            x=x/max;
            System.out.println(x);
        }

    }
}
