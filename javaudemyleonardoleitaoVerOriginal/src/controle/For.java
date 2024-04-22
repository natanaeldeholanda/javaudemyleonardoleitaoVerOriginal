package controle;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota;
        int indice;
        int forIndex;

        for (indice = 0; indice < 3; indice++) {
            nota = teclado.nextDouble();
            somaDasNotas += nota;
        }

        teclado.close();
        System.out.printf("A média é: %.2f", somaDasNotas / 3);
        System.out.println();

        for (forIndex = 0; forIndex < 10; forIndex++) {
            System.out.println(forIndex);
        }
        System.out.println();
        for (forIndex = 1; forIndex <= 10; forIndex++) {
            System.out.println(forIndex);
        }
    }
}
