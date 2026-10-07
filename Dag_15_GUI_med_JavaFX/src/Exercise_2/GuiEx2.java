package Exercise_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx2 extends Application {
    private TextField txfNumber;


    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui exercise 2");
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
        Label lblName = new Label(" Number:");
        pane.add(lblName, 0, 2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        txfNumber = new TextField();
        pane.add(txfNumber, 1, 2, 1, 1);

        // add a button to the pane (at col=1, row=1)
        Button btnAdd = new Button(" Add");
        pane.add(btnAdd, 3, 1);
        GridPane.setMargin(btnAdd, new Insets(10, 10, 0, 10));

        // add a button to the pane (at col=2, row=1)
        Button btnSub = new Button(" Sub");
        pane.add(btnSub, 3, 4);
        GridPane.setMargin(btnSub, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnAdd.setOnAction(event -> this.add());

        // Connect a method to sub button
        btnSub.setOnAction(event -> this.sub());

    }

    //The method Integer.parseInt(s) takes a String s as parameter and returns an int.
    private void add() {
        String numberAsString = txfNumber.getText().trim();
        int i = Integer.parseInt(numberAsString);
        i++;
        txfNumber.setText(i + "");
    }

    private void sub() {
        //Behøver faktisk ikek at gemme i en numberAsString
        int i = Integer.parseInt(txfNumber.getText().trim());
        i--;
        txfNumber.setText(i + "");
    }
}
