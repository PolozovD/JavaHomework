package Homework11.view;

import Homework11.model.Person;
import Homework11.presenter.TreePresenter;

import java.util.List;

public interface TreeView {
    void displayMessage(String message);
    void displayPersons(List<Person> persons);
    String getUserInput();
    void setPresenter(TreePresenter presenter);
}
