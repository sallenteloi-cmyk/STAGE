package comportamiento.state.tren;

interface Estado {
    void cambiar(MaquinaExpendedora maquina);
    String getEstado();

}
