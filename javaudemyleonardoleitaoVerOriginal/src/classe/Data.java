package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    // CONSTRUTOR PADRÃO
    Data(){

    }

    Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    String formatar() {
        return String.format("Usando String.format: " + "%d/%d/%d", dia, mes, ano);
    }
}
