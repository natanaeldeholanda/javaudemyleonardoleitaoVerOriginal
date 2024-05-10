package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Genro {
    private String segredo = "Minha sogra fala demais";

    public static void main(String[] args) {
        Genro euMesmo = new Genro();
        System.out.println("Nunca falarei... " + euMesmo.segredo);

        //Estão no mesmo pacote, ou seja, public ou default no método ou atributo;
        Filha meuAmor = new Filha();
        System.out.println(meuAmor.segredoDoCasal);
        //Estão no mesmo pacote, ou seja, public ou default no método ou atributo;
        Sogro sograo = new Sogro();
        System.out.println(sograo.gostaDeCerveja);

//        Sogra sogruinha = new Sogra();
//        System.out.println(sogruinha)
    }

}
