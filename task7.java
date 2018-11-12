package com.htp;

public class task7 {

    public static void main(String[] args) {
        int[] task7  = {5,2,9,21,21,4,21,8,7};
        int specificValTask7 = 21;
        int specificValCounter = 0;
        for (int c:task7) System.out.println("arr before " +c);
        System.out.println(" ");

        for (int c:task7){
            if (c == specificValTask7){
                specificValCounter++;
            }
        }

        int[] task7After = new int[task7.length-specificValCounter];

        int task7AfterCounter = 0;
        for (int c:task7){
            if(c!=specificValTask7){
                task7After[task7AfterCounter]=c;
                task7AfterCounter++;
            }
        }

        for (int c:task7After)
            System.out.println("arr after " +c);
        System.out.println(" ");
    }
}