package iterator;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println(" ITERATOR - HAMBURGUERIA ");
        System.out.println("==================================");

        ListaPedidos listaPedidos =
                new ListaPedidos();

        listaPedidos.adicionarPedido(
                new Pedido("Tiago", "X-Bacon")
        );

        listaPedidos.adicionarPedido(
                new Pedido("Maria", "X-Salada")
        );

        listaPedidos.adicionarPedido(
                new Pedido("João", "Hambúrguer Artesanal")
        );

        Iterator iterator =
                listaPedidos.criarIterator();

        System.out.println("\nLista de pedidos:");

        while (iterator.hasNext()) {

            Pedido pedido =
                    iterator.next();

            System.out.println(
                    "Cliente: "
                            + pedido.getCliente()
                            + " | Pedido: "
                            + pedido.getHamburguer()
            );
        }

        System.out.println("\n==================================");
        System.out.println(" Fim da listagem ");
        System.out.println("==================================");
    }
}