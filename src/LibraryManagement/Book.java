package LibraryManagement;

public class Book extends Display {
    private int id;
    private String title;
    private String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getInt() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: Id=" + id + ", Title=" + title + ", Author=" + author);
    }

}
