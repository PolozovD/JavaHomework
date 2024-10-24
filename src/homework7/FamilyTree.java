package homework7;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
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
}
