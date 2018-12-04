package com.skaaria;

public class Task2 {
    public static void main(String[] args) {
        String[] testString = {"try it on me", "wha a!!bout, me, huh?", "my name is vasya. london is the capital of great-britain!"};
        for (String s : testString) {
            System.out.println(numberOfSpecialChars(s));
        }
    }
    static int numberOfSpecialChars(String s){
        char[] arr = s.toCharArray();
        int counter = 0;
        for (int i = 0; i< arr.length; i++) {
            if(arr[i]==33){
                counter++;
            }
            if(arr[i]==44){
                counter++;
            }
            if(arr[i]==46){
                counter++;
            }
            if(arr[i]==63){
                counter++;
            }
        }
        return counter;
    }
}
