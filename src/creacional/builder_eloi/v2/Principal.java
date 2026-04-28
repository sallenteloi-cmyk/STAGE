package creacional.builder_eloi.v2;



import creacional.builder_eloi.v2.AvatarBuilder;

public class Principal {
    public static  void main(String[] args) {

        AvatarBuilder builder = new AvatarBuilder();
        AvatarDirector director = new AvatarDirector();

        Avatar avatar1 = director.crearMaga(builder, "Luna");
        Avatar avatar2 = director.crearGuerrero(builder, "Thorak");
        Avatar avatar3 = director.crearExplorador(builder, "Niko");

        avatar1.mostrar();
        avatar2.mostrar();
        avatar3.mostrar();
    }
}
