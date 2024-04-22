package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Acer Nitro 5";
        produto1.preco = 3599;
        Produto produto2 = new Produto("Samsung UltraBook", 4999);
        Produto.desconto = 0.08;

        System.out.println(produto1.precoComDesconto());
        System.out.println(produto2.precoComDesconto());

    }
}
