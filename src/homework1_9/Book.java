package homework1_9;

public class Book {
    private String name;
    private int yearOfPublication;
    private Author author;

    public Book(String name, int yearOfPublication, Author author){
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }
    public String getName(){
        return this.name;
    }
    public int getYearOfPublication(){
        return this.yearOfPublication;
    }

    public Author getAuthorName() {
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
