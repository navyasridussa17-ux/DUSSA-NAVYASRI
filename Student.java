import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Student {

    String name;
    int[] marks;
    LinkedList<Integer> grades;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        grades = new LinkedList<>();

        for (int m : marks) {
            if (m >= 0 && m <= 100) {
                grades.add(m);
            }
        }
        Collections.sort(grades);
    }

    double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Sorted Marks: " + grades);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println();
    }
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Anu", new int[]{85, 90, 78}));
        students.add(new Student("Ravi", new int[]{60, 75}));
        students.add(new Student("Sita", new int[]{88, 92}));

        System.out.println("========== STUDENT REPORT ==========");

        for (Student s : students) {
            s.display();
        }
    }
}
