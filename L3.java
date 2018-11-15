package com.lesson3;


import java.util.Arrays;

public class L3 {
    public static void main(String[] args) {
        int busCount=6;

        Bus[] busPark=new Bus[busCount];
        busPark[0]=new Bus(2002,"saf",5467, 93,33,"je");
        busPark[1]=new Bus( 2015, "tej", 5245,  96, 5554,  "k6k");
        busPark[2]=new Bus( 2004, "tkj", 1345,  42, 5785,  "65kuk");
        busPark[3]=new Bus( 1996, "ykj", 8255,  56, 7895,  "t3j4k");
        busPark[4]=new Bus( 2011, "ekj", 3267,  78, 6985,  "kjk4");
        busPark[5]=new Bus( 2009, "iut", 9255,  39, 1394,  "ekhk45");

        Arrays.sort(busPark);

        for(int k=0;k<busCount;k++){
            System.out.println(busPark[k].toString());
        }

    }
}
