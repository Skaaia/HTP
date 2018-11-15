package com.htp;

import java.util.Arrays;

public class Task16 {

    public static void main(String[] args) {
        int[] task16  = {5,2,9,21,21,4,21,9,7};
        boolean[] task16Dup = new boolean[task16.length];
        Arrays.fill(task16Dup,false);
        int dupCounter = 0;
        for (int c:task16) System.out.println("arr before " +c);
        System.out.println(" ");

        for (int c=0;c<task16.length; c++){
            for (int k=c;k<task16.length;k++){
                if(c!=k && task16[c] == task16[k] ) {
                    System.out.println("element "+c +" equal to element " +k);
                    task16Dup[c]=true;
                    task16Dup[k]=true;
                }
            }
        }
        for (boolean c:task16Dup) if(c) dupCounter++;

        int task16AfterCounter = 0;
        int[] task16After = new int[task16.length-dupCounter];
        for (int c=0;c<task16.length;c++){
            if (!task16Dup[c]){
                task16After[task16AfterCounter]=task16[c];
                task16AfterCounter++;
            }
        }
        for (int c:task16After) System.out.println("arr after " +c);
        System.out.println(" ");
    }
}