package com.htp;

public class task14 {

    public static void main(String[] args) {
        String[] stringsTask14Number1 ={"asf","asd", "ghj","eyt","ejh","asd","mss" };
        String[] stringsTask14Number2 ={"jkj","ejh", "ytu","dht","tiu","ayj","jht" };

        for (int c=0;c<7; c++){
            for (int k=0;k<7;k++){
                if(stringsTask14Number1[c].equals(stringsTask14Number2[k])) System.out.println(" element "+c +" of first array equal to element " +k +" of second array");
            }
        }
        System.out.println(" ");
    }
}