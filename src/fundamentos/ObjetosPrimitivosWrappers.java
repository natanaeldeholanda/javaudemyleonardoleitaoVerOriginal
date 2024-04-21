package fundamentos;

public class ObjetosPrimitivosWrappers {

	public static void main(String[] args) {

		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		//Resultados convertendo boolean para string e mostrando a quantidade de letras.
		
		System.out.println(bo.toString().length());
		System.out.println("true".length() + "\n");
		
		//Tirando as advertências da classe
		
		System.out.println(c);
		System.out.println(bo);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

	}

}
