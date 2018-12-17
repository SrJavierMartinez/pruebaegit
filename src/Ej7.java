import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numPreg, numAciert;

		System.out.print("Total de preguntas del examen: ");
		numPreg = sc.nextInt();
		System.out.print("Total de aciertos: ");
		numAciert = sc.nextInt();

		int porc = numAciert * 100 / numPreg;

		if (porc >= 90) {
			System.out.print("Nivel máximo.");
		} else {
			if (porc >= 75) {
				System.out.print("Nivel medio.");
			} else {
				if (porc >= 50) {
					System.out.print("Nivel regular.");
				} else {
					System.out.print("Fuera de nivel.");
				}
			}
		}
	}
}