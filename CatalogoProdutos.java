package ClothingStore;

public class CatalogoProdutos {
    private String foto;
    private String nome;
    private double valor;
    private int quantidadeEmEstoque;

    public CatalogoProdutos() {
    }

    public CatalogoProdutos(String foto, String nome, double valor, int quantidadeEmEstoque) {
        this.foto = foto;
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}

