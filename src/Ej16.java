import java.util.Scanner;

public class Ej16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int x = 1;
		float sum = 0;
		float alt, prom;

		System.out.println("Número de personas: ");
		n = sc.nextInt();

		while (x <= n) {
			System.out.println("Altura: ");
			alt = sc.nextFloat();
			sum = sum + alt;
			x = x + 1;
		}
		prom = sum / n;
		System.out.println("Altura media: " + prom);
	}
}
