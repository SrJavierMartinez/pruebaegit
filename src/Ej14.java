import java.util.Scanner;

public class Ej14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Primer valor: ");
		num1 = sc.nextInt();

		System.out.println("Segundo valor: ");
		num2 = sc.nextInt();

		System.out.println("Tercer valor: ");
		num3 = sc.nextInt();

		System.out.println("Rango de variaciones: ");

		if (num1 < num2 && num1 < num3) {
			System.out.println(num1);
		} else {
			if (num2 < num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
		}
		System.out.print("-");
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		} else {
			if (num2 > num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
		}
	}
}