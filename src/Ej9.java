import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {

		System.out.println("Introduce el primer número: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo número: ");
		int num2 = sc.nextInt();

		System.out.println("Introduce el tercer número: ");
		int num3 = sc.nextInt();

		if (num1 == num2 && num1 == num3) {
			int suma = num1 + num2;
			System.out.println("La suma del primero y segundo: " + suma);
			int prod = suma * num3;
			System.out.println("La suma del primero y segundo multiplicado por el tercero: " + prod);
		} else
			System.out.println("ERROR");
	}
}
