package creacional.factory_method_eloi;

public class Principal {
    public static void main(String[] args) {

        CreadorEnemigos creador1 = new CreadorZombie();
        CreadorEnemigos creador2 = new CreadorRobot();
        CreadorEnemigos creador3 = new CreadorFantasma();

        creador1.generarEnemigo();
        creador2.generarEnemigo();
        creador3.generarEnemigo();
    }
}
