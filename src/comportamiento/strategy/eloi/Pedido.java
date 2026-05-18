package comportamiento.strategy.eloi;

public class Pedido {

    private int id;
    private String cliente;
    private double importeCompra;
    private double pesoKg;

    private EnvioStrategy estrategiaEnvio;

    public Pedido(int id, String cliente, double importeCompra, double pesoKg) {
        this.id = id;
        this.cliente = cliente;
        this.importeCompra = importeCompra;
        this.pesoKg = pesoKg;
    }

    public void setEstrategiaEnvio(EnvioStrategy estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public double calcularCosteEnvio() {
        return estrategiaEnvio.calcularEnvio(this);
    }

    // Getters
    public double getImporteCompra() {
        return importeCompra;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id +
                ", cliente='" + cliente + '\'' +
                ", importeCompra=" + importeCompra +
                ", pesoKg=" + pesoKg + '}';
    }
}
