package singleton;

public class GestorConexionBD {

    // Atributos privados
    private String url = "jdbc:mysql://localhost:3306/empresa";
    private String usuario = "root";
    private boolean conectado;


    private static GestorConexionBD instancia;


    private GestorConexionBD() {
        conectado = false;
    }


    public static GestorConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new GestorConexionBD();
        }
        return instancia;
    }


    public void conectar() {
        if (!conectado) {
            conectado = true;
            System.out.println("Conectado a la base de datos: " + url);
        } else {
            System.out.println("Ya existe una conexión activa.");
        }
    }

    public void desconectar() {
        if (conectado) {
            conectado = false;
            System.out.println("Conexión cerrada.");
        } else {
            System.out.println("No hay conexión activa para cerrar.");
        }
    }

    public void mostrarEstado() {
        if (conectado) {
            System.out.println("Estado: Conectado");
        } else {
            System.out.println("Estado: Desconectado");
        }
    }
}
