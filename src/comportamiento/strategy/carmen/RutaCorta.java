package comportamiento.strategy.carmen;

/**
 * Estrategia concreta.
 */
public class RutaCorta implements EstrategiaRuta {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta corta desde " + origen + " hasta " + destino +
                ": Carretera local. Distancia: 12 km.";
    }
}
