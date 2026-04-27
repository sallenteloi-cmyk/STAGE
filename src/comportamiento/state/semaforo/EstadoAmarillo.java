package comportamiento.state.semaforo;

public class EstadoAmarillo implements EstadoSemaforo {
    @Override
    public void cambiar(Semaforo semaforo) {
        System.out.println("Cambiando de amarillo a rojo...");
        semaforo.setEstado(new EstadoRojo());
    }

    @Override
    public String getColor() {
        return "AMARILLO";
    }
}
