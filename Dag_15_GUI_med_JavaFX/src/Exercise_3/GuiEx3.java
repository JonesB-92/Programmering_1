package Exercise_3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiEx3 extends Application {
    TextField investment;
    TextField years;
    TextField monthlyInterestRate;
    TextField futureValue;

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
        Label lblInvestment = new Label(" Investment:");
        pane.add(lblInvestment, 0, 0);
        Label lblYears = new Label(" Years:");
        pane.add(lblYears, 0, 1);
        Label lblInterestRate = new Label(" Interest (%):");
        pane.add(lblInterestRate, 0, 2);
        Label lblFutureValue = new Label(" Future value:");
        pane.add(lblFutureValue, 0, 4);


        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        investment = new TextField();
        pane.add(investment, 1, 0, 1, 1);
        years = new TextField();
        pane.add(years, 1, 1, 1, 1);
        monthlyInterestRate = new TextField();
        pane.add(monthlyInterestRate, 1, 2, 2, 1);
        futureValue = new TextField();
        pane.add(futureValue, 1, 4, 1, 1);
        futureValue.setEditable(false);

        // add a button to the pane (at col=2, row=1)
        Button btnCalculate = new Button(" Calculate ");
        pane.add(btnCalculate, 1, 3);
        GridPane.setMargin(btnCalculate, new Insets(5, 10, 0, 10));

        // connect a method to the button
        btnCalculate.setOnAction(event -> this.calcFutureValue());

    }

    private void calcFutureValue() {
        int investment1 = Integer.parseInt(investment.getText().trim());
        int years1 = Integer.parseInt(years.getText().trim());
        double monthlyInterestRate1 = ((Double.parseDouble(monthlyInterestRate.getText().trim())) / 100);


        double resultat = investment1;
        for (int i = 0; i < years1 * 12; i++) {

            resultat *= (1 + monthlyInterestRate1);
        }
        //Resultat sættes ind i tekstfeltet
        futureValue.setText(resultat + "");

//        double futureValue = investment * Math.pow((1+interest), interestPeriod)
//        renters rente i kodeform
    }
}
