package com.skaaria.task2;


public class IsFirstLetterWovel {
    private IsFirstLetterWovel() {
    }
    public static boolean method(String s) {
        char[] vowels = {'a','A','e','E','i','I','o','O','u','U','y','Y'};
        char[] arr = s.toCharArray();
        int vowelCount = 0;
        for(char x:vowels){
            if (arr[0]==x){
                vowelCount++;
            }
        }
        if(vowelCount==1){
            return true;
        }else return false;
    }
}
