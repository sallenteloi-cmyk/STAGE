package comportamiento.state.semaforo;

public class EstadoVerde implements EstadoSemaforo {
    @Override
    public void cambiar(Semaforo semaforo) {
        System.out.println("Cambiando de verde a amarillo...");
        semaforo.setEstado(new EstadoAmarillo());
    }

    @Override
    public String getColor() {
        return "VERDE";
    }
}
