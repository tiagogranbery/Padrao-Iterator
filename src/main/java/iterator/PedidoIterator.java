package iterator;

import java.util.List;

public class PedidoIterator implements Iterator {

    private List<Pedido> pedidos;
    private int posicao = 0;

    public PedidoIterator(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public boolean hasNext() {
        return posicao < pedidos.size();
    }

    @Override
    public Pedido next() {
        return pedidos.get(posicao++);
    }
}