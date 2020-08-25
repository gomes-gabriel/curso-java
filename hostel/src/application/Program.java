package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] rent = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= n; i ++) {
			sc.nextLine();
			
			System.out.printf("Rent #%d:%n", i);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rent[room] = new Rent(name, email, room);
			
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for(int j = 0; j < rent.length; j ++) {
			if(rent[j] != null) {
				System.out.println(rent[j]);
			}
		}
		
		sc.close();
	}
}
