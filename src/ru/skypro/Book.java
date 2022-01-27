package ru.skypro;

public class Book {
    private String bookName;
    private String author;
    private int publishYear;

    public Book ( String bookName, String author, int publishYear ) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getBookName () {
        return bookName;
    }

    public void setBookName ( String bookName ) {
        this.bookName = bookName;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor ( String author ) {
        this.author = author;
    }

    public int getPublishYear () {
        return publishYear;
    }

    public void setPublishYear ( int publishYear ) {
        this.publishYear = publishYear;
    }
}
