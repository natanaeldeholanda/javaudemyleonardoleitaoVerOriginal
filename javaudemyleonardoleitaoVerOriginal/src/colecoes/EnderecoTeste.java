package colecoes;

public class EnderecoTeste {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Loop Infinito", "Altos", 123);
        Endereco endereco2 = new Endereco("Rua Loop Infinito", "Altos", 123);
        Endereco endereco3 = new Endereco("Rua Soriano Albuquerque", "SPS", 230);

        System.out.println(endereco1 == endereco2);
        System.out.println(endereco1.equals(endereco2));
    }
}
