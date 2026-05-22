package iterator;

import java.util.ArrayList;
import java.util.List;

public class ListaPedidos {

    private List<Pedido> pedidos =
            new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public Iterator criarIterator() {
        return new PedidoIterator(pedidos);
    }
}