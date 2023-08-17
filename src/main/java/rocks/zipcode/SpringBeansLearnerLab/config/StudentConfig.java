package rocks.zipcode.SpringBeansLearnerLab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rocks.zipcode.SpringBeansLearnerLab.Student;
import rocks.zipcode.SpringBeansLearnerLab.Students;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        return null;
    }
}
