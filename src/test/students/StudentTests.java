package students;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import students.models.Student;
import students.services.StudentServices;

public class StudentTests {

    private StudentServices studentServices;

    @BeforeEach
    void setup() {
        studentServices = StudentServices.getInstance();
        studentServices.setup();
    }

    @Test
    void shouldConstructStudent() {
        // Given some student details
        String firstName = "john";
        String lastName = "Downmore";
        int age = 22;

        // When we construct the student
        Student student = new Student(firstName, lastName, age);

        // Then student should be constructed
        assertEquals("john", student.getFirstName());
        assertEquals("Downmore", student.getLastName());
        assertEquals(22, student.getAge());
    }

    @Test
    void shouldAddStudent() {
        // Given some student details
        String firstName = "jim";
        String lastName = "survive";
        int age = 16;

        // When student is removed
        studentServices.addStudent(firstName, lastName, age);

        // Then student should be added
        assertEquals(9, StudentServices.students.size());
    }

    @Test
    void shouldRemoveStudent() {
        // Given some student details
        String firstName = "james";
        String lastName = "stone";
        int age = 16;

        // And we construct the student
        Student student = new Student(firstName, lastName, age);

        // When student is removed
        studentServices.removeStudent(student);

        // Then student should be removed
        assertEquals(7, StudentServices.students.size());
    }

    @Test
    void shouldCalculateCombinedAgeOfStudents() {
        // When age is calculated
        int result = studentServices.totalAge();

        // Then age is expected
        assertEquals(235, result);
    }

    @Test
    void shouldCalculateMatureStudents() {
        // When mature students are calculated
        long result = studentServices.totalMatureStudents();

        // Then student count is expected
        assertEquals(5, result);
    }

    @Test
    void shouldChangeFirstNameOfStudent() {
        // Given the student is found
        Student student = studentServices.getStudentByFirstName("james");

        // When last name is changed
        student.setFirstName("jim");

        // Then student name should be changed
        assertEquals("jim", student.getFirstName());
    }

    @Test
    void shouldChangeLastNameOfStudent() {
        // Given the student is found
        Student student = studentServices.getStudentByFirstName("paris");

        // When last name is changed
        student.setLastName("foley");

        // Then student name should be changed
        assertEquals("foley", student.getLastName());
    }
}
