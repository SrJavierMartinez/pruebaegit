import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Introduzca el primer n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		num2 = sc.nextInt();
		System.out.print("Introduzca el tercer n�mero: ");
		num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.print(num1);
			} else {
				System.out.println(num3);
			}

		} else {
			if (num2 > num3) {
				System.out.print(num2);
			} else {
				System.out.print(num3);
			}
		}
	}
}