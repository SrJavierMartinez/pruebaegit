import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		System.out.println("1� Nota: ");
		Scanner sc = new Scanner(System.in);
		int nota1 = sc.nextInt();
		System.out.println("2� Nota: ");
		Scanner in = new Scanner(System.in);
		int nota2 = in.nextInt();
		System.out.println("3� Nota: ");
		Scanner wc = new Scanner(System.in);
		int nota3 = wc.nextInt();

		int media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Nota media: " + media);
		if (media > 6) {
			System.out.println("Promocionado.");
		} else
			System.out.println("No promociona.");
	}
}