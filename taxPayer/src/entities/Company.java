package entities;

public class Company extends TaxPayer{
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {
		if(numberOfEmployees > 10) {
			return 0.14 * getAnnualIncome();
		}
		return 0.16 * getAnnualIncome();
	}
}
