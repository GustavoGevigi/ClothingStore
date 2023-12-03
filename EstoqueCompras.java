package ClothingStore;

public class EstoqueCompras {
    private Map<Produto, Integer> estoque;

    public EstoqueCompras() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        estoque.put(produto, estoque.getOrDefault(produto, 0) + quantidade);
    }

    public boolean removerProduto(Produto produto, int quantidade) {
        int estoqueAtual = estoque.getOrDefault(produto, 0);
        if (estoqueAtual >= quantidade) {
            estoque.put(produto, estoqueAtual - quantidade);
            return true;
        } else {
            return false;
        }
    }

    public Map<Produto, Integer> getEstoque() {
        return estoque;
    }

    public void setEstoque(Map<Produto, Integer> estoque) {
        this.estoque = estoque;
    }
}

