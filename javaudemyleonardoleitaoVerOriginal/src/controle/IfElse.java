package controle;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = teclado.nextInt();
        if (nota >= 6 && nota <= 10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        teclado.close();
    }

}
