package creacional.builder_eloi.v1;

public class principal {
    public static void main(String[] args) {

        Avatar avatar1 = new AvatarBuilder("Luna", "Maga")
                .colorPelo("Azul")
                .colorRopa("Morado")
                .arma("Bastón")
                .mascota("Búho")
                .tieneCapa(true)
                .build();

        Avatar avatar2 = new AvatarBuilder("Thorak", "Guerrero")
                .arma("Hacha")
                .tieneCasco(true)
                .build();

        Avatar avatar3 = new AvatarBuilder("Niko", "Explorador")
                .colorRopa("Verde")
                .mascota("Zorro")
                .build();

        avatar1.mostrar();
        avatar2.mostrar();
        avatar3.mostrar();
    }
}
