package com.skaaria.task1;


import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
              Book book1 = new Book("asd","qwert","FirstBook", "horror",1976);
        Book book2 = new Book("asdgg","hwejg","SecondBook", "thriller",2001);
        Book book3 = new Book("asdhkt","ekkue","ThirdBook", "detective",2004);

        List<Book> bookList = new LinkedList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for (Book element : bookList){
            System.out.println(element);
        }

        bookList.remove(1);

        for (Book element : bookList){
            System.out.println(element);
        }
    }

}
