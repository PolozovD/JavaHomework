package homework7;

import homework7.model.FamilyTree;
import homework7.model.Person;
import homework7.service.FileOperations;
import homework7.service.FileOperationsImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();

        Person boris = new Person("Boris", 1923);
        Person nina = new Person("Aleksandra", 1926);
        Person natalie = new Person("Natalie", 1954);

        natalie.setMother(nina);
        natalie.setFather(boris);
        boris.addChild(natalie);
        nina.addChild(natalie);

        familyTree.addMember(boris);
        familyTree.addMember(nina);
        familyTree.addMember(natalie);

        System.out.println("Sort by name");
        familyTree.sortByName();
        for (Person person : familyTree) {
            System.out.println(person.getName() + " - " + person.getBirthYear());
        }

        System.out.println("/nSort by birthday");
        familyTree.sortByBirthYear();
        for (Person person : familyTree) {
            System.out.println(person.getName() + " - " + person.getBirthYear());
        }

        FileOperations<Person> fileOps = new FileOperationsImpl<>();

        try {
            fileOps.saveToFile(familyTree, "familyTree.dat");
            System.out.println("Family tree saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FamilyTree<Person> loadedFamilyTree = null;
        try {
            loadedFamilyTree = fileOps.loadFromFile("familyTree.dat");
            System.out.println("Family tree loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (loadedFamilyTree != null) {
            System.out.println("\nLoaded persons:");
            for (Person person : loadedFamilyTree) {
                System.out.println("Loaded person: " + person.getName() + ", born in " + person.getBirthYear());
            }
        }

    }
}


