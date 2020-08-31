package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		TaxPayer taxPayer;
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i ++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				taxPayer = new Individual(name, annualIncome, healthExpenditures);
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				taxPayer = new Company(name, annualIncome, numberOfEmployees);
			}
			
			list.add(taxPayer);
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0.0;
		for(TaxPayer x : list) {
			sum += x.tax();
			System.out.println(x.getName() + ": $ " + String.format("%.2f", x.tax()));	
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}
