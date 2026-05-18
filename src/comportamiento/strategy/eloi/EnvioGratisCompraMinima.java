package comportamiento.strategy.eloi;

public class EnvioGratisCompraMinima implements EnvioStrategy {
    @Override
    public double calcularEnvio(Pedido pedido) {

        if (pedido.getImporteCompra() >= 50) {
            return 0.0;
        } else {
            return 4.99;
        }
    }
}
