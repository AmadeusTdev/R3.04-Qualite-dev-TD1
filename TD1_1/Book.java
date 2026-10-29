public class Book {
    // Private variables
    private String title;
    private String author;
    private String editor;
    private int pageNb;

    // Constructor
    public Book(String title, String author, String editor, int pageNb) {
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.pageNb = pageNb;
    }

    // Getters & setters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getEditor() {
        return editor;
    }
    public int getPageNb() {
        return pageNb;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public void setPageNb(int pageNb) {
        this.pageNb = pageNb;
    }
    
    // Print
    @Override
    public String toString() {
        return "Book[title=" + title + ",author=" + author + ",editor=" + editor + ",pageNb=" + pageNb + "]";
    }

    // Equal
    public boolean equals(Book other) {
        if (other == null) {return false; }
        if (this.getClass() != other.getClass()) {return false; }

        return (this.title == other.getTitle() && this.author == other.getAuthor() && this.editor == other.getEditor() && this.pageNb == other.getPageNb());
    }
}
