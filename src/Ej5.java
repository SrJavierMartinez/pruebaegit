import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introduzca un valor: ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.print("Positivo.");
		} else {
			if (num < 0) {
				System.out.print("Negativo.");
			} else if (num == 0) {
				System.out.print("Nulo.");
			}
		}
	}
}
