package comportamiento.strategy.carmen;

/**
 * Interfaz común.
 * Todas las estrategias deben implementar esta interfaz.
 */
public interface EstrategiaRuta {
    public abstract String calcularRuta(String origen, String destino);
}
