import java.util.Scanner;

public class Ej15{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int counter = 0;
		int counter1 = 0;
		while (x <= 10) {
			System.out.println("Nota: ");
			int nota = sc.nextInt();
			if (nota >= 7) {
				counter = counter + 1;
			} else {
				counter1 = counter1 + 1;
			}
			x = x + 1;
		}
		System.out.println("Alumnos con nota mayor a 7: " + counter);
		System.out.println("Alumnos con nota menor a 7: " + counter1);
	}

}
