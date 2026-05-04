package estructural.facade.ptoPartidaEjercicio;

public class GimnasioFacade {

    private ServicioSocios servicioSocios;
    private ServicioEntrenamiento servicioEntrenamiento;
    private ServicioTarjeta servicioTarjeta;
    private ServicioPago servicioPago;
    private ServicioNotificaciones servicioNotificaciones;

    public GimnasioFacade() {
        this.servicioSocios = new ServicioSocios();
        this.servicioEntrenamiento = new ServicioEntrenamiento();
        this.servicioTarjeta = new ServicioTarjeta();
        this.servicioPago = new ServicioPago();
        this.servicioNotificaciones = new ServicioNotificaciones();
    }
    public void altaCompletaSocio(String nombre, String dni, String tipoPlan, double cuotaMensual) {
        servicioSocios.registrarSocio(nombre, dni);
        servicioEntrenamiento.asignarPlan(nombre, tipoPlan);
        servicioTarjeta.generarTarjeta(nombre);
        servicioPago.activarPago(dni, cuotaMensual);
        servicioNotificaciones.enviarBienvenida(nombre);
    }

}
