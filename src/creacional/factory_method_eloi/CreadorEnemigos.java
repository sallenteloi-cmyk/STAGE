package creacional.factory_method_eloi;

public abstract class CreadorEnemigos {

    public Enemigo generarEnemigo() {
        Enemigo enemigo = crearEnemigo();
        enemigo.atacar();
        enemigo.defenderse();
        enemigo.moverse();
        return enemigo;
    }

    protected abstract Enemigo crearEnemigo();

    public static class CreadorFantasma {
    }
}
