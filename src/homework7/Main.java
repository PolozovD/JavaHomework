package homework7;

import homework7.model.FamilyTree;
import homework7.model.People;
import homework7.service.FileOperations;
import homework7.service.FileOperationsImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        People boris = new People("Boris", 1923);
        People nina = new People("Aleksandra", 1926);
        People natalie = new People("Natalie", 1954);

        natalie.setMother(nina);
        natalie.setFather(boris);
        boris.addChild(natalie);
        nina.addChild(natalie);

        familyTree.addPerson(boris);
        familyTree.addPerson(nina);
        familyTree.addPerson(natalie);

        System.out.println("Sort by name");
        familyTree.sortByName();
        for (People person : familyTree) {
            System.out.println(person.getName() + " - " + person.getBirthYear());
        }

        System.out.println("/nSort by birthday");
        familyTree.sortByBirthYear();
        for (People person : familyTree) {
            System.out.println(person.getName() + " - " + person.getBirthYear());
        }

        FileOperations fileOps = new FileOperationsImpl();

        try {
            fileOps.saveToFile(familyTree, "familyTree.dat");
            System.out.println("Family tree saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FamilyTree loadedFamilyTree = null;
        try {
            loadedFamilyTree = fileOps.loadFromFile("familyTree.dat");
            System.out.println("Family tree loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (loadedFamilyTree != null) {
            for (People people : loadedFamilyTree.getPeople()) {
                System.out.println("Loaded person: " + people.getName() + ", born in " + people.getBirthYear());
            }
        }

    }
}


