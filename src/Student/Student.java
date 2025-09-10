package Student;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Student {
    int rno;
    String Name;
    String Email;
    Float Marks;

    public void greeting() {
        System.out.println("Hello " + this.Name);
    }

    Student() {
        this(24, "Invisible", "Invisible@", 77.2f);
    }

    // Student() {
    // this.rno = 12;
    // this.Name = "vishal";
    // this.Email = "vnaik@gmail.com";
    // this.Marks = 88.56f;
    // }

    Student(int roll, String name, String Email, Float marks) {
        this.rno = roll;
        this.Name = name;
        this.Email = Email;
        this.Marks = marks;
    }

    public static void main(String[] args) {

        // Student Vishal = new Student();
        // Vishal.greeting();

        // Student Vishal_S = new Student();
        // Vishal_S.greeting();
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // Student Vishal = new Student(23, "Vishal S Naik", "Vnaik", 90.5f);
        Student other = new Student();
        System.out.println(other.rno);
        System.out.println(other.Name);

        // System.out.println(Vishal.Name);
        // System.out.println(Vishal.rno);
        // System.out.println(Vishal.Email);
        // System.out.println(Vishal.Marks);

        // System.out.println(Vishal_S.Name);
        // System.out.println(Vishal_S.rno);
        // System.out.println(Vishal_S.Email);
        // System.out.println(Vishal_S.Marks);
    }
}
