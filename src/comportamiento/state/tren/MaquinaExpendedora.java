package comportamiento.state.tren;

import java.util.Scanner;

class MaquinaExpendedora {

    private Estado estado;
    private Scanner sc;

    public MaquinaExpendedora() {
        sc = new Scanner(System.in);
        estado = new EsperandoDestino();
    }

    public Scanner getScanner() {
        return sc;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void siguiente() {
        estado.cambiar(this);
    }

    public String getEstado() {
        return estado.getEstado();
    }
}