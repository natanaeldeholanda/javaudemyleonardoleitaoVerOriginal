package colecoes;

import java.util.ArrayList;
import java.util.List;

public class ListLista {
    public static void main(String[] args) {
        List<String> aprovados = new ArrayList<>();
        aprovados.add("Natanael");
        aprovados.add("Jéssica");
        aprovados.add("Eduardo");
        aprovados.add("Eduardo");

        System.out.println("Get...");
        System.out.println(aprovados.get(0)); // utiliza o método get para pegar os dados via índice. No exemplo temos 4 objetos de 0 a 3;

        System.out.println("Add...");
        System.out.println(aprovados.add("Maria"));
        System.out.println("Size... " + aprovados.size());
        System.out.println("Remove...");
        System.out.println(aprovados.remove("Maria"));
        System.out.println("Size... " + aprovados.size());
        System.out.println();
        for (String nome : aprovados) {
            System.out.printf("|" + nome);
        }
    }
}
