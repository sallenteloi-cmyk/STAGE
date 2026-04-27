package comportamiento.state.tren;

class EsperandoPago implements Estado {

    public void cambiar(MaquinaExpendedora maquina) {

        var sc = maquina.getScanner();

        System.out.println("Selecciona una opción:");
        System.out.println("1. Introducir dinero");
        System.out.println("2. Cancelar operación");
        System.out.println("3. Fuera de servicio");

        int opcio = sc.nextInt();

        switch (opcio) {
            case 1:
                System.out.println("Pago realizado → Emitiendo billete");
                maquina.setEstado(new BilleteEmitido());
                break;

            case 2:
                System.out.println("Operación cancelada");
                maquina.setEstado(new OperacionCancelada());
                break;

            case 3:
                System.out.println("Máquina fuera de servicio");
                maquina.setEstado(new FueraDeServicio());
                break;

            default:
                System.out.println("Opción inválida");
        }
    }

    public String getEstado() {
        return "Esperando pago";
    }
}