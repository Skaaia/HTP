package com.htp;

public class task5 {
    public task5(){}

    public static void main(String[] args) {
        int specificValTask5 = 643;
        int[] task5 = {5,2,9,643,1,4,643,8,7};
        int counter = 0;
        for(int x:task5){
            if (x == specificValTask5){
                System.out.println("Mas element number " +counter +" contains a specific value " +specificValTask5 );
            }
            counter++;
        }
    }
}