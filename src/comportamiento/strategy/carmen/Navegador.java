package comportamiento.strategy.carmen;

/**
 * Clase que usa la estrategia.
 */
public class Navegador {
    private EstrategiaRuta estrategiaRuta;

    public Navegador(EstrategiaRuta estrategiaRuta) {
        this.estrategiaRuta = estrategiaRuta;
    }

    public void setEstrategiaRuta(EstrategiaRuta estrategiaRuta) {
        this.estrategiaRuta = estrategiaRuta;
    }

    public void mostrarRuta(String origen, String destino) {
        System.out.println(estrategiaRuta.calcularRuta(origen, destino));
    }
}
