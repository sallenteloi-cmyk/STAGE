package creacional.factory_method_eloi;

public class CreadorRobot extends CreadorEnemigos {
    protected Enemigo crearEnemigo() {
        return new Robot();
    }
}