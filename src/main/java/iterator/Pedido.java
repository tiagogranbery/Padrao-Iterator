package iterator;

public class Pedido {

    private String cliente;
    private String hamburguer;

    public Pedido(String cliente, String hamburguer) {
        this.cliente = cliente;
        this.hamburguer = hamburguer;
    }

    public String getCliente() {
        return cliente;
    }

    public String getHamburguer() {
        return hamburguer;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", hamburguer='" + hamburguer + '\'' +
                '}';
    }
}