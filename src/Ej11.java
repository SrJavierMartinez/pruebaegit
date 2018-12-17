import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
		System.out.println("Introduce un número: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.println("Introduce otro número: ");
		int num2 = sc.nextInt();

		System.out.println("Introduce otro número: ");
		int num3 = sc.nextInt();

		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.print("Todos los números son menores a 10.");
		} else
			System.out.println("Uno o más números son mayores que 10.");
	}
}
