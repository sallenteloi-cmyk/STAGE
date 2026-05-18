package comportamiento.strategy.carmen;

/**
 * Estrategia concreta.
 */
public class RutaSinPeajes implements EstrategiaRuta {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta sin peajes desde " + origen + " hasta " + destino +
                ": Carreteras secundarias. Tiempo estimado: 28 min.";
    }
}
