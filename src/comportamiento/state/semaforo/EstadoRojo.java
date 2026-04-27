package comportamiento.state.semaforo;

public class EstadoRojo implements EstadoSemaforo {
    @Override
    public void cambiar(Semaforo semaforo) {
        System.out.println("Cambiando de rojo a verde...");
        semaforo.setEstado(new EstadoVerde());
    }

    @Override
    public String getColor() {
        return "ROJO";
    }
}
