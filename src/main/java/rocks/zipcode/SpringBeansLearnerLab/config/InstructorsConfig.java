package rocks.zipcode.SpringBeansLearnerLab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import rocks.zipcode.SpringBeansLearnerLab.Instructor;
import rocks.zipcode.SpringBeansLearnerLab.Instructors;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors() {
//      Instructors usaInstructors = new Instructors(
//                new Instructor(201L, "John"),
//                new Instructor(202L, "Jane")
//        );
//        return usaInstructors;
//    }
    return new Instructors();
    }

    @Bean
    public Instructors tcUkInstructors() {
//          Instructors ukInstructors = new Instructors(
//                new Instructor(301L, "Michael"),
//                new Instructor(302L, "Sarah")
//        );
//        return ukInstructors;
        return new Instructors();
    }

    @Bean
    @Primary
    public Instructors instructors() {
//             Instructors allInstructors = new Instructors(
//                new Instructor(201L, "John"),
//                new Instructor(202L, "Jane"),
//                new Instructor(301L, "Michael"),
//                new Instructor(302L, "Sarah")
//        );
//        return allInstructors;
        return new Instructors();
   }
}




