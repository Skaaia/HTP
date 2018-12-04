package com.skaaria;

public class Task1 {
    public static void main(String[] args) {
        String[] testString = {"try it on me", "what about me, huh?", "my name is vasya. london is the capital of great-britain!"};
        for (String s : testString) {
            System.out.println(toUpper(s));
        }
    }

    static String toUpper(String s){
        char[] arr = s.toCharArray();
        boolean insideWord = false;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                if (insideWord) {
                    continue;
                }
                arr[i] -= 32;
                insideWord = true;
            } else {
                insideWord = false;
            }
        }
        return new String(arr);
    }
}