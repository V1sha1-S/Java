package Collection.StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        sm.addStudent(new Student(101, "Vishal", 85.33));
        sm.addStudent(new Student(102, "VishalS", 90));
        sm.addStudent(new Student(105, "Vnaik", 80.26));
        sm.addStudent(new Student(103, "VishalNaik", 96));

        sm.displayAll();

        Student std = sm.searchStudent(102);
        if (std != null) {
            System.out.println("Student found: " + std.getName());

        } else {
            System.out.println("No student found");
        }

        Student topStd = sm.topPerformer();
        if (topStd != null) {
            System.err.println("Top Performer: " + topStd.getName() + " - Marks: " + topStd.getMarks());
        }
    }
}
