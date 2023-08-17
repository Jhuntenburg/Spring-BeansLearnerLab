package rocks.zipcode.SpringBeansLearnerLab;

import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    List<PersonType> personList;

    public People(List<PersonType> personsList){
        this.personList = personsList;
    }
    public People(PersonType... p){
        this.personList = Arrays.asList(p);
    }
    public void add(PersonType p){
        personList.add(p);
    }

    public void remove(PersonType p){
        personList.remove(p);
    }
    public int size(){
        return personList.size();
    }
    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> p){
        for (PersonType person :p) {
            personList.add(person);
        }

    }

    public PersonType findById(long id) {
        for (PersonType person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
            return null;
    }

    public List<PersonType> findAll(){
        return this.personList;
    }


}
