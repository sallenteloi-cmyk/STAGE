package estructural.facade.ptoPartidaEjercicio;

public class Principal {
    public static void main(String[] args) {

        String nombre = "Laura García";
        String dni = "12345678A";
        String tipoPlan = "Musculación";
        double cuotaMensual = 39.99;

        GimnasioFacade gimnasio = new GimnasioFacade();

        gimnasio.altaCompletaSocio(nombre, dni, tipoPlan, cuotaMensual);
    }
}
