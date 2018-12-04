package com.skaaria;

import com.skaaria.task1.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int res = String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthorName(), o2.getAuthorName());
        if (res == 0) {
            res = o1.getAuthorName().compareTo(o2.getAuthorName());
        }
        return res;
    }
}