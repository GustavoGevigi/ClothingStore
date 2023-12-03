package ClothingStore;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private LocalDateTime dataPedido;
    private double valorTotal;

    private CadastroUsuario cadastroUsuario;

    public Pedido() {
    }

    public Pedido(List<Produto> produtos, LocalDateTime dataPedido, double valorTotal, CadastroUsuario cadastroUsuario) {
        this.produtos = produtos;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
        this.cadastroUsuario = cadastroUsuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public CadastroUsuario getCadastroUsuario() {
        return cadastroUsuario;
    }

    public void setCadastroUsuario(CadastroUsuario cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }
}

