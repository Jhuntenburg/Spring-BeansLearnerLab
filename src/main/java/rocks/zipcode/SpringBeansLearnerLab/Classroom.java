package rocks.zipcode.SpringBeansLearnerLab;

public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom(Instructors i, Students s){
        this.instructors = i;
        this.students = s;

    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(this.students, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
