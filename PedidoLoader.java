package ClothingStore;

public class PedidoLoader {
    public static List<Pedido> loadPedidos(String filePath) throws IOException {
        List<Pedido> pedidos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                LocalDateTime dataPedido = LocalDateTime.parse(data[0]);

                // Carregar produtos do pedido (pode ser outro loader)
                List<Produto> produtos = ProdutoLoader.loadProdutos(data[1]);

                pedidos.add(new Pedido(dataPedido, produtos));
            }
        }
        return pedidos;
    }
}
