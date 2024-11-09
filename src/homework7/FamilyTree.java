package homework7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
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

}
