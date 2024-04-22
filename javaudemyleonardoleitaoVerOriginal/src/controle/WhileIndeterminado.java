package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma quantidade de notas ou -1 pra sair");
        double somaDasNotas = 0;
        double nota = 0;
        int numeroNotas = 0;
        while (nota != -1) {
            nota = teclado.nextDouble();
            if (nota <= 10 && nota >= 0) {
                somaDasNotas += nota;
                numeroNotas++;
            }
        }
        teclado.close();
        System.out.println("Número de notas digitadas: " + numeroNotas);
        System.out.printf("A média é %.2f", somaDasNotas / numeroNotas);
    }
}
