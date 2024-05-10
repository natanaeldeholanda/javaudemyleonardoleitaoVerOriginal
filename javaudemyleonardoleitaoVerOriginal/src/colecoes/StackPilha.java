package colecoes;

import java.util.Stack;

public class StackPilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("O Pequeno Príncipe");
        pilha.push("O Hobbit");
        pilha.push("Dom Quixote");
        System.out.println("Peel...");
        System.out.println(pilha.peek()); //retorna o último que foi adicionado;
        System.out.println("Pop...");
        System.out.println(pilha.pop()); //Remove o objeto no topo desta pilha;
        System.out.println("-------------");
        // Laço for pra mostrar os livros restantes
        for (String s : pilha) {
            System.out.println(s);
        }

    }
}
