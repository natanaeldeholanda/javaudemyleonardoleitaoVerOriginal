package colecoes;

import java.util.HashMap;
import java.util.Map;

public class MapMapa {

    public static void main(String[] args) {
        Map<Integer, String> aprovados = new HashMap<>();
        aprovados.put(1, "Pedro");
        aprovados.put(2, "Ana");
        aprovados.put(3, "Maria");
        aprovados.put(4, "Carlos");

        System.out.println(aprovados.keySet()); //Retora os valores que foram inseridos no integer;
        System.out.println(aprovados.values()); //Retorna os nomes que foram inseridos no String;
        System.out.println(aprovados.entrySet()); //Retorna os nomes e os valores;

        for (Integer key : aprovados.keySet()) {
            System.out.println(key);
        }
        for (String valores : aprovados.values()) {
            System.out.println(valores);
        }
        for(Map.Entry<Integer, String> entry : aprovados.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
