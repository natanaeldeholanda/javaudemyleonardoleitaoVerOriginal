package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;
import org.w3c.dom.ls.LSOutput;

public class Filha extends Sogra {
    String segredoDoCasal = "Meu marido está quase sendo contratado como Analista";

    public static void main(String[] args) {
        Filha euMesma = new Filha();
        System.out.println("Meus pais não sabem, " + euMesma.segredoDoCasal);
        //forma correta de chamar um atributo/método protected de um pacote
        System.out.println(euMesma.segredoDeFamila);

//        Genro meuAmor = new Genro();
//        System.out.println(meuAmor.segredo);

        Sogro papai = new Sogro();
        System.out.println(papai.gostaDeCerveja);

//        Sogra mamae = new Sogra();
//        System.out.println(mamae.segredoDeFamilia);
    }
}
