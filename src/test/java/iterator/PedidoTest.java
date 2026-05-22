package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveCriarPedido() {

        Pedido pedido =
                new Pedido("Tiago", "X-Bacon");

        assertEquals(
                "Tiago",
                pedido.getCliente()
        );

        assertEquals(
                "X-Bacon",
                pedido.getHamburguer()
        );
    }
}