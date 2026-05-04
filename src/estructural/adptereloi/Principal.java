package estructural.adptereloi;

public class Principal {
    public static void main(String[] args) {
        StripeAPI stripeAPI = new StripeAPI();

        PasarelaPago pasarela = new StripeAdapter(stripeAPI);

        PedidoService servicio = new PedidoService(pasarela);

        servicio.pagarPedido(25.50);
    }
}
