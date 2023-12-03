package ClothingStore;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Produto> produtosAdicionados;
    private double valorTotal;

    public CarrinhoCompras() {
        this.produtosAdicionados = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarProduto(Produto produto) {
        produtosAdicionados.add(produto);
        valorTotal += produto.getValor();
    }

    public void removerProduto(Produto produto) {
        produtosAdicionados.remove(produto);
        valorTotal -= produto.getValor();
    }


    public void finalizarCompra() {
    }

    public List<Produto> getProdutosAdicionados() {
        return produtosAdicionados;
    }

    public void setProdutosAdicionados(List<Produto> produtosAdicionados) {
        this.produtosAdicionados = produtosAdicionados;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

