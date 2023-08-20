package rocks.zipcode.SpringBeansLearnerLab;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import rocks.zipcode.SpringBeansLearnerLab.config.ClassroomConfig;

@Component
public class Alumni {


    private Instructors instructors;
    private Students students;

    @Autowired
    public Alumni(@Qualifier("previousCohort") Classroom classroom) {
        this.students = classroom.getStudents();
        this.instructors = classroom.getInstructors();
    }

    @PostConstruct
    public void executeBootcamp() {
        double totalNumberOfHours = 1200.0;
        int numberOfInstructiors = instructors.size();
        int numOfStudents = students.size();
        double numberOfHoursToTeach = totalNumberOfHours*numOfStudents;
        double numberOfHoursPerInstructor = totalNumberOfHours / numberOfInstructiors;

        instructors.forEach(instructor -> instructor.lecture(students, numberOfHoursPerInstructor));

    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
