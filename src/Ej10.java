import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		System.out.println("Introduce el primer número: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Introduce el tercer número: ");
		int num3 = sc.nextInt();

		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.print("Alguno de los números es menor a diez.");
		} else
			System.out.println("Todos los números son mayores que diez. ");
	}

}
