import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
		System.out.println("Introduce un n�mero: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.println("Introduce otro n�mero: ");
		int num2 = sc.nextInt();

		System.out.println("Introduce otro n�mero: ");
		int num3 = sc.nextInt();

		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.print("Todos los n�meros son menores a 10.");
		} else
			System.out.println("Uno o m�s n�meros son mayores que 10.");
	}
}
