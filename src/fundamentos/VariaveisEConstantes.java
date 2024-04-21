package fundamentos;

import java.util.Scanner;

public class VariaveisEConstantes {

	public static void main(String[] args) {

		double raio;
		final double PI;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do raio: ");
		raio = teclado.nextDouble();

		System.out.println("Digite o valor do PI: ");
		PI = teclado.nextDouble();

		double area = PI * Math.pow(raio, 2);

		System.out.println("A área é " + area + " m².");
		System.out.printf("A área é %.2f m².\n", area);

		teclado.close();
	}

}
