package homework1_9;

public class Main {
    public static void main(String[] args){

    Author dostoevsky = new Author("Fyodor","Dostoevsky");
    Author gogol = new Author("Nikolai", "Gogol");
    Author bulgakov = new Author("Mihail", "Bulgakov");
    Book book1 = new Book("Devil",1871, dostoevsky);
    Book book2 = new Book("Revizor", 1835, gogol);
    Book book3 = new Book("Master and Margarita", 1967, bulgakov);
        System.out.println(book3);

}

}

