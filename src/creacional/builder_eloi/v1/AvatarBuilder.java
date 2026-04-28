package creacional.builder_eloi.v1;

public class AvatarBuilder {

    // Obligatorios
    String nombre;
    String tipo;

    // Opcionales
    String colorPelo;
    String colorRopa;
    String arma;
    String mascota;
    boolean tieneCapa;
    boolean tieneCasco;

    public AvatarBuilder(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public AvatarBuilder colorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
        return this;
    }

    public AvatarBuilder colorRopa(String colorRopa) {
        this.colorRopa = colorRopa;
        return this;
    }

    public AvatarBuilder arma(String arma) {
        this.arma = arma;
        return this;
    }

    public AvatarBuilder mascota(String mascota) {
        this.mascota = mascota;
        return this;
    }

    public AvatarBuilder tieneCapa(boolean tieneCapa) {
        this.tieneCapa = tieneCapa;
        return this;
    }

    public AvatarBuilder tieneCasco(boolean tieneCasco) {
        this.tieneCasco = tieneCasco;
        return this;
    }

    public Avatar build() {
        return new Avatar(this);
    }
}
