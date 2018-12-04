package com.skaaria;

public class Task3 {
    public static void main(String[] args) {
        String testString = "tr-11yiton19me";
        System.out.println(sumOfNumbersInString(testString));
    }


    static int sumOfNumbersInString(String testString) {
        char[] arr = testString.toCharArray();
        int power = 1;
        int tempSum = 0;
        int ans = 0;
        int minusFlag = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                int value = arr[i] - '0';
                tempSum = tempSum * power + value;
                power = 10;
            }
            if (arr[i] == '-') {
                minusFlag = -1;
            }
            if ((arr[i] >= 'a') && (arr[i] <= 'z') || (i == 0))
            {
                ans += tempSum * minusFlag;
                power = 1;
                tempSum = 0;
                minusFlag = 1;
            }
        }
        return ans;
    }
}



