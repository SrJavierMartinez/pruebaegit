import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		System.out.println("Introduce un n�mero: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num < 10) {
			System.out.print("Tiene un d�gito.");
		} else if (num < 100) {
			System.out.print("Tiene dos d�gitos.");
		} else
			System.out.println("Error.");
	}
}