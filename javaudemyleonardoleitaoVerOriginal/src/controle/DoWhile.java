package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota;
        int numeroDeNotas = 0;

        do {
            nota = teclado.nextDouble();

            if (nota <= 10 && nota >= 0) {
                somaDasNotas += nota;
                numeroDeNotas++;
            }
        } while (nota != -1);

        teclado.close();
        System.out.printf("A média é: %.2f ", somaDasNotas / numeroDeNotas);
    }
}
