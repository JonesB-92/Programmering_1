package Exercise_1_to_3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("50 Shapes of Grey");
        stage.setScene(scene);
        stage.show();

    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes3C(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        // Line from (70,70) to (100,70)
        Line line = new Line(10, 10, 150, 400);
        pane.getChildren().add(line);
    }

    private void drawShapes1(Pane pane) {
        // draw an arrowhead at (50,30)
        int x = 50;
        int y = 30;
        Line line1 = new Line(x, y, x + 10, y - 4);
        Line line2 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line1, line2);
        // draw an arrowhead at (25,140)
        x = 25;
        y = 140;
        Line line3 = new Line(x, y, x + 10, y - 4);
        Line line4 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line3, line4);
    }

    /*Exercise 1
    a) Make an application that draws two arrowheads at (100,75) and (100,125).*/
    private void drawShapesA(Pane pane) {
        int x = 100;
        int y = 75;
        Line line1 = new Line(x, y, x + 10, y - 4);
        Line line2 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line1, line2);

        x = 100;
        y = 125;
        Line line3 = new Line(x, y, x + 10, y - 4);
        Line line4 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line3, line4);
    }

    /*b) Add some code to make the application show a third arrowhead at (20,50).*/
    private void drawShapesB(Pane pane) {
        //Arrowhead1
        int x = 100;
        int y = 75;
        Line line1 = new Line(x, y, x + 10, y - 4);
        Line line2 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line1, line2);
        //Arrowhead2
        x = 100;
        y = 125;
        Line line3 = new Line(x, y, x + 10, y - 4);
        Line line4 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line3, line4);
        //Arrowhead3
        x = 20;
        y = 50;
        Line line5 = new Line(x, y, x + 10, y - 4);
        Line line6 = new Line(x, y, x + 10, y + 4);
        pane.getChildren().addAll(line5, line6);
    }

    /*c) Change the code, so all the arrowheads have twice the size.
    Use variables to make it easy to change the size (both horizontally and vertically) of all
    arrowheads (you can assume that all arrowheads have the same size).*/
    private void drawShapesC(Pane pane) {
        //Arrowhead1
        int x = 100;
        int y = 75;
        int size = 2;
        Line line1 = new Line(x, y, x + 10 * size, y - 4 * size);
        Line line2 = new Line(x, y, x + 10 * size, y + 4 * size);
        pane.getChildren().addAll(line1, line2);
        //Arrowhead2
        x = 100;
        y = 125;
        Line line3 = new Line(x, y, x + 10 * size, y - 4 * size);
        Line line4 = new Line(x, y, x + 10 * size, y + 4 * size);
        pane.getChildren().addAll(line3, line4);
        //Arrowhead3
        x = 20;
        y = 50;
        Line line5 = new Line(x, y, x + 10 * size, y - 4 * size);
        Line line6 = new Line(x, y, x + 10 * size, y + 4 * size);
        pane.getChildren().addAll(line5, line6);

    }

    //Exercise 2
    //Create an application like the one above, but this time with 9 lines and with a shared start point at (100,100):
    private void drawShapesD(Pane pane) {
        int x1 = 100; // start point: (x1,y1)
        int y1 = 100;
        int x2 = 20; // end point: (x2,y2)
        int y2 = 10;
        while (x2 <= 180) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            x2 += 20;
        }
    }

    private void drawShapesE(Pane pane) {
        int x1 = 20; // start point: (x1,y1)
        int y1 = 190;
        int x2 = 180; // end point: (x2,y2)
        int y2 = 10;
        while (x1 <= 180) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            x1 += 40;
            x2 -= 40;
        }
    }

    //EXERCISE 3 - Create 3 applications that draw the following figures.
    //fem linjer
    public void drawShapes3A(Pane pane) {
        int x = 180;
        int y1 = 10;
        int y2 = 190;
        // int x2 = x1; så behøver kun x
        while (x >= 20) {
            Line line = new Line(x, y1, x, y2);
            pane.getChildren().add(line);
            x -= 40;
        }
    }

    //ELLER starte fra venstre side
    public void drawShapes3Aa(Pane pane) {
        int x = 20;
        int y1 = 10;
        int y2 = 190;
        // int x2 = x1; så behøver kun x
        while (x <= 180) {
            Line line = new Line(x, y1, x, y2);
            pane.getChildren().add(line);
            x += 40;
        }
    }

    public void drawShapes3B(Pane pane) {
        int x = 20;
        int x2 = 180;
        int y = 180;
        // int y1 = y2; så behøver kun y
        while (y >= 20) {
            Line line = new Line(x, y, x2, y);
            pane.getChildren().add(line);
            y -= 40;
        }
    }

    public void drawShapes3C(Pane pane) {
        int x1 = 10;
        int x2 = 190;
        int y = 180;

        while (y >= 10) {
            Line line = new Line(x1, y, x2, y);
            pane.getChildren().add(line);
            x1 += 20;
            x2 -= 20;
            y -= 40;
        }
    }
}


