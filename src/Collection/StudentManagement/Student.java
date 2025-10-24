package Collection.StudentManagement;

public class Student {

    private int studentId;
    private String Name;
    private double Marks;

    Student(int studentId, String Name, double Marks) {
        this.studentId = studentId;
        this.Name = Name;
        this.Marks = Marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return Name;
    }

    public double getMarks() {
        return Marks;
    }

    public void displayAllStudents() {
        System.out.println("ID: " + studentId + ", Name: " + Name + ", Marks: " + Marks);
    }
}
