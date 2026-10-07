package Exercise_5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx5 extends Application {
    TextField txfNamesToAdd;
    TextArea txfListOfNames;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
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
        Label lblName = new Label(" Name:");
        pane.add(lblName, 0, 0);


        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        txfNamesToAdd = new TextField();
        pane.add(txfNamesToAdd, 0, 1, 1, 1);
        //Fix: Use a TextArea Instead of TextField
        //A TextField only supports a single line of text, even if you try to append \n (newline characters).
        txfListOfNames = new TextArea();
        pane.add(txfListOfNames, 0, 3, 1, 3);
        txfListOfNames.setEditable(false);

        // add a button that "Add" to the pane (at col=2, row=1)
        Button btnAdd = new Button(" Add ");
        pane.add(btnAdd, 0, 2);
        GridPane.setMargin(btnAdd, new Insets(10, 10, 0, 10));
        // connect a method to the button
        btnAdd.setOnAction(event -> this.addName());

    }

    private void addName() {
        String name = txfNamesToAdd.getText().trim();
        if(!name.isEmpty()) {
            txfListOfNames.appendText(name + "\n");
            txfNamesToAdd.clear();
        }
    }

}
