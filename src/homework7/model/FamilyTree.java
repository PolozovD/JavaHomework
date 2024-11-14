package homework7.model;

import java.io.Serializable;
import java.util.*;

public class FamilyTree implements Serializable, Iterable<People>{
    private static final long serialVersionUID = 1L;

    private List<People> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(People person) {
        this.people.add(person);
    }

    public List<People> getChildren(People parent) {
        return parent.getChildren();
    }

    public People findPersonByName(String name) {
        for (People person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public List<People> getPeople() {
        return people;
    }


    @Override
    public Iterator<People> iterator() {
        return people.iterator();
    }

    public void sortByName () {
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
    }

    public void sortByBirthYear () {
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getBirthYear(), p2.getBirthYear()));
    }
}
