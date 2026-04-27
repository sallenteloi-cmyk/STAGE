package comportamiento.state.tren;

public class Principal {
    public static void main(String[] args) {

        MaquinaExpendedora maquina = new MaquinaExpendedora();

        while (true) {
            System.out.println("\nEstado actual: " + maquina.getEstado());
            maquina.siguiente();
        }
    }
}
