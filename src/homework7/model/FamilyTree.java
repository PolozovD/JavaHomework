package homework7.model;

import java.io.Serializable;
import java.util.*;

public class FamilyTree<T> implements Serializable, Iterable<T>{
    private static final long serialVersionUID = 1L;

    private List<T> members;

    public FamilyTree() {
        this.members = new ArrayList<>();
    }

    public void addMember(T member) {
        this.members.add(member);
    }

    public List<T> getMember(T member) {
        return members;
    }



//    public People findPersonByName(String name) {
//        for (People person : people) {
//            if (person.getName().equals(name)) {
//                return person;
//            }
//        }
//        return null;
//    }
//
//    public List<People> getPeople() {
//        return people;
//    }


    @Override
    public Iterator<T> iterator() {
        return members.iterator();
    }
    public void sortByName() {
        Collections.sort(members, (p1, p2) -> p1.toString().compareTo(p2.toString()));
    }
    public void sortByBirthYear() {
        if (members.get(0) instanceof Person) {
            Collections.sort(members, (p1, p2) -> Integer.compare(((Person) p1).getBirthYear(), ((Person) p2).getBirthYear()));
        }
    }
}
