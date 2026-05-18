package comportamiento.strategy.eloi;

public class EnvioUrgente implements EnvioStrategy {
    @Override
    public double calcularEnvio(Pedido pedido) {
        return 5.99 + (1.20 * pedido.getPesoKg());
    }
}
