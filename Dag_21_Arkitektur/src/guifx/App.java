package guifx;

import application.controller.Controller;
import application.model.Company;
import javafx.application.Application;

public class App {

	public static void main(String[] args) {
		initStorage();
		Application.launch(StartWindow.class);
	}
	/**
	 * Initializes the storage with some objects.
	 */
	public static void initStorage() {
		Company c1 = Controller.createCompany("IBM", 37);
		Company c2 = Controller.createCompany("AMD", 40);
		Controller.createCompany("SLED", 45);
		Controller.createCompany("Vector", 32);

		Controller.createEmployee("Bob Dole", 210, c2, -1);
		Controller.createEmployee("Alice Schmidt", 250, c1, 1999);
		Controller.createEmployee("George Down", 150, c2, 2005);
		Controller.createEmployee("Test Person", 150, c2, 2019);

		Controller.createEmployee("Rita Uphill", 300);

		Controller.createEmployee("Oliver Horesen", 80, c1, 2025);
	}

}
