package com.lesson5;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    private static final String STR1 = "axisBurden= ";
    public static void main(String[] args) {
        int busCount=6;

        Bus[] busPark=new Bus[busCount];
        busPark[0]=new Bus(120,77,16,8,"m1",2001,"1hjgh",73463,12,22000, 10000);
        busPark[1]=new Bus(134,45,12,6,"m2",2012,"2hygh",73713,97,12000, 5000);
        busPark[2]=new Bus(154,65,14,7,"m3",2011,"3tygh",63463,90,42000, 7000);
        busPark[3]=new Bus(176,12,10,5,"m4",2009,"4thtgh",13463,100,62000, 6000);
        busPark[4]=new Bus(167,56,8,4,"m5",2005,"5hgfgh",23463,30,72000, 17000);
        busPark[5]=new Bus(150,77,4,2,"m6",2007,"6hjgh",53463,53,82000, 12000);

        for(int k=0;k<busCount;k++){
            System.out.println(busPark[k].toString());
        }
        System.out.println(STR1 + busPark[0].axisBurden());
        System.out.println(STR1 + busPark[0].axisBurden(2));
        System.out.println(STR1 + busPark[0].travelTime());
        System.out.println(STR1 + busPark[0].expTime());

        Comparator<Bus> busComparator = new BusComparator();
        Arrays.sort(busPark,busComparator );

        for(int k=0;k<busCount;k++){
            System.out.println(busPark[k].toString());
        }
    }

}