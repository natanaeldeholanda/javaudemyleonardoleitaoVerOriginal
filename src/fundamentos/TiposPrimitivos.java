package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {

		// Tipo primitivo booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("Tipo primitivo booleano -> %b e %b.\n", bo1, bo2);

		//Tipo primitivo caracter; a atribuição é em aspas simples -> ';
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050'; // declaração de carater da tabela unicode;
		System.out.printf("Tipo primitivo caracter -> %c, %c e %c.\n", c1, c2, c3);

		/*
		 * Tipos primitivos inteiros -> byte, short, int e long abaixo segue os valores
		 * máximos que podem ser declarados por cada tipo primitivo inteiro;
		 */
		byte b = 127;
		short s = 32_767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L; // Ao final da declaração do long, colocar o L maiúsculo antes do ;
		System.out.printf("Tipos primitivos inteiros -> %d, %d, %d e %d.\n", b, s, i, l);
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));

		//Tipos primitivos reais (ponto flutuante)
		float f = 3.1416F; // Ao final da declaração do float, colocar o F maiúsculo antes do ;
		double d = 2.45;
		System.out.printf("Tipos primitivos reais -> %.4f e %.2f.\n", f, d);
	}

}
