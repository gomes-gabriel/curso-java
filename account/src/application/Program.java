package application;

import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account acc = new Account(1000, "Andre", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Matheus", 0.0, 1000.00);
		
		//UPCASTING
		
		Account acc1 = new BusinessAccount(1001, "Anna", 0.0, 500.00);
		Account acc2 = bacc;
		Account sacc = new SavingsAccount(1002, "Marcela", 0.0, 0.01);

		//DOWNCASTING
		
		bacc = (BusinessAccount) acc1;
		
		// Nao eh instancia
		if(sacc instanceof BusinessAccount) {
			BusinessAccount acc3 = (BusinessAccount) sacc;
		}
	}

}
