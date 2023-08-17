package rocks.zipcode.SpringBeansLearnerLab;

public class Person {
    private final Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
//    public Person(){}


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
