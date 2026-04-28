package creacional.builder_eloi.v2;



public class AvatarDirector {

    public Avatar crearMaga(AvatarBuilder builder, String nombre) {
        return builder.reset()
                .nombre(nombre)
                .tipo("Maga")
                .colorPelo("Azul")
                .colorRopa("Morado")
                .arma("Bastón")
                .mascota("Búho")
                .tieneCapa(true)
                .build();
    }

    public Avatar crearGuerrero(AvatarBuilder builder, String nombre) {
        return builder.reset()
                .nombre(nombre)
                .tipo("Guerrero")
                .arma("Hacha")
                .tieneCasco(true)
                .build();
    }

    public Avatar crearExplorador(AvatarBuilder builder, String nombre) {
        return builder.reset()
                .nombre(nombre)
                .tipo("Explorador")
                .colorRopa("Verde")
                .mascota("Zorro")
                .build();
    }
}