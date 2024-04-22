package classe;

public class Desafio {
// Resposta Desafio: Tem que criar uma instância para acessar a variável que, foi criada fora do método main.
    int a = 2;

    public static void main(String[] args) {
        Desafio desafio = new Desafio();
        System.out.println(desafio.a);
    }
}
