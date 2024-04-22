package controle;

import java.util.Scanner;

public class WhileDeterminado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota = 0;
        int indice = 0;
        while (indice < 3){
            nota = teclado.nextDouble();
            somaDasNotas += nota;
            indice++;
        }
        teclado.close();
        System.out.printf("A média é: %.2f\n", somaDasNotas / 3);
    }
}
