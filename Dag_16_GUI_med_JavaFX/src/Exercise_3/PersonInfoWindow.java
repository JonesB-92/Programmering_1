package Exercise_3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class PersonInfoWindow extends Stage {

    public PersonInfoWindow(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final CheckBox cbxSenior = new CheckBox();
    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();


    private Person actualPerson = null;

    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblNavn = new Label("Navn:");
        pane.add(lblNavn, 0, 0);
        pane.add(txfName, 1, 0);

        Label lblTitel = new Label("Titel:");
        pane.add(lblTitel, 0, 1);
        pane.add(txfTitle, 1, 1);

        // Add a checkbox
        pane.add(cbxSenior, 0, 2);
        cbxSenior.setText("Senior ");

        HBox buttonBox = new HBox(20);
        pane.add(buttonBox, 0, 4, 2, 1);
        buttonBox.setPadding(new Insets(10, 10, 0, 10));
        buttonBox.setAlignment(Pos.CENTER);

        Button btnCancel = new Button("Ok");
        buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.okAction());

        Button btnOK = new Button("Cancel");
        buttonBox.getChildren().add(btnOK);
        btnOK.setOnAction(event -> this.cancelAction());
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void cancelAction() {
        txfName.clear();
        txfName.requestFocus();
        txfTitle.clear();
        actualPerson = null;
        PersonInfoWindow.this.hide();
    }

    private void okAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        boolean isSenior = cbxSenior.isSelected();

        if (!name.isEmpty() && !title.isEmpty()) {
            name = name.substring(0, 1).toUpperCase() + txfName.getText().trim().substring(1);
            title = title.substring(0, 1).toUpperCase() + txfTitle.getText().trim().substring(1);

            actualPerson = new Person(name, title, isSenior);
//            persons.add(actualPerson);
//            lvwPersons.getItems().setAll(persons);

            txfName.clear();
            txfTitle.clear();
            cbxSenior.setSelected(false);
            txfName.requestFocus();
            PersonInfoWindow.this.hide();
        } else {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Create person failed");
            alert.setHeaderText("Information missing");
            alert.setContentText("Type name and title");
            alert.show();
        }
    }

    // -------------------------------------------------------------------------

    public Person getActualPerson() {
        return actualPerson;
    }

    public void clearActualPerson() {
        actualPerson = null;
    }
}
