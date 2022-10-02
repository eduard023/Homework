package homework1_9;

public class Author {
    private String surname;
    private String name;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    }