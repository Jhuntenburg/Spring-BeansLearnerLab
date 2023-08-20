package rocks.zipcode.SpringBeansLearnerLab.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import rocks.zipcode.SpringBeansLearnerLab.Classroom;
import rocks.zipcode.SpringBeansLearnerLab.Instructors;
import rocks.zipcode.SpringBeansLearnerLab.Students;

@Configuration
public class ClassroomConfig {




        @Bean
        @DependsOn({"instructors", "students"})
        public Classroom currentCohort(@Qualifier("instructors") Instructors instructors,
                                       @Qualifier("students") Students students) {
          Classroom currentClassroom = new Classroom(instructors, students);
            return currentClassroom;
        }

        @Bean
        @DependsOn({"instructors", "previousStudents"})
        public Classroom previousCohort(@Qualifier("instructors")Instructors instructors,
                                        @Qualifier("previousStudents")Students previousStudents) {
          Classroom previousClassroom = new Classroom(instructors, previousStudents);
            return previousClassroom;
        }
    }



