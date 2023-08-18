package rocks.zipcode.SpringBeansLearnerLab.config;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.SpringBeansLearnerLab.Students;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {
    @Autowired
    @Qualifier("students")
    private Students students;

    @Test
    public void testStudentsBean() {
        assertNotNull(students);
        assertEquals(3, students.size());
        assertEquals("Alice", students.findById(1).getName());
        assertEquals("Bob", students.findById(2).getName());
        assertEquals("Charlie", students.findById(3).getName());
    }

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;
    @Test
    void previousStudents() {
        assertNotNull(previousStudents);
        assertEquals(3, previousStudents.size());
        assertEquals("Eve", previousStudents.findById(101).getName());
        assertEquals("Frank", previousStudents.findById(102).getName());
        assertEquals("Grace", previousStudents.findById(103).getName());
    }
}