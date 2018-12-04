package com.skaaria;


public class Task4 {
    public static void main(String[] args) {
        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam";
        System.out.println(replaceByIndex(testString));
    }

    static String replaceByIndex(String s){
        char[] arr = s.toCharArray();
        boolean insideWord = false;
        int posOfSymbol = 3;
        char repSymbol = '3';
        int counter = 0;
        for (int i = 0; i< arr.length; i++) {
            if ((arr[i] >= 65 && arr[i] <= 90 )||(arr[i] >= 97 && arr[i] <= 122)) {
                    counter++;
                    if(counter==3){
                        arr[i]='3';
                }
            } else {
                counter = 0;
            }
        }
        return new String(arr);
    }
}