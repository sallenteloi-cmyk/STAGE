package singleton;

public class Principal {
    public static void main(String[] args) {


        GestorConexionBD conexion1 = GestorConexionBD.getInstancia();
        conexion1.conectar();
        conexion1.mostrarEstado();


        GestorConexionBD conexion2 = GestorConexionBD.getInstancia();
        conexion2.mostrarEstado();


        if (conexion1 == conexion2) {
            System.out.println("Ambas variables apuntan a la misma instancia (Singleton correcto).");
        }

        conexion2.desconectar();
        conexion1.mostrarEstado();
    }
}
