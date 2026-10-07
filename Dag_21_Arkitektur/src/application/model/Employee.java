package application.model;

public class Employee {
	private String name;
	private int wage; // hourly wage
	private int employmentYear;

	// link to company class (--> 0..1)
	private Company company;

	public Employee(String name, int wage) {
		this.name = name;
		this.wage = wage;
	}

	public Employee(String name, int wage, int employmentYear){
		this.name = name;
		this.wage = wage;
		this.employmentYear = employmentYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getEmploymentYear() {
		return employmentYear;
	}

	public void setEmploymentYear(int employmentYear) {
		this.employmentYear = employmentYear;
	}

	@Override
	public String toString() {
		return name + " (kr " + wage + ")";
	}

	// -----------------------------------------------------------------------------

	public Company getCompany() {
		return company;
	}

	/**
	 * Sets the company as this employees company, if they aren't connected 
	 * 
	 * @param company
	 */
	public void setCompany(Company company) {
		//Tjekker først, at company ikke er det samme som det nye company vi sætter den til:
		if (this.company != company) {
			//HVIS denne employee's company ikke er tomt/null, dvs. hvis den HAR en company, så skal employee fjernes fra
			//dette company
			if (this.company != null) {
				this.company.removeEmployee(this);
			}

			//NU SETTER vi!! Præcis som vi normalt gør.
			this.company = company;
			//Og er company ikke tom/null, så skal den nye virksomhed vide, at den har fået en ny employee automatisk!
			if (company != null)
				company.addEmployee(this);
		}
	}


	// -----------------------------------------------------------------------------

	/**
	 * Returns the weekly salary of this employee.
	 */
	public int weeklySalary() {
		int salary = wage * company.getHours();
		return salary;
	}

}
