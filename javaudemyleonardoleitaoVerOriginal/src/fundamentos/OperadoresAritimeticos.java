package fundamentos;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		// Operadores -> +, -, *, /
		
		int soma = num1 + num2 + num3 + 6;
		System.out.println("Soma: " + soma);
		
		//Subitração
		int subtracao = num1 - num2 + num3;
		System.out.println("Subtração: " + subtracao);
		
		// Cuidado com a precedência (multiplicação e divisão * e /)!
		
		System.out.print("Multiplicação e divisão sem precedência: ");
		System.out.println(num1 + num3 * num2 / 2);
		System.out.println("Multiplicação e divisão com precedência: " + (num1 + num3) * num2 / 2);
		
		//Resto da divisão
		
		int restoDivisao = num3 % num2;
		System.out.println("O Resto da divisão é: " + restoDivisao);
		
	}

}
