import java.util.Scanner;

public class Ej13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int años;
		float salario;

		System.out.println("Sueldo del empleado: ");
		salario = sc.nextFloat();
		System.out.println("Años: ");
		años = sc.nextInt();

		if (salario < 500 && años > 10) {
			float aumento = salario * 0.20f;
			float total = salario + aumento;
			System.out.println("Sueldo final: " + total);
		} else {
			if (salario < 500) {
				float aumento = salario * 0.05f;
				float total = salario + aumento;
				System.out.println("Sueldo final: " + total);
			} else {
				System.out.println("Sueldo final: " + salario);
			}
		}
	}
}
