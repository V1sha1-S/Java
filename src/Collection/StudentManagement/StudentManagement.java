package Collection.StudentManagement;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StudentManagement {
    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public Student searchStudent(int id) {
        for (Student std : studentList) {
            if (std.getStudentId() == id) {
                return std;
            }
        }
        return null;
    }

    public Student topPerformer() {
        if (studentList.isEmpty()) {
            return null;
        }
        Student top = studentList.get(0);
        for (Student std : studentList) {
            if (std.getMarks() > top.getMarks()) {
                return std;
            }
        }
        return top;
    }

    public void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("There is not students");
        } else {
            for (Student std : studentList) {
                std.displayAllStudents();
            }
        }
    }
}
