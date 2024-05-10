package oo.polimorfismo;

public class Pessoa {
    //Peso em KG
    private double peso = 0;

    //Criando o método construtor

    public Pessoa(double pesoInicial){
        this.peso = pesoInicial;
    }

    public double getPeso(){
        return peso;
    }
    //Polimorfismo dinâmico com Varargs
    public void comer(Comida... comidas){
        for(Comida c : comidas){
            this.peso += c.getPeso();
        }
    }

//    //Polimorfismo estático ou Sobrecarga de método
//    public void comer(Arroz arroz){
//        this.peso += arroz.getPeso();
//    }
//    //Polimorfismo estático ou Sobrecarga de método
//    public void comer(Feijao feijao){
//        this.peso += feijao.getPeso();
//    }
//    //Polimorfismo estático ou Sobrecarga de método
//    public void comer(Sorvete sorvete){
//        this.peso += sorvete.getPeso();
//    }
}
