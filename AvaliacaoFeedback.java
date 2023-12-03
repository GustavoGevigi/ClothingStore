package ClothingStore;

import java.time.LocalDateTime;

public class AvaliacaoFeedback {
    private String foto;
    private String nome;
    private LocalDateTime dataDaCompra;
    private double valorTotal;
    private CadastroUsuario cadastroUsuario;
    public AvaliacaoFeedback() {
    }

    public AvaliacaoFeedback(String foto, String nome, LocalDateTime dataDaCompra, double valorTotal, CadastroUsuario cadastroUsuario) {
        this.foto = foto;
        this.nome = nome;
        this.dataDaCompra = dataDaCompra;
        this.valorTotal = valorTotal;
        this.cadastroUsuario = cadastroUsuario;
    }

    public void fornecerFeedback(String feedback) {
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public CadastroUsuario getCadastroUsuario() {
        return cadastroUsuario;
    }

    public void setCadastroUsuario(CadastroUsuario cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }
}

