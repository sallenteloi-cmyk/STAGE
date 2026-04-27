package comportamiento.state.semaforo;

public class Semaforo {
    private EstadoSemaforo estado;

    public Semaforo() {
        estado = new EstadoRojo();
    }

    public void setEstado(EstadoSemaforo estado) {
        this.estado = estado;
    }

    public void cambiar() {
        estado.cambiar(this);
    }

    public void mostrarEstado() {
        System.out.println("El semáforo está en "+estado.getColor());
    }
}
