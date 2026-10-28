import java.util.ArrayList;

public class Test {
    public static void main(String args[]) {

        // Book tests
        Book myBook1 = new Book("un jour sans fin", "moi", "moi", 48);
        System.out.println(myBook1);
        Book myBook2 = new Book("deux jours sans fin", "bob", "pas moi", 83);
        System.out.println(myBook2);

        System.out.println("Egalité entre les deux livres : " + myBook1.equals(myBook2));
        System.out.println("Egalité entre le premier livre : " + myBook1.equals(myBook1));

        // Librairy tests
        Librairy myLibrairy = new Librairy("la librairy corbeau", "3 rue du tasty crousty", new ArrayList<Book>());
        System.out.println(myLibrairy);


        myLibrairy.addBook(myBook1);
        myLibrairy.addBook(myBook2);
        System.out.println("Après ajout de livres: " + myLibrairy);

        myLibrairy.addBook(new Book("3eme volume des morts", "un cornichon", "adress me", 1));
        myLibrairy.addBook(myBook2);
        myLibrairy.addBook(myBook2);
        myLibrairy.addBook(myBook1);

        System.out.println("Avec doublons: " + myLibrairy);
        myLibrairy.clearDuplicate();
        System.out.println("Sans doublons: " + myLibrairy);

        Librairy otherLibrairy = new Librairy("la librairie oubliee", "5 rue des pizzas fromage", new ArrayList<Book>());
        otherLibrairy.addBook(myBook1);
        otherLibrairy.addBook(new Book("Le grand barbu", "eprouvette", "quelqu'un", 43));

        System.out.println("Autre librairie: " + otherLibrairy);

        System.out.println("Livres similaires entre les deux librairies: ");
        myLibrairy.showSimilar(otherLibrairy);

        System.out.println("Librairie pas triée par auteur: " + myLibrairy);
        myLibrairy.orderByAuthor();
        System.out.println("Librairie triée par auteur: " + myLibrairy);
    }
}