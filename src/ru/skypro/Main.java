package ru.skypro;

public class Main {

    public static void main ( String[] args ) {
        Author firstAuthor = new Author("Олег", "Сашин");
        Author secondAuthor = new Author("Андрей", "Земельский");
//        Имена авторов,книг и года выпуска - выдуманные
        Book firstBook = new Book("Life", firstAuthor, 1972);
        Book secondBook = new Book("Домовой", secondAuthor, 2001);
//        Проверка что сеттеры и геттеры работают как необходимо:
        firstBook.setPublishYear(2020);
        System.out.println("firstBook.getPublishYear() = " + firstBook.getPublishYear());
        System.out.println("secondBook.getAuthor() = " + secondBook.getAuthor());
        secondAuthor.setAuthorFirstName("Константин");
        System.out.println("secondAuthor.getAuthorFirstName() = " + secondAuthor.getAuthorFirstName());

//        Меняю имя и фамилию автора через обращение к объекту "книга" и проверяю:
        secondBook.setAuthor("New","Author");
        System.out.println("secondBook.getAuthor() = " + secondBook.getAuthor());
//        Действительно, можно поменять через обращение к книге!
    }
}
