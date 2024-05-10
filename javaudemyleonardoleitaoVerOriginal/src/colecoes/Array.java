package colecoes;

public class Array {
    public static void main(String[] args) {
        double[] notasJoao = {7.0, 8.7, 6.2, 4.9, 9.7}; // Criação de um array de 5 posições
        double[] notasPedro = new double [5]; // outra forma de criar array
        notasPedro[0] = 7.0;
        notasPedro[1] = 8.7;
        notasPedro[2] = 6.2;
        notasPedro[3] = 4.9;
        notasPedro[4] = 9.7;

        double totalNotasJoao = 0;
//        for (int i = 0; i < notasJoao.length; i++) {
//            totalNotasJoao += notasJoao[i];
//        }
        //Usando forEach
        for(double nota : notasJoao) {
            totalNotasJoao += nota;
        }

        double totalNotasPedro = 0;
        //Usando forEach
        for(double nota : notasPedro){
            totalNotasPedro += nota;
        }
//        for (int i = 0; i < notasPedro.length; i++) {
//            totalNotasPedro += notasPedro[i];
//        }
        double mediaJoao = totalNotasJoao / notasJoao.length;
        double mediaPedro = totalNotasPedro / notasPedro.length;
        System.out.println(mediaJoao);
        System.out.println(mediaPedro);
    }
}
