package rocks.zipcode.SpringBeansLearnerLab.config;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rocks.zipcode.SpringBeansLearnerLab.Classroom;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {
    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void testCurrentCohortBean() {
        assertNotNull(currentCohort);

    }

    @Test
    public void testPreviousCohortBean() {
        assertNotNull(previousCohort);

    }


}