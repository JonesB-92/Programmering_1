package PairProgramming;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Car");
        stage.setScene(scene);
        stage.show();

    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);

        Car dopeAssRide = new Car(Color.BLACK, 4, 4);
        this.drawWheels(pane, dopeAssRide);
        //this.drawFrame(pane, dopeAssRide);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawWheels(Pane pane, Car car) {
        //Frame
        int carWidth = car.getWheels() * 70;
        int FrameXStart = 40;

        Rectangle carFrame = new Rectangle(FrameXStart, 175, carWidth, 60);
        carFrame.setFill(Color.WHITE);
        carFrame.setStroke(Color.BLACK);
        pane.getChildren().add(carFrame);

        Rectangle carFrame1 = new Rectangle(FrameXStart * 2, 115, carWidth - 100, 60);
        carFrame1.setFill(Color.WHITE);
        carFrame1.setStroke(Color.BLACK);
        pane.getChildren().add(carFrame1);


        //Wheels
        int centerX = 75;
        for (int i = 0; i < car.getWheels(); i++) {
            Circle circle = new Circle(centerX, 250, 20);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            pane.getChildren().add(circle);
            centerX += 70;
        }
    }

   /* public void drawFrame(Pane pane, Car car) {
        // Rectangle, upper left corner at (100,40), width 75, height 25
        int length = Math.max(car.getWheels() * 68, car.getDoors() * 40);
        int height = 60;

        Rectangle carFrame = new Rectangle(40, 200 - height, length, height);
        carFrame.setFill(Color.WHITE);
        carFrame.setStroke(Color.BLACK);
        pane.getChildren().add(carFrame);
    }*/
}
