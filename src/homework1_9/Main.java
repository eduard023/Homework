package homework1_9;

public class Main {
    public static void main(String[] args){

    Author dostoevsky = new Author("Fyodor","Dostoevsky");
    Author gogol = new Author("Nikolai", "Gogol");
    Book book1 = new Book("Devil",1871, dostoevsky);
    Book book2 = new Book("Revizor", 1835, gogol);
        System.out.print(book2.getAuthorName().getName() + " " + book2.getAuthorName().getSurname()+" ");
        System.out.println(book2.getName() + " " + book2.getYearOfPublication());
        System.out.print(book1.getAuthorName().getName() + " " + book1.getAuthorName().getSurname() + " ");
        System.out.println(book1.getName() + " " + book1.getYearOfPublication());
book1.setYearOfPublication(1872);

        System.out.println(book1.getAuthorName().getName() + " " + book1.getAuthorName().getSurname() + " " + book1.getName()+ " " + book1.getYearOfPublication());

}

}

