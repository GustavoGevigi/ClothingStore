package ClothingStore;

public class PedidoService {
    private static Map<LocalDateTime, Pedido> pedidos = new HashMap<>();

    public void incluirPedido(Pedido pedido) {
        pedidos.put(pedido.getDataPedido(), pedido);
    }

    public List<Pedido> obterListaPedidos() {
        return new ArrayList<>(pedidos.values());
    }
}
