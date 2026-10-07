package Exercise_3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiTwoWindows extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Person administration");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        personWindow = new PersonInfoWindow("Person information", stage);
    }

    // -------------------------------------------------------------------------

    private final TextField txfResult = new TextField();
    private PersonInfoWindow personWindow;
    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 0);
        // add a listView to the pane(at col=1, row=1)
        pane.add(lvwPersons, 0, 1);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);

        Button btnAddPerson = new Button("Add person");
        pane.add(btnAddPerson, 1, 1);
        GridPane.setMargin(btnAddPerson, new Insets(10, 10, 0, 10));
        btnAddPerson.setOnAction(event -> this.createPersonAction());

        this.initPersons();

        lvwPersons.getItems().setAll(persons);

    }

    // -----------------------------------------------------
    // Button action
    private void createPersonAction() {
        personWindow.showAndWait();

        // wait for the dialog to close ...

        if (personWindow.getActualPerson() != null) {
            Person person = personWindow.getActualPerson();
            persons.add(person);
            lvwPersons.getItems().setAll(persons);

//            txfResult.setText(person.toString());
        }
    }

    private void initPersons() {
        persons.add(new Person("Esben", "Lektor", true));
        persons.add(new Person("Eva", "Jurist", true));
        persons.add(new Person("Lene", "Sekretær", true));
        persons.add(new Person("Tine", "Hestepige", false));

    }
}
