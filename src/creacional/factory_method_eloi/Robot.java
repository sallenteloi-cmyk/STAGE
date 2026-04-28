package creacional.factory_method_eloi;

public class Robot implements Enemigo {
    public void atacar() {
        System.out.println("El robot dispara láser");
    }

    public void defenderse() {
        System.out.println("El robot activa escudo");
    }

    public void moverse() {
        System.out.println("El robot se desplaza con ruedas");
    }
}
