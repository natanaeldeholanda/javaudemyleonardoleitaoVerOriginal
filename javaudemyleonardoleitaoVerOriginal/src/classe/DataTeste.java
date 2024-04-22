package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data nascimento = new Data(14, 12, 1986);
        Funcionario natanael = new Funcionario("Natanael de Holanda e Oliveira", "COTIC/SPS", 7500);
        System.out.println(nascimento.formatar());
        System.out.println(natanael.imprimirSalario());
    }
}
