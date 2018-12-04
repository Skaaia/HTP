package com.skaaria.task1;

import java.util.Objects;

public class Book {
    private String authorName;
    private String authorSurame;
    private String bookLabel;
    private String genre;
    private int yearOfPublishing;

    public Book() {
    }

    public Book(String authorName, String authorSurame, String bookLabel, String genre, int yearOfPublishing) {
        this.authorName = authorName;
        this.authorSurame = authorSurame;
        this.bookLabel = bookLabel;
        this.genre = genre;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurame() {
        return authorSurame;
    }

    public void setAuthorSurame(String authorSurame) {
        this.authorSurame = authorSurame;
    }

    public String getBookLabel() {
        return bookLabel;
    }

    public void setBookLabel(String bookLabel) {
        this.bookLabel = bookLabel;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorSurame, book.authorSurame) &&
                Objects.equals(bookLabel, book.bookLabel) &&
                Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurame, bookLabel, genre, yearOfPublishing);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", authorSurame='" + authorSurame + '\'' +
                ", bookLabel='" + bookLabel + '\'' +
                ", genre='" + genre + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }


}
