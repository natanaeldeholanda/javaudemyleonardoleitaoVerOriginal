package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Maria"); //diferença para o .add é que se não adicionar, retorna false;
        fila.add("Natanael");
        System.out.println("Peek / Element..."); //Peek quando tá vazio retorna nulo, já Element retorna erro;

        System.out.println(fila.peek());
        System.out.println(fila.element());

        System.out.println("Poll / Remove... ");
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.remove());// Esse deu erro, pois não tem mais ninguém na fila o .poll retorna null;
    }
}
