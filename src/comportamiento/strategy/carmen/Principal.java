package comportamiento.strategy.carmen;

public class Principal {
    public static void main(String[] args) {
        Navegador navegador = new Navegador(new RutaRapida());

        navegador.mostrarRuta("Casa", "Gimbernat");

        navegador.setEstrategiaRuta(new RutaCorta());
        navegador.mostrarRuta("Casa", "Gimbernat");

        navegador.setEstrategiaRuta(new RutaSinPeajes());
        navegador.mostrarRuta("Casa", "Gimbernat");
    }

    /**
     * Estrategia concreta.
     */
    public static class RutaRapida implements EstrategiaRuta {
        @Override
        public String calcularRuta(String origen, String destino) {
            return "Ruta rápida desde " + origen + " hasta " + destino +
                    ": Autopista C-58. Tiempo estimado: 20 min.";
        }
    }
}
