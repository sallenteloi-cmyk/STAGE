package comportamiento.state.tren;

class BilleteEmitido implements Estado {

    public void cambiar(MaquinaExpendedora maquina) {

        var sc = maquina.getScanner();

        System.out.println("Billete emitido.");
        System.out.println("1. Nueva operación");
        System.out.println("2. Fuera de servicio");

        int opcio = sc.nextInt();

        if (opcio == 1) {
            System.out.println("Volviendo a inicio");
            maquina.setEstado(new EsperandoDestino());
        } else if (opcio == 2) {
            maquina.setEstado(new FueraDeServicio());
        } else {
            System.out.println("Opción inválida");
        }
    }

    public String getEstado() {
        return "Billete emitido";
    }
}
