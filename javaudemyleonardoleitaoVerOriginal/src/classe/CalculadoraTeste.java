package classe;

public class CalculadoraTeste {
    public static void main(String[] args) {
    Calculadora calc = new Calculadora();
        System.out.println("Somando: " + calc.somar(10.1,6.7));
        System.out.println("Subtraindo: " + calc.subtrair(45.3,21.5));
        System.out.println("Multiplicando: " + calc.multiplicar(13,5));
        System.out.println("Dividindo: " + calc.dividir(4, 2));
        calc.acrescentar(10);
        System.out.println("Resultado: " + calc.obterResultado());
        System.out.printf("Limpando a calculadora: -> ");
        calc.limpar();
        System.out.println(calc.obterResultado());
    }
}
