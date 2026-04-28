package creacional.factory_method_eloi;

public class Fantasma implements Enemigo {
    public void atacar() {
        System.out.println("El fantasma asusta");
    }

    public void defenderse() {
        System.out.println("El fantasma se vuelve intangible");
    }

    public void moverse() {
        System.out.println("El fantasma flota");
    }
}
