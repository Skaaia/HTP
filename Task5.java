package com.skaaria;

public class Task5 {
    public static void main(String[] args) {
        String testString = "Lorem ipsum dolor sit *amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt* ut labore et dolore magna aliqua. Ut enim ad minim veniam";
        inBetweenTwoSpecialSymbols(testString);
    }

    static void inBetweenTwoSpecialSymbols(String testString){
        int first = testString.indexOf('*');
        int last = testString.lastIndexOf('*');
        StringBuffer sb = new StringBuffer(testString);
        sb.delete(first,last+1);
        System.out.println(sb);
    }
}
