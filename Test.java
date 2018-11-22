package com.skaari;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Cinema[] filmColl = new Cinema[10];
        for (int c = 0;c<filmColl.length; c++){
            filmColl[c]= new Cinema(RandString.method(),Math.random()*10,1.53,"Horror","JHhj");
        }

        Comparator<Cinema> cinemaComparator = new CinemaComparator();
        Arrays.sort(filmColl,cinemaComparator);

        for(int c=0;c<filmColl.length;c++){
            System.out.println(filmColl[c].toString());
        }

    }
}
