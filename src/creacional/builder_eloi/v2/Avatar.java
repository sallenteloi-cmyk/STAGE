package creacional.builder_eloi.v2;


public class Avatar {
    // Obligatorios
    private String nombre;
    private String tipo;

    // Opcionales
    private String colorPelo;
    private String colorRopa;
    private String arma;
    private String mascota;
    private boolean tieneCapa;
    private boolean tieneCasco;

    public Avatar(AvatarBuilder builder) {
        this.nombre = builder.nombre;
        this.tipo = builder.tipo;
        this.colorPelo = builder.colorPelo;
        this.colorRopa = builder.colorRopa;
        this.arma = builder.arma;
        this.mascota = builder.mascota;
        this.tieneCapa = builder.tieneCapa;
        this.tieneCasco = builder.tieneCasco;
    }

    public void mostrar() {
        System.out.println("----- AVATAR -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Pelo: " + colorPelo);
        System.out.println("Ropa: " + colorRopa);
        System.out.println("Arma: " + arma);
        System.out.println("Mascota: " + mascota);
        System.out.println("Capa: " + tieneCapa);
        System.out.println("Casco: " + tieneCasco);
    }
}