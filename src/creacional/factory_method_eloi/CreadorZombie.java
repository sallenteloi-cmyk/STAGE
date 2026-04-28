package creacional.factory_method_eloi;

public class CreadorZombie extends CreadorEnemigos {
    protected Enemigo crearEnemigo() {
        return new Zombie();
    }
}
