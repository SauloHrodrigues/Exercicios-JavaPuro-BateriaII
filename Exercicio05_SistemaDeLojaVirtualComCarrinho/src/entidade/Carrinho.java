package entidade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> listaDeItens;

    public Carrinho() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        listaDeItens.add(new ItemCarrinho(produto,quantidade));
    }

    public void removerProduto(Produto produto) {
        Iterator<ItemCarrinho> iterator = listaDeItens.iterator();
        while (iterator.hasNext()) {
            ItemCarrinho i = iterator.next();
            if (i.getProduto().equals(produto)) {
                iterator.remove();
            }
        }
    }


    public double calcularTotal() {
        double totalDaCompra = 0.0;
        for (ItemCarrinho i : listaDeItens){
            totalDaCompra += i.getSubTotal();
        }
        return totalDaCompra;
    }

    public void finalizarCompra() {
        for(ItemCarrinho i:listaDeItens){
            i.getProduto().diminuirEstoque(i.getQuantidade());
        }
    }

    public void exibirProdutos(){
        for(ItemCarrinho i: listaDeItens){
            System.out.println(i);
        }
    }
}
