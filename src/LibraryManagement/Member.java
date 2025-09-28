package LibraryManagement;

public class Member extends Display {
    private int id;
    private String name;

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Member: ID=" + id + ", Name=" + name);
    }

}
