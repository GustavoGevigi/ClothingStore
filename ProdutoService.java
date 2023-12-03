package ClothingStore;

public class ProdutoService {
    private static Map<String, Produto> produtos = new HashMap<>();

    public void incluirProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    public List<Produto> obterListaProdutos() {
        return new ArrayList<>(produtos.values());
    }
}
