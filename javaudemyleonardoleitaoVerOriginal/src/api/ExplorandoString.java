package api;

public class ExplorandoString {
    public static void main(String[] args) {
        String nome = "Natan" + "ael";

        //Alguns métodos
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());
        System.out.println(nome.substring(0,5));
        System.out.println(nome.indexOf('l'));
        System.out.println(nome.charAt(5));
        System.out.println(nome.equalsIgnoreCase("natanael"));
        System.out.println(nome.startsWith("Nat"));
        System.out.println(nome.isEmpty());
        System.out.println(nome.concat(" Holanda"). concat(" Oliveira"));

        //String é imutável
        System.out.println(nome);
        nome = nome.toUpperCase().substring(0,5).concat("Oliveira");
        System.out.println(nome);


    }
}
