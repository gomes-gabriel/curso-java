import java.util.Scanner;
import java.util.Locale;

public class Main{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(), y = sc.nextInt();
		System.out.printf("%d% d%n", x, y);
		
		sc.close();
	}
}