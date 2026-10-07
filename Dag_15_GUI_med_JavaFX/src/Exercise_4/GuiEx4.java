package Exercise_4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx4 extends Application {
    private TextField txfCelsius;
    private TextField txfFahrenheit;


    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Exercise 4");
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
        Label lblCelsius = new Label(" Degrees in Celsius: ");
        pane.add(lblCelsius, 0, 0);
        Label lblFahrenheit = new Label(" Degrees in Fahrenheit: ");
        pane.add(lblFahrenheit, 0, 2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        txfCelsius = new TextField();
        pane.add(txfCelsius, 1, 0, 1, 1);
        txfFahrenheit = new TextField();
        pane.add(txfFahrenheit, 1, 2, 1, 1);


        //add a button to the pane (at col=1, row=1)
        Button btnConvertToFahrenheit = new Button(" Convert ");
        pane.add(btnConvertToFahrenheit, 1, 1);
        GridPane.setMargin(btnConvertToFahrenheit, new Insets(10, 10, 0, 10));
//
//        // add a button to the pane (at col=2, row=1)
//        Button btnSub = new Button(" Sub");
//        pane.add(btnSub, 3, 4);
//        GridPane.setMargin(btnSub, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnConvertToFahrenheit.setOnAction(event -> {
            this.convertToF();
            this.convertToC();
        });
    }

    //The formula is: F = 9/5 (AKA 1.8) *C + 32
    private void convertToF() {
        //Tjekker om den er tom inden, da den ellers slår fejl!
        if(txfCelsius.getText().isEmpty())
            return; //Gør intet her
        double fahrenheit = Double.parseDouble(txfCelsius.getText().trim()) * 1.8 + 32;
        txfFahrenheit.setText(fahrenheit + "");
    }

    private void convertToC() {
        if(txfFahrenheit.getText().trim().isEmpty())
            return;

        double celsius = (Double.parseDouble(txfFahrenheit.getText().trim()) - 32) / 1.8;
        txfCelsius.setText(celsius + "");
    }

}
