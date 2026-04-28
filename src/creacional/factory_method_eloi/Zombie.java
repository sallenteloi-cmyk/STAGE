package creacional.factory_method_eloi;

public class Zombie implements Enemigo {
    public void atacar() {
        System.out.println("El zombie muerde");
    }

    public void defenderse() {
        System.out.println("El zombie resiste lentamente");
    }

    public void moverse() {
        System.out.println("El zombie camina despacio");
    }
}
