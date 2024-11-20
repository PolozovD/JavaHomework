package Homework11.main;

import Homework11.model.FamilyTree;
import Homework11.model.Person;
import Homework11.presenter.TreePresenter;
import Homework11.service.FileOperationsImpl;
import Homework11.view.ConsoleTreeView;

public class Main {
    public static void main(String[] args) {
        FamilyTree<Person> familyTree = new FamilyTree<>();
        ConsoleTreeView view = new ConsoleTreeView();
        FileOperationsImpl<Person> fileOperations = new
                FileOperationsImpl<>();
        TreePresenter presenter = new TreePresenter(familyTree,
                view, fileOperations);
        presenter.handleUserInput();
    }
}

