package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {

    @Test
    void devePercorrerListaDePedidos() {

        ListaPedidos listaPedidos =
                new ListaPedidos();

        listaPedidos.adicionarPedido(
                new Pedido("Tiago", "X-Bacon")
        );

        listaPedidos.adicionarPedido(
                new Pedido("Maria", "X-Salada")
        );

        Iterator iterator =
                listaPedidos.criarIterator();

        assertTrue(iterator.hasNext());

        Pedido primeiro =
                iterator.next();

        assertEquals(
                "Tiago",
                primeiro.getCliente()
        );

        assertTrue(iterator.hasNext());

        Pedido segundo =
                iterator.next();

        assertEquals(
                "Maria",
                segundo.getCliente()
        );

        assertFalse(iterator.hasNext());
    }
}