package Exercise_4;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiListView4 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Boys");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();

    private void initContent(GridPane pane) {
        this.initPersons();

        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 1);

        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 0);
        GridPane.setValignment(lblNames, VPos.TOP);

        pane.add(txfName, 1, 1);

        pane.add(lvwPersons, 1, 0);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);
        lvwPersons.getItems().setAll(persons);

        ChangeListener<Person> listener = (ov, o, n) -> this.personsItemSelected();
        lvwPersons.getSelectionModel().selectedItemProperty().addListener(listener);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd, 2, 1);
        btnAdd.setOnAction(event -> this.addAction());

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete, 2, 2);
        btnDelete.setOnAction(event -> this.deleteAction());
    }

    // -------------------------------------------------------------------------

    private void initPersons() {
        persons.add(new Person("Jens"));
        persons.add(new Person("Hans"));
    }

    // -------------------------------------------------------------------------
    // Selected item changed in lvwPersons

    private void personsItemSelected() {
        Person selected = lvwPersons.getSelectionModel().getSelectedItem();
        if (selected != null) {
            txfName.setText(selected.toString());
        } else {
            txfName.clear();
        }
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        String name = txfName.getText().trim();
        if (name.length() > 0) {
            Person person = new Person(name);
            persons.add(person);
            lvwPersons.getItems().setAll(persons);
            txfName.clear();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Add person");
            alert.setHeaderText("No name typed");
            alert.setContentText("Type the name of the person");
            alert.show();

            // wait for the modal dialog to close
        }
    }

    private void deleteAction() {
        int index = lvwPersons.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            persons.remove(index);
            txfName.clear();
            lvwPersons.getItems().setAll(persons);
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Delete person");
            alert.setHeaderText("No person selected");
            alert.setContentText("Select a person to be deleted");
            alert.show();

            // wait for the modal dialog to close
        }
    }
}
