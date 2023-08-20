package rocks.zipcode.SpringBeansLearnerLab.config;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.SpringBeansLearnerLab.Instructors;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorsConfigTest {
    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Test
    public void testTcUsaInstructorsBean() {
        assertNotNull(tcUsaInstructors);
        assertEquals(2, tcUsaInstructors.size()); // Assuming you've created 2 USA instructors in InstructorsConfig
        assertEquals("John", tcUsaInstructors.findById(201).getName());
        assertEquals("Jane", tcUsaInstructors.findById(202).getName());
    }

    @Test
    public void testTcUkInstructorsBean() {
        assertNotNull(tcUkInstructors);
        assertEquals(2, tcUkInstructors.size()); // Assuming you've created 2 UK instructors in InstructorsConfig
        assertEquals("Michael", tcUkInstructors.findById(301).getName());
        assertEquals("Sarah", tcUkInstructors.findById(302).getName());
    }

    @Test
    public void testInstructorsBean() {
        assertNotNull(instructors);
        assertEquals(4, instructors.size()); // Assuming you've created a total of 4 instructors in InstructorsConfig
        assertEquals("John", instructors.findById(201).getName());
        assertEquals("Jane", instructors.findById(202).getName());
        assertEquals("Michael", instructors.findById(301).getName());
        assertEquals("Sarah", instructors.findById(302).getName());
    }

}