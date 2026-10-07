package Exercise_1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx1 extends Application {
    TextField txfFirstName;
    TextField txfLastName;
    TextField txfFullName;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Exercise 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

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
        Label lblName = new Label(" First name:");
        pane.add(lblName, 0, 0);
        Label lblLastName = new Label(" Last name:");
        pane.add(lblLastName, 1, 0);
        Label lblFullName = new Label(" Full name:");
        pane.add(lblFullName, 0, 2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        txfFirstName = new TextField();
        pane.add(txfFirstName, 0, 1, 1, 1);
        txfLastName = new TextField();
        pane.add(txfLastName, 1, 1, 1, 1);
        txfFullName = new TextField();
        pane.add(txfFullName, 0, 3, 2, 1);

        // add a button to the pane (at col=1, row=1)
//        Button btnUpperCase = new Button("Upper Case");
//        pane.add(btnUpperCase, 1, 1);
//        GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

        // add a button to the pane (at col=2, row=1)
        Button btnCombine = new Button(" Combine");
        pane.add(btnCombine, 1, 4);
        GridPane.setMargin(btnCombine, new Insets(10, 10, 0, 10));
        // connect a method to the button
        btnCombine.setOnAction(event -> this.combineNames());

    }

    private void combineNames() {
        String firstName = txfFirstName.getText().trim();
        String lastName = txfLastName.getText().trim();
        txfFullName.setText(firstName + " " + lastName);

    }
}
