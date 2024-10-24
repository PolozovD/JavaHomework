package homework7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        People boris = new People("Boris", 1923);
        People nina = new People("Nina", 1926);
        People natalie = new People("Natalie", 1954);

        natalie.setMother(nina);
        natalie.setFather(boris);
        boris.addChild(natalie);
        nina.addChild(natalie);

        familyTree.addPerson(boris);
        familyTree.addPerson(nina);
        familyTree.addPerson(natalie);
        List<People> johnsChildren = familyTree.getChildren(boris);

        for (People child : johnsChildren) {
            System.out.println("John's child: " + child.getName());
        }
    }

}
