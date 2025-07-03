import entidade.Carrinho;
import entidade.Produto;

public class SistemaDeLojaVirtualComCarrinho {
    public static void main(String[] args) {
        Produto lapis= new Produto("Lapis de cor",25.00,1000);
        Produto canetaBic = new Produto("Caneta bic",10.00,1000);
        Produto borracha = new Produto("Borracha",7.50,1000);
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(lapis,10);
        carrinho.adicionarProduto(canetaBic,5);
        carrinho.adicionarProduto(borracha,25);

        carrinho.exibirProdutos();
        System.out.println("Total da Compra: "+ carrinho.calcularTotal());

        carrinho.removerProduto(lapis);

        carrinho.exibirProdutos();

        carrinho.finalizarCompra();
        System.out.println("Lapis: "+lapis);
        System.out.println("caneta: "+canetaBic);
        System.out.println("Borracha: "+borracha);
    }
}
