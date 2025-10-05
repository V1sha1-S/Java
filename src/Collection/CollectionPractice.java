package Collection;

import java.util.ArrayList;

class Students {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + " name: " + name);
    }
}

class studentManager {
    ArrayList<Students> students = new ArrayList<>();

    public void addStudents(Students student) {
        students.add(student);
    }

    public void displayAll() {
        for (

        Students std : students) {
            std.displayDetails();
        }
    }
}

public class CollectionPractice {
    public static void main(String[] args) {
        studentManager stMgr = new studentManager();

        stMgr.addStudents(new Students(101, "Vishal"));
        stMgr.addStudents(new Students(102, "Vishal Naik"));

        stMgr.displayAll();
    }
}
