package creacional.builder_eloi.v2;

public class AvatarBuilder {

    String nombre;
    String tipo;

    String colorPelo;
    String colorRopa;
    String arma;
    String mascota;
    boolean tieneCapa;
    boolean tieneCasco;

    public AvatarBuilder() {}

    public AvatarBuilder reset() {
        nombre = null;
        tipo = null;
        colorPelo = null;
        colorRopa = null;
        arma = null;
        mascota = null;
        tieneCapa = false;
        tieneCasco = false;
        return this;
    }

    public AvatarBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public AvatarBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public AvatarBuilder colorPelo(String c) { colorPelo = c; return this; }
    public AvatarBuilder colorRopa(String c) { colorRopa = c; return this; }
    public AvatarBuilder arma(String a) { arma = a; return this; }
    public AvatarBuilder mascota(String m) { mascota = m; return this; }
    public AvatarBuilder tieneCapa(boolean c) { tieneCapa = c; return this; }
    public AvatarBuilder tieneCasco(boolean c) { tieneCasco = c; return this; }

    public Avatar build() {
        return new Avatar(this);
    }
}
