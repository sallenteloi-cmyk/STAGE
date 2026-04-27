package comportamiento.state.semaforo;

public class principal {
    public static void main(String[] args) {
        Semaforo s = new Semaforo();

        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
        s.cambiar();
        s.mostrarEstado();
    }
}
