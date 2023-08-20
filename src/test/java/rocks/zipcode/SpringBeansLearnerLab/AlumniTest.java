package rocks.zipcode.SpringBeansLearnerLab;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    private Instructors instructors;

    @Autowired
    private Alumni alumni;

    @Test
    public void testExecuteBootcamp() {


    }
}