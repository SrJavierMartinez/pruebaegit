import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		System.out.println("Introduce el primer n�mero: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo n�mero: ");
		int num2 = sc.nextInt();

		System.out.println("Introduce el tercer n�mero: ");
		int num3 = sc.nextInt();

		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.print("Alguno de los n�meros es menor a diez.");
		} else
			System.out.println("Todos los n�meros son mayores que diez. ");
	}

}
