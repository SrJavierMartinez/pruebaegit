import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		System.out.println("Introduzca un día: ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();

		System.out.println("Introduzca un mes: ");
		int month = sc.nextInt();

		System.out.println("Introduzca un año: ");
		int year = sc.nextInt();

		if (month == 12 && day == 25) {
			System.out.println("Es Navidad!");
		} else
			System.out.println("No es Navidad.");
	}
}