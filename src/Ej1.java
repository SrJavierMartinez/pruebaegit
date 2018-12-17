
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
			System.out.println("Introduce el primer número: ");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();

			System.out.println("Introduce el segundo número: ");
			Scanner in = new Scanner(System.in);
			int num2 = in.nextInt();

			int numsum = 0;
			int numdif = 0;
			int numprod = 0;
			int numdiv = 0;

			if (num1 > num2) {
				numsum = num1 + num2;
				numdif = num1 - num2;
				System.out.println("La suma es: " + numsum );
				System.out.println("La diferencia es: " + numdif);
			} else if (num1 < num2) {
				numprod = num1 * num2;
				numdiv = num2 / num1;
				System.out.println("El producto es: " + numprod);
				System.out.println("La división es: " + numdiv );
			} else
				System.out.println("Error");
		}
}
