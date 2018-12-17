import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {

		System.out.println("Introduce un número: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num < 10) {
			System.out.print("Tiene un dígito.");
		} else if (num < 100) {
			System.out.print("Tiene dos dígitos.");
		} else if (num < 1000) {
			System.out.println("Tiene tres dígitos.");
		} else
			System.out.println("Error.");
	}
}
