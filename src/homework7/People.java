package homework7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class People implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int birthYear;
    private People mother;
    private People father;
    private List<People> children;
    public People(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.children = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setMother(People mother) {
        this.mother = mother;
    }
    public void setFather(People father) {this.father = father;}
    public void addChild(People child) {this.children.add(child);}

    public List<People> getChildren() {
        return children;
    }
    public People getMother() {
        return mother;
    }
    public People getFather() {
        return father;
    }
}
