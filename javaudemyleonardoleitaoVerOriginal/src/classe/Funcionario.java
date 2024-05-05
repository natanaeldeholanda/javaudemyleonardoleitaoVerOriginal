package classe;

public class Funcionario {
    String nome;
    String setor;
    double salario;

    Funcionario(String nome, String setor, double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    String imprimirSalario() {
        return String.format("Me chamo %s, estou no setor %s e tenho um salario de R$%.2f", nome, setor, salario);
    }
}
