package Exercise_1_NonLazy;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiListView1 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Exercise 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final CheckBox cbxSenior = new CheckBox();
    private final Button addPerson = new Button();
    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();

    private final Alert alert = new Alert(Alert.AlertType.INFORMATION);

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);
        pane.add(txfName, 1, 0);
        Label lblTitle = new Label("Title:");
        pane.add(lblTitle, 0, 1);
        pane.add(txfTitle, 1, 1);
        // add a label to the pane (at col=0, row=1)
        Label lblPersons = new Label("Persons:");
        pane.add(lblPersons, 0, 4);
        GridPane.setValignment(lblPersons, VPos.TOP);
        // add a listView to the pane(at col=1, row=1)
        pane.add(lvwPersons, 1, 4);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);

        //Add button addPerson
        addPerson.setText("Add person");
        pane.add(addPerson, 3, 3);
        addPerson.setOnAction(e -> this.addPerson());

        // Add a checkbox
        pane.add(cbxSenior, 1, 3);
        cbxSenior.setText("Senior ");

//    Exercise 2 - Extend exercise 1 to show a dialog window with a suitable message, if the Add Person button
//    is pressed, when the Name text field or the Title text field is empty.
        alert.setTitle("Adding person failed");
        alert.setHeaderText("No name and/or title typed");
        alert.setContentText("Type the name and title of the person");
        // wait for the modal dialog to close

        this.initPersons();
        lvwPersons.getItems().setAll(persons);
    }

    // -------------------------------------------------------------------------

    private void initPersons() {
        persons.add(new Person("Esben", "Lektor", true));
        persons.add(new Person("Eva", "Jurist", true));
        persons.add(new Person("Lene", "Sekretær", true));
        persons.add(new Person("Tine", "Hestepige", false));

    }

    // -------------------------------------------------------------------------

    private void addPerson() {

        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        boolean isSenior = cbxSenior.isSelected();

        if (!name.isEmpty() && !title.isEmpty()) {
            name = name.substring(0, 1).toUpperCase() + txfName.getText().trim().substring(1);
            title = title.substring(0, 1).toUpperCase() + txfTitle.getText().trim().substring(1);

            Person person = new Person(name, title, isSenior);

            //Personen skal tilføjes til vores arrayList først
            persons.add(person);
            //DEREFTER skal listview fyldes
            lvwPersons.getItems().setAll(persons);
        } else alert.show();
    }

}



