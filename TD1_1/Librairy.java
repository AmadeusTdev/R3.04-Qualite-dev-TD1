import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Librairy {
    public final int MAX_BOOKS = 10;

    // Private variables
    private String name;
    private String address;
    private int max;
    private List<Book> content;

    // Constructor
    public Librairy(String name, String address, List<Book> content) {
        this.name = name;
        this.address = address;
        this.max = MAX_BOOKS;
        this.content = content;
    }

    // Getters & setters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getMax() {
        return max;
    }
    public List<Book> getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public void setContent(List<Book> content) {
        this.content = content;
    }

    // Print
    @Override
    public String toString() {
        String text = "Librairy[";
        for (Book aBook : content) {
            text = text + aBook.getTitle() + ",";
        }
        text = text + "]";

        return text;
    }

    // Methods
    public void addBook(Book book) {
        if (content.size() < max) {
            content.add(book);
        } else {
            System.err.println("Taille maximum de la librairie atteinte, impossible de stocker plus de livres");
        }
    }
    public void removeBook(Book book) {
        content.remove(book);
    }

    public void clearDuplicate() {
        List<Book> temp = new ArrayList<Book>();
        for (Book book : content) {
            if (!temp.contains(book)) {
                temp.add(book);
            }
        }
        content.clear();
        content = temp;
    }

    public void showSimilar(Librairy otherLibrairy) {
        List<Book> similar = new ArrayList<Book>();

        for (Book bookA : this.content) {
            if (otherLibrairy.getContent().contains(bookA)) {
                similar.add(bookA);
            }
        }

        String text = "Similar books: ";
        for (Book aBook : similar) {
            text = text + aBook.getTitle() + ", ";
        }
        System.out.println(text);
    }

    public void orderByAuthor() {
        content.sort(Comparator.comparing(Book::getAuthor, String.CASE_INSENSITIVE_ORDER));
    }
}
