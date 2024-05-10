package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class SetConjuntoComportado {
    public static void main(String[] args) {
        Set<String> aprovados = new TreeSet<>();
        aprovados.add("João");
        aprovados.add("Rafael");
        aprovados.add("Juliana");
        aprovados.add("Maria");

        for (String nomes : aprovados) {
            System.out.println(nomes);
        }
    }
}
/*
LinkedHashSet -> Imprime na ordem que foi inserido os dados;
TreeSet -> Imprime na ordem alfabética
 */