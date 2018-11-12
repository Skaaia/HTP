package com.htp;

public class task13 {

    public static void main(String[] args) {
        String[] stringsTask13 ={"asf","asd", "ghj","eyt","ejh","asd","mss" };
        for (int c=0;c<7; c++){
            for (int k=c;k<7;k++){
                if(c!=k && stringsTask13[c].equals(stringsTask13[k])) System.out.println(" element "+c +" equal to element " +k);
            }
        }
        System.out.println(" ");
    }
}