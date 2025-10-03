package Collection;

import java.util.ArrayList;

class Students {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    ArrayList<Students> students = new ArrayList<>();

    public void addStudents(Students students) {
        Students.add(students);
    }
}

public class CollectionPractice {
    public static void main(String[] args) {

    }
}
