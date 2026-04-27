package comportamiento.state.semaforo;

/**
 * Aquí indicamos que cada estado debe saber:
 *  - qué hacer cuando el semáforo cambia,
 *  - y cuál es el color del estado concreto
 */
public interface EstadoSemaforo {
    public abstract void cambiar(Semaforo semaforo);
    String getColor();
}
