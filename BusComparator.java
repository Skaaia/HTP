package com.lesson5;

import java.util.Comparator;

public class BusComparator implements Comparator<Bus> {

    @Override
    public int compare(Bus o1, Bus o2) {
        if (o1.expTime() < o2.expTime()){
            return 1;
        }else {
            if(o1.expTime() == o2.expTime()){
                return 0;
            }else {
                return -1;
            }
        }
    }
}
