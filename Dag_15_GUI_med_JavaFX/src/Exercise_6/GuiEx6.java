package Exercise_6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiEx6 extends Application {
    TextArea txaStudentInfo;
    TextField txfStudentName;
    TextField txfStudentAge;
    CheckBox boxIsActive;
    Button btnCreate;
    ArrayList<Student> students = new ArrayList<>(2);


    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui CLASS");
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
        Label lblStudentInfo = new Label(" Student info:");
        pane.add(lblStudentInfo, 0, 0);
        Label lblName = new Label(" Name: ");
        pane.add(lblName, 0, 11);
        Label lblAge = new Label(" Age: ");
        pane.add(lblAge, 0, 12);
        Label lblActive = new Label(" Active: ");
        pane.add(lblActive, 0, 13);

        //Fix: Use a TextArea Instead of TextField
        //A TextField only supports a single line of text, even if you try to append \n (newline characters).
        txaStudentInfo = new TextArea();
        pane.add(txaStudentInfo, 0, 1, 5, 10);
//        txaStudentInfo.setPrefRowCount(5); // Makes it approximately 5 rows tall
//        txaStudentInfo.setPrefColumnCount(20);
        txaStudentInfo.setEditable(false);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        txfStudentName = new TextField();
        pane.add(txfStudentName, 1, 11, 1, 1);
        txfStudentAge = new TextField();
        pane.add(txfStudentAge, 1, 12, 1, 1);
        boxIsActive = new CheckBox();
        pane.add(boxIsActive, 1, 13, 1, 1);

        //--------------------------------------

        //BUTTONS
        // add a button that "Inc" to the pane (at col=2, row=1)
        Button btnInc = new Button(" Inc ");
        pane.add(btnInc, 3, 12);
        GridPane.setMargin(btnInc, new Insets(10, 10, 0, 10));
        // connect a method to the button
        btnInc.setOnAction(event -> this.inc());

        //The Create button creates a Student object from the values in the input fields, shows the info
        //about the student in the text area, and clears the input fields (and disables/enables buttons).
        btnCreate = new Button(" Create ");
        pane.add(btnCreate, 0, 15);
        GridPane.setMargin(btnCreate, new Insets(10, 10, 0, 10));
        // connect a method to the button
        btnCreate.setOnAction(event -> this.createStudent());

    }

    //Since you're getting all the values from the GUI elements inside the method, you can just remove the parameters altogether:
    public Student createStudent() {
        String name = txfStudentName.getText().trim();
        int age = Integer.parseInt(txfStudentAge.getText().trim());
        boolean isActive = boxIsActive.isSelected();

        Student student1 = new Student(name, age, isActive);

        txaStudentInfo.appendText("\nName: " + name + "\n"+
                "Age: " + age + " \n" +
                "Active: " + isActive);
        txfStudentName.clear();
        txfStudentAge.clear();
//        boxIsActive.unselected?

        students.add(student1);

        //Make button unavailable
        btnCreate.setDisable(true);

        return student1;

    }


    //The method Integer.parseInt(s) takes a String s as parameter and returns an int.
    private void inc() {
        String numberAsString = txfStudentAge.getText().trim();
        int i = Integer.parseInt(numberAsString);
        i++;
        txfStudentAge.setText(i + "");
    }


    private void addStudentInfo() {
        String name = txfStudentName.getText().trim();
        if (!name.isEmpty()) {
            txaStudentInfo.appendText(name + "\n");
            txfStudentName.clear();
        }
    }

}
