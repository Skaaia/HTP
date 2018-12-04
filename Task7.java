package com.skaaria;

public class Task7 {
    public static void main(String[] args) {
        String testString = "ooooooofoooooofooooooooooof";
        char[] vowels = {'a','e','i','o','u','y'};
        symbolCounter(testString,vowels);
    }

    static void symbolCounter(String s,char[] vowels) {
        char[] arr = s.toCharArray();
        int glasCounter = 0;
        int soglCounter = 0;
        for (int i = 0; i< arr.length; i++) {
            if ((arr[i] >= 65 && arr[i] <= 90 )||(arr[i] >= 97 && arr[i] <= 122)) {
                for(int k=0;k<vowels.length;k++) {
                    if (arr[i]==vowels[k]){
                        glasCounter++;
                        break;
                    }
                    if (k==vowels.length-1){
                        soglCounter++;
                    }
                }
            }
        }
        if (glasCounter>soglCounter){
            System.out.println("number of vowels is bigger then number of consonants");
        }else if(glasCounter<soglCounter){
            System.out.println("number of consonants is bigger then number of vowels");
        }else {
            System.out.println("number of consonants is equal to number of vowels");
        }
    }

}
