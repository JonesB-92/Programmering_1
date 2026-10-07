package guifx;

import application.controller.Controller;
import application.model.Company;
import application.model.Employee;
import javafx.beans.value.ChangeListener;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class EmployeeWindow extends Stage {
	private Employee employee;


	public EmployeeWindow(String title, Employee employee) {
		initStyle(StageStyle.UTILITY);
		initModality(Modality.APPLICATION_MODAL);
		setResizable(false);

		this.employee = employee;

		setTitle(title);
		GridPane pane = new GridPane();
		initContent(pane);

		Scene scene = new Scene(pane);
		setScene(scene);
	}

	public EmployeeWindow(String title) {
		this(title, null);
	}

	// -------------------------------------------------------------------------

	private TextField txfName, txfWage, txfEmploymentYear;
	private CheckBox chbCompany;
	private ComboBox<Company> cbbCompany;
	private Label lblError;

	private void initContent(GridPane pane) {
		pane.setPadding(new Insets(10));
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setGridLinesVisible(false);

		Label lblName = new Label("Name");
		pane.add(lblName, 0, 0);

		txfName = new TextField();
		pane.add(txfName, 0, 1);
		txfName.setPrefWidth(200);

		Label lblHours = new Label("Hourly Wage");
		pane.add(lblHours, 0, 2);

		txfWage = new TextField();
		pane.add(txfWage, 0, 3);

		Label lblEmploymentYear = new Label("Employment Year");
		pane.add(lblEmploymentYear, 0, 4);

		txfEmploymentYear = new TextField();
		pane.add(txfEmploymentYear, 0, 5);

		chbCompany = new CheckBox("Company");
		pane.add(chbCompany, 0, 6);
		ChangeListener<Boolean> listener = (ov, oldValue, newValue) -> selectedCompanyChanged(newValue);
		chbCompany.selectedProperty().addListener(listener);

		cbbCompany = new ComboBox<>();
		pane.add(cbbCompany, 0, 7);
		cbbCompany.getItems().addAll(Controller.getCompanies());
		cbbCompany.setDisable(true);

		Button btnCancel = new Button("Cancel");
		pane.add(btnCancel, 0, 8);
		GridPane.setHalignment(btnCancel, HPos.LEFT);
		btnCancel.setOnAction(event -> cancelAction());

		Button btnOK = new Button("OK");
		pane.add(btnOK, 0, 8);
		GridPane.setHalignment(btnOK, HPos.RIGHT);
		btnOK.setOnAction(event -> okAction());

		lblError = new Label();
		pane.add(lblError, 0, 9);
		lblError.setStyle("-fx-text-fill: red");

		initControls();
	}

	private void initControls() {
		if (employee != null) {
			txfName.setText(employee.getName());
			txfWage.setText("" + employee.getWage());
			txfEmploymentYear.setText("" + employee.getEmploymentYear());
			if (employee.getCompany() != null) {
				chbCompany.setSelected(true);
				cbbCompany.getSelectionModel().select(employee.getCompany());
			} else {
				cbbCompany.getSelectionModel().select(0);
			}
		} else {
			txfName.clear();
			txfWage.clear();
			cbbCompany.getSelectionModel().select(0);
		}
	}

	// -------------------------------------------------------------------------

	private void cancelAction() {
		hide();
	}

	private void okAction() {
		String name = txfName.getText().trim();
		if (name.length() == 0) {
			lblError.setText("Name is empty");
		} else {
			int wage = -1;
			try {
				wage = Integer.parseInt(txfWage.getText().trim());
			} catch (NumberFormatException ex) {
				// do nothing
			}
			if (wage < 0) {
				lblError.setText("Wage is not a positive number");
			} else {

				int employmentYear = -1;
				try {
					employmentYear = Integer.parseInt(txfEmploymentYear.getText().trim());
				} catch (NumberFormatException ex) {
					// do nothing
				}

				boolean companyIsSelected = chbCompany.isSelected();
				Company newCompany = cbbCompany.getSelectionModel().getSelectedItem();

				// Call application.controller methods
				if (employee != null) {
					Controller.updateEmployee(employee, name, wage, employmentYear);
					if (companyIsSelected) {
						Controller.addEmployeeToCompany(employee, newCompany);
					} else {
						Controller.removeEmployeeFromCompany(employee, employee.getCompany());
					}
				} else {
					if (companyIsSelected) {
						Controller.createEmployee(name, wage, newCompany, employmentYear);
					} else {
						Controller.createEmployee(name, wage, employmentYear);
					}
				}
				hide();
			}
		}
	}

	// -------------------------------------------------------------------------

	private void selectedCompanyChanged(boolean checked) {
		cbbCompany.setDisable(!checked);
	}

}
