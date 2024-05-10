package colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetConjuntoBaguncado {
    public static void main(String[] args) {
        Set conjunto = new HashSet();
        conjunto.add("A");
        conjunto.add("Texto");
        conjunto.add(1);
        conjunto.add(3.14);
        conjunto.add(false);
        System.out.println("Adicionado: ");
        System.out.println(conjunto.add(1));
        System.out.println(conjunto.add(10));
        System.out.println("Mostrar tamanho do Set: " + conjunto.size());

        System.out.println("Removendo um conjunto: " + conjunto.remove("Texto"));
        System.out.println("Mostrar tamanho do Set após remoção: " + conjunto.size());

        System.out.println("Contains... ");
        System.out.println(conjunto.contains("Texto"));
        System.out.println(conjunto.contains(1));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        conjunto.retainAll(nums);
        System.out.println("Tamanho do conjunto após remover todos os não contidos: " + conjunto.size());

        conjunto.clear(); // Limpando o conjunto
        System.out.println(conjunto.isEmpty());
    }
}
