package ClothingStore;

import java.time.LocalDateTime;
import java.util.List;

public class HistoricoCompras {
    private List<Produto> produtosComprados;
    private LocalDateTime dataDaCompra;
    private double valorTotal;

    public HistoricoCompras() {
    }

    public HistoricoCompras(List<Produto> produtosComprados, LocalDateTime dataDaCompra, double valorTotal) {
        this.produtosComprados = produtosComprados;
        this.dataDaCompra = dataDaCompra;
        this.valorTotal = valorTotal;
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(List<Produto> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

    public LocalDateTime getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(LocalDateTime dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}