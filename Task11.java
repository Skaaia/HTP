package com.htp;

public class Task11 {

    public static void main(String[] args) {
        int[] task11  = {1,2,3,4,5,6,7,8,9};
        int reverseC;
        int tmp11;
        //для обеспечения работы при разной длинны массива
        if (task11.length%2!=0){
            reverseC = ((task11.length-1)/2);
        }else {
            reverseC = ((task11.length)/2);
        }

        for (int c=0;c<=reverseC;c++){
            tmp11 = task11[c];
            task11[c] = task11[task11.length-1-c];
            task11[task11.length-1-c] = tmp11;
        }

        System.out.print("arr after reverse ");
        for (int c:task11) System.out.print(c +" ");
        System.out.println(" ");
    }
}