package ru.skypro;

public class Author {
    private String authorFirstName;
    private String authorSecondName;

    public Author ( String authorFirstName, String authorSecondName ) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorFirstName () {
        return authorFirstName;
    }

    public void setAuthorFirstName ( String authorFirstName ) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorSecondName () {
        return authorSecondName;
    }

    public void setAuthorSecondName ( String authorSecondName ) {
        this.authorSecondName = authorSecondName;
    }
}
