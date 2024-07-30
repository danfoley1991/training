package students.services;

import java.util.ArrayList;
import java.util.List;

import students.models.Student;

public final class StudentServices {
    private static StudentServices INSTANCE;

    public static List<Student> students = new ArrayList<>();

    private StudentServices() {
    }

    public static StudentServices getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new StudentServices();
        }

        return INSTANCE;
    }

    public void setup() {
        students.clear();

        // Setup some default data
        students.add(new Student("james", "stone", 16));
        students.add(new Student("rob", "stone", 40));
        students.add(new Student("dan", "foley", 33));
        students.add(new Student("paris", "bruno", 29));
        students.add(new Student("john", "doe", 22));
        students.add(new Student("jane", "doe", 25));
        students.add(new Student("bob", "smith", 50));
        students.add(new Student("paul", "iron", 20));
    }

    public void addStudent(String firstName, String lastName, int age) {
        students.add(new Student(firstName, lastName, age));
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student getStudentByFirstName(String firstName) {
        return students.stream()
            .filter(x -> x.getFirstName().equals(firstName))
            .findFirst()
            .orElse(null);
    }

    public int totalAge() {
        return students.stream().mapToInt(Student::getAge).sum();
    }

    public long totalMatureStudents() {
        return students.stream().filter(Student::isMatureStudent).count();
    }
}
