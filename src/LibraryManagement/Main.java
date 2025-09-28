package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Display[] items = {
                new Book(1, "Java Basics", "James"),
                new Book(2, "OOP concepts", "Martin"),
                new Member(101, "Alice"),
                new Student(102, "Bob", "10th")
        };

        for (Display item : items) {
            item.displayDetails();
        }

        // Member mem = new Member(101, "Alice");
        // Student std1 = new Student(102, "Bob", "10th");

        // mem.displayDetails();
        // std1.displayDetails();
    }
}
