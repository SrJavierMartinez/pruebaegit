import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;

		System.out.println("Coordenada X: ");
		x = sc.nextInt();
		System.out.print("Coordenada Y: ");
		y = sc.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("Se encuentra en el primer cuadrante.");
		} else {
			if (x < 0 && y > 0) {
				System.out.println("Se encuentra en el segundo cuadrante.");
			} else {
				if (x < 0 && y < 0) {
					System.out.println("Se encuentra en el tercer cuadrante.");
				} else {
					System.out.println("Se encuentra en el cuarto cuadrante.");
				}
			}
		}
	}
}
