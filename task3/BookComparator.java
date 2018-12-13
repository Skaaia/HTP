package com.skaaria.task3;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int res = String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthorName(), o2.getAuthorName());
        if (res == 0) {
            res = String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthorSurame(), o2.getAuthorSurame());
        }
        return res;
    }
}