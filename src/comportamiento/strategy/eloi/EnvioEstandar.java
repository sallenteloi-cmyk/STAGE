package comportamiento.strategy.eloi;

public class EnvioEstandar implements EnvioStrategy {
    @Override
    public double calcularEnvio(Pedido pedido) {
        return 3.99;
    }
}
