package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void deposit(double depositValue) {
		this.balance += depositValue;
	}
	
	public void withDraw(double withDrawValue) {
		this.balance -= (withDrawValue + 5);
	}
	
	//Account 8532, Holder: Alex Green, Balance: $ 500.00
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}