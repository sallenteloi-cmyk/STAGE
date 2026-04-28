package creacional.factory_method_eloi;

public class CreadorFantasma extends CreadorEnemigos {
    protected Enemigo crearEnemigo() {
        return new Fantasma();
    }
}
