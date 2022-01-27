package ru.skypro;

public class Main {

    public static void main ( String[] args ) {
        Author firstAuthor = new Author("Олег", "Сашин");
        Author secondAuthor = new Author("Андрей", "Земельский");
//        Имена авторов,книг и года выпуска - выдуманные
        Book firstBook = new Book("Life",
                firstAuthor.getAuthorFirstName() + " " + firstAuthor.getAuthorSecondName(),
                1972);
        Book secondBook = new Book("Домовой",
                secondAuthor.getAuthorFirstName() + " " + secondAuthor.getAuthorSecondName(),
                2001);
//        Проверка что сеттеры и геттеры работают как необходимо:
        firstBook.setPublishYear(2020);
        System.out.println("firstBook.getPublishYear() = " + firstBook.getPublishYear());
        System.out.println("secondBook.getAuthor() = " + secondBook.getAuthor());
        secondAuthor.setAuthorFirstName("Константин");
        System.out.println("secondAuthor.getAuthorFirstName() = " + secondAuthor.getAuthorFirstName());
    }
}
