package rocks.zipcode.SpringBeansLearnerLab;

public class Student extends Person implements Learner{
    private double totalStudyTime;



    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;

    }
    public double getTotalStudyTime(){
        return this.totalStudyTime;
    }
}
