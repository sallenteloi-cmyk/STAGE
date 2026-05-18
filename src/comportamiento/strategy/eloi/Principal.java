package comportamiento.strategy.eloi;

public class Principal {
    public static void main(String[] args) {

        Pedido p1 = new Pedido(1, "Ana", 30, 2);
        p1.setEstrategiaEnvio(new EnvioEstandar());

        Pedido p2 = new Pedido(2, "Luis", 80, 5);
        p2.setEstrategiaEnvio(new EnvioUrgente());

        Pedido p3 = new Pedido(3, "Marta", 45, 3);
        p3.setEstrategiaEnvio(new EnvioGratisCompraMinima());

        System.out.println(p1);
        System.out.println("Coste envío: " + p1.calcularCosteEnvio());

        System.out.println(p2);
        System.out.println("Coste envío: " + p2.calcularCosteEnvio());

        System.out.println(p3);
        System.out.println("Coste envío: " + p3.calcularCosteEnvio());
    }
}