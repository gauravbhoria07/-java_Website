// School.java
import java.util.ArrayList;
import java.util.List;

 class School {
    private List<Student> students;
    private List<String> teachers;
    private List<String> classes;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(String teacherName) {
        teachers.add(teacherName);
    }

    public void removeTeacher(String teacherName) {
        teachers.remove(teacherName);
    }

    public void createClass(String className) {
        classes.add(className);
    }
}
