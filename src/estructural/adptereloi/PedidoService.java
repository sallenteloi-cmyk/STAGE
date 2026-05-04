package estructural.adptereloi;

public class PedidoService {
    private PasarelaPago pasarelaPago;
    public PedidoService(PasarelaPago pasarelaPago) {
        this.pasarelaPago = pasarelaPago;
    }
    public void pagarPedido(double total) {
        boolean correcto = pasarelaPago.realizarPago(total);
        if (correcto) {
            System.out.println("Pedido pagado correctamente");
        } else {
            System.out.println("Error al pagar el pedido");
        }
    }
}
