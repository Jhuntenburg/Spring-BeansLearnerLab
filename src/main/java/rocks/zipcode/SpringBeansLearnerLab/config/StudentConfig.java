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
//        Students currentStudents = new Students(new Student
//                (1L,"Alice"),
//                new Student(2L,"Bob"),
//                new Student(3L,"Charlie"));
//        return currentStudents;
        return new Students();
    }

    @Bean
    public Students previousStudents() {

//        Students previousStudents = new Students(
//                new Student(101L, "Eve"),
//                new Student(102L, "Frank"),
//                new Student(103L, "Grace")
//        );
//        return previousStudents;
        return new Students();
    }
}
