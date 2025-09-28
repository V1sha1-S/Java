package LibraryManagement;

public class Student extends Member {
    String grade;

    Student(int id, String name, String grade) {
        super(id, name);
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: ID=" + getId() + ", Name=" + getName() + ", Grade=" + grade);
    }

}
