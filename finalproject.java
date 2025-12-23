import java.awt.*;
import java.util.*;
import javax.swing.*;

class Student {
    String name;
    int[] marks;                
    double average;
    char grade;
    LinkedList<Integer> grades; 

    public Student(String name, int subjectCount) {
        this.name = name;
        marks = new int[subjectCount];
        grades = new LinkedList<>();
    }

    public void setMarks(int[] inputMarks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = inputMarks[i];
            grades.add(inputMarks[i]);
            sum += inputMarks[i];
        }
        average = (double) sum / marks.length;
        Collections.sort(grades);
        calculateGrade();
    }

    private void calculateGrade() {
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';
    }
}


public class finalproject extends JFrame {

    static final int SUBJECTS = 5;
    ArrayList<Student> students = new ArrayList<>();

    JTextField nameField;
    JTextField[] markFields = new JTextField[SUBJECTS];
    JTextArea displayArea;

    public finalproject() {

        setTitle("🎓 Student Grade Tracker");
        setSize(650, 550);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Student Details"));

        inputPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        for (int i = 0; i < SUBJECTS; i++) {
            inputPanel.add(new JLabel("Subject " + (i + 1) + " Marks:"));
            markFields[i] = new JTextField();
            inputPanel.add(markFields[i]);
        }

        add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        JButton addBtn = new JButton("Add Student");
        JButton viewBtn = new JButton("View All Students");

        buttonPanel.add(addBtn);
        buttonPanel.add(viewBtn);
        add(buttonPanel, BorderLayout.CENTER);

       
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        add(new JScrollPane(displayArea), BorderLayout.SOUTH);

        
        addBtn.addActionListener(e -> addStudent());
        viewBtn.addActionListener(e -> displayStudents());

        setVisible(true);
    }

    
    private void addStudent() {
        try {
            String name = nameField.getText();
            if (name.isEmpty())
                throw new Exception("Name required");

            int[] marks = new int[SUBJECTS];
            for (int i = 0; i < SUBJECTS; i++) {
                marks[i] = Integer.parseInt(markFields[i].getText());
                if (marks[i] < 0 || marks[i] > 100)
                    throw new Exception("Invalid marks");
            }

            Student s = new Student(name, SUBJECTS);
            s.setMarks(marks);
            students.add(s);

            JOptionPane.showMessageDialog(this, "Student Added Successfully ✅");
            clearFields();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "❌ Please enter valid data (0–100)",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void displayStudents() {
        displayArea.setText("");

        if (students.isEmpty()) {
            displayArea.setText("No student records found.");
            return;
        }

        for (Student s : students) {
            displayArea.append(
                "Name: " + s.name +
                "\nMarks: " + Arrays.toString(s.marks) +
                "\nSorted Grades: " + s.grades +
                "\nAverage: " + String.format("%.2f", s.average) +
                "\nFinal Grade: " + s.grade +
                "\n----------------------------------------\n"
            );
        }
    }

    private void clearFields() {
        nameField.setText("");
        for (JTextField tf : markFields) tf.setText("");
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {
        new finalproject();
    }
}