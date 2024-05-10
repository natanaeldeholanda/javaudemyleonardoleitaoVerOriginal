package oo.heranca;

public class TestDrive {
    public static void main(String[] args) {
        Carro civic = new Civic();
        civic.acelerar();
        civic.acelerarMais(30);
        System.out.println("Método da classe Civic: "+ civic.getVelocidadeAtual());

        Carro c = new Ferrari();
        c.acelerar();
        c.acelerarMais(30);
        System.out.println("Método da classe Ferrari: "+ c.getVelocidadeAtual());
    }
}
