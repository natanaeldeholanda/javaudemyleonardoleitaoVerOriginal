package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Arroz arroz = new Arroz();
        arroz.setPeso(0.250);
        Feijao feijao = new Feijao();
        feijao.setPeso(0.280);
        Carne carne = new Carne();
        carne.setPeso(0.250);
        Sorvete sorvete = new Sorvete();
        sorvete.setPeso(0.140);
        Pessoa natanael = new Pessoa(80.7);
        natanael.comer(arroz, feijao, carne); //Atribuindo através do Varargs, implementado na classe pessoa;
        natanael.comer(sorvete);
        System.out.println(natanael.getPeso() + "Kg");
    }
}
