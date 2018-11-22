package com.skaari;

import java.util.Comparator;

public class CinemaComparator implements Comparator<Cinema> {
    @Override
    public int compare(Cinema o1, Cinema o2) {
        if (o1.filmMeta.getFilmGrade() < o2.filmMeta.getFilmGrade()){
            return 1;
        }else {
            if(o1.filmMeta.getFilmGrade() == o2.filmMeta.getFilmGrade()){
                return 0;
            }else {
                return -1;
            }
        }
    }
}
