package comportamiento.state.tren;

class EsperandoDestino implements Estado {

    public void cambiar(MaquinaExpendedora maquina) {

        var sc = maquina.getScanner();

        System.out.println("Selecciona una opción:");
        System.out.println("1. Seleccionar destino y continuar");
        System.out.println("2. Poner fuera de servicio");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Destino seleccionado → Esperando pago");
                maquina.setEstado(new EsperandoPago());
                break;

            case 2:
                System.out.println("Máquina fuera de servicio");
                maquina.setEstado(new FueraDeServicio());
                break;

            default:
                System.out.println("Opción inválida");
        }
    }

    public String getEstado() {
        return "Esperando destino";
    }
}

