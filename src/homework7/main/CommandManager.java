package homework7.main;

import homework7.model.FamilyTree;
import homework7.model.Person;

import java.util.Scanner;

public class CommandManager {
    private FamilyTree<Person> familyTree;
    private Scanner scanner;

    public CommandManager(FamilyTree<Person> familyTree) {
        this.familyTree = familyTree;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Enter the command (add, list. sortByMame, sortByBirthYear, save. load, exit): ");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    addPerson();
                    break;

                case "list":
                    listPeople();
                    break;

                case "sortByName":
                    familyTree.sortByName();
                    listPeople();
                    break;

                case "sortByBirthYear":
                    familyTree.sortByBirthYear();
                    listPeople();
                    break;

                case "save":
                    // implement save logic
                    break;

                case "load":
                    // implement save logic
                    break;

                case "exit":
                    return;

                default:
                    System.out.println("Unknown command");
            }
        }
    }

    private void addPerson() {
        System.out.println("Enter the Name:");
        String name = scanner.nextLine();
        System.out.println("Enter year of birth:");
        int birthYear = Integer.parseInt(scanner.nextLine());

        Person person = new Person(name, birthYear);
        familyTree.addMember(person);
        System.out.println("A person has been added to the tree");
    }

    private void listPeople() {
        for (Person person : familyTree) {
            System.out.println(person.getName() + ", родился в " + person.getBirthYear());
        }
    }
}
