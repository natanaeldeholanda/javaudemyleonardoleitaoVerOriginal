package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data nascimento = new Data();
        nascimento.dia = 14;
        nascimento.mes = 12;
        nascimento.ano = 1986;

        Data casamento = new Data(12, 5, 2025);

        System.out.println(nascimento.formatar());
        System.out.println(casamento.formatar());

    }
}
