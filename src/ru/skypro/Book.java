package ru.skypro;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int publishYear;

    public Book ( String bookName, Author author, int publishYear ) {
        this.bookName = bookName;
        this.bookAuthor = author;
        this.publishYear = publishYear;
    }

    public String getBookName () {
        return bookName;
    }

    public void setBookName ( String bookName ) {
        this.bookName = bookName;
    }

    public String getAuthor () {
        return (bookAuthor.getAuthorFirstName() + " " + bookAuthor.getAuthorSecondName());
    }

    public void setAuthor (String bookAuthorFirstName, String bookAuthorSecondName) {
         bookAuthor.setAuthorFirstName(bookAuthorFirstName);
         bookAuthor.setAuthorSecondName(bookAuthorSecondName);
    }

    public int getPublishYear () {
        return publishYear;
    }

    public void setPublishYear ( int publishYear ) {
        this.publishYear = publishYear;
    }
}
