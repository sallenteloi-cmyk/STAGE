package comportamiento.state.tren;

class OperacionCancelada implements Estado {

    public void cambiar(MaquinaExpendedora maquina) {

        var sc = maquina.getScanner();

        System.out.println("Operación cancelada.");
        System.out.println("1. Nueva operación");
        System.out.println("2. Fuera de servicio");

        int opcio = sc.nextInt();

        if (opcio == 1) {
            maquina.setEstado(new EsperandoDestino());
        } else if (opcio == 2) {
            maquina.setEstado(new FueraDeServicio());
        } else {
            System.out.println("Opción inválida");
        }
    }

    public String getEstado() {
        return "Operación cancelada";
    }
}