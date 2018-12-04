package com.skaaria.task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Random year = new Random();
        Book book1 = new Book("asd","qwert","FirstBook", "horror",1976);
        Book book2 = new Book("asd","qwert","FirstBook", "horror",1976);
        Book book3 = new Book("asd","qwert","FirstBook", "horror",1976);
        Book book4 = new Book("asd","qwert","FirstBook", "horror",1976);
        Book book5 = new Book("asd","qwert","FirstBook", "horror",1976);
        Book book6 = new Book("asd","qwert","FirstBook", "horror",1976);
        Book[] books = new Book[19];
        for (int c = 0;c<books.length; c++){
            books[c]= new Book(RandString.method(),RandString.method(),RandString.method(),RandString.method(),year.nextInt(2018));
        }

        Set<Book> bookHashSet = new HashSet<>();

        bookHashSet.add(book1);
        bookHashSet.add(book2);
        bookHashSet.add(book3);
        bookHashSet.add(book4);
        bookHashSet.add(book5);
        bookHashSet.add(book6);

        for(Book x:books) bookHashSet.add(x);

        for (Book element : bookHashSet){
            if(IsFirstLetterWovel.method( element.getBookLabel())){
                System.out.println(element);
            }
        }

    }
}
