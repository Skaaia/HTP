package com.htp;

public class task4 {
    public task4(){}

    public static void main(String[] args) {
        double AvgVal = 0;
        int[] task4 = {5,2,9,3,1,4,6,8,7};
        double sum=0;

        for(double x:task4) sum+=x;

        System.out.println("Sum " + sum);
        AvgVal = sum/task4.length;
        System.out.println("AvgVal " +AvgVal );
    }
}