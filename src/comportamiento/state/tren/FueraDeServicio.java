package comportamiento.state.tren;

class FueraDeServicio implements Estado {

    public void cambiar(MaquinaExpendedora maquina) {

        var sc = maquina.getScanner();

        System.out.println("Máquina fuera de servicio.");
        System.out.println("1. Reactivar máquina");

        int opcio = sc.nextInt();

        if (opcio == 1) {
            System.out.println("Máquina reactivada");
            maquina.setEstado(new EsperandoDestino());
        } else {
            System.out.println("Sigue fuera de servicio");
        }
    }

    public String getEstado() {
        return "Fuera de servicio";
    }
}
