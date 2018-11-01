package com.htp;

public class task1 {
    public task1(){}

    public static void main(String[] args) {
        int tmp;
        int[] unsorted = {5,2,9,3,1,4,6,8,7};
        for(int c = 0; c<unsorted.length-1;c++){
            for (int j = 0;j<unsorted.length-c-1;j++){
                if (unsorted[j] > unsorted[j + 1]){
                    tmp=unsorted[j];
                    unsorted[j]=unsorted[j+1];
                    unsorted[j+1]=tmp;
                }
            }
        }
        for(int x:unsorted) System.out.print(x+", ");
        System.out.println(" ");
    }
}
