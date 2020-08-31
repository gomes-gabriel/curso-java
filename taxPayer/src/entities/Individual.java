package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double tax() {
		if(super.getAnnualIncome() < 20000.00) {
			return 0.15 * getAnnualIncome() - 0.50 * healthExpenditures;
		}
		return 0.25 * getAnnualIncome() - 0.50 * healthExpenditures;
	}
}
