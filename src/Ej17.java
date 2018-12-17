import java.util.Scanner;

public class Ej17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int x = 1;
		int counter = 0;
		int counter1 = 0;
		float sueldo, gastos;

		System.out.println("Número de empleados de la empresa: ");
		n = sc.nextInt();
		gastos = 0;

		while (x <= n) {
			System.out.println("Sueldo de empleado: ");
			sueldo = sc.nextFloat();
			if (sueldo <= 300) {
				counter = counter + 1;
			} else {
				counter1 = counter1 + 1;
			}
			gastos = gastos + sueldo;
			x = x + 1;
		}
		System.out.println("Número de empleados con sueldo menor a 300: " + counter);
		System.out.println("Número de empleados con sueldo mayor a 300: " + counter1);
		System.out.println("Gastos totales: " + gastos);
	}
}