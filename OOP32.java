// Student.java
public class Student {
    private int studentId;
    private String studentName;
    private List<Integer> grades;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    // Setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Additional validation in the addGrade method
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
        }
    }

    public void displayGrades() {
        System.out.println("Grades for Student " + studentId + " (" + studentName + "):");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1, "John");

        // Using getter methods
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());

        // Using setter method
        student.setStudentName("Alice");

        // Using additional validation in addGrade method
        student.addGrade(90);
        student.addGrade(105); // Invalid grade

        // Displaying grades
        student.displayGrades();
    }
}
