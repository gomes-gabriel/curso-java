package application;

public class Program {

	public static void main(String[] args) {
		String[] vect = {"Maria", "Bob"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------------------------------------");
		
		//for(tipo apelido : obj (iteravel)) { <comandos>;}
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
