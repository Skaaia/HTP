package com.htp;

public class Task19 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 9;
        int n = 3;
        int mas1[][] = new int[n][n];
        int mas2[][] = new int[n][n];
        int sum[][] = new int[n][n];
        for (int i = 0 ; i < n ; i++ ) {
            for (int j = 0; j < n; j++) {
                mas2[i][j] = count2;
                mas1[i][j] = count1;
                count1++;
                count2--;
            }
        }
        for (int i = 0 ; i < n ; i++ ) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = mas1[i][j] + mas2[i][j];
            }
        }
        System.out.println("sum: ");

        for (int i = 0 ; i < n ; i++ ) {
            for (int j = 0; j < n; j++) {
                System.out.println(sum[i][j]);
            }
        }
    }
}


