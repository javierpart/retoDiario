import java.util.Scanner;

public class Main {


    public static String pedirNombre(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre y los apellidos de la persona: ");
        String nombreCompleto= teclado.nextLine();
        return nombreCompleto;
    }

    public static String[] separarNombre (String nombreCompleto){
        return nombreCompleto.split(" ");
    }

    public static boolean esNombre ( String nombre){
        String[] nombresComunes = {"Juan", "Maria", "Alberto", "Raul", "Lorena", "Nieves", "Javier", "Alfonso", "Luis", "Lucía", "José"};
        for (String nombresComun : nombresComunes) {
            if (nombresComun == nombre)
                return true;
        }
        return false;
    }

    public static void imprimirNombre (String[] nombreSeparado) {
        switch (nombreSeparado.length) {
            case 4:
                System.out.println("Nombre1 = " + nombreSeparado[0] +
                        ", Nombre2 = " + nombreSeparado[1] +
                        ", Apellido1 = " + nombreSeparado[2] +
                        ", Apellido2 = " + nombreSeparado[3]);
                break;
            case 3:
                if (esNombre(nombreSeparado[1])){
                    System.out.println("Nombre1 = " + nombreSeparado[0] +
                            ", Nombre2 = " + nombreSeparado[1] +
                            ", Apellido1 = " + nombreSeparado[2]);}
                else{
                    System.out.println("Nombre1 = " + nombreSeparado[0] +
                            ", Apellido1 = " + nombreSeparado[1] +
                            ", Apellido2 = " + nombreSeparado[2]);}
                break;
            case 2:
                if (esNombre(nombreSeparado[1])){
                    System.out.println("Nombre1 = " + nombreSeparado[0] +
                            ", Nombre2 = " + nombreSeparado[1]);}
                else{
                    System.out.println("Nombre1 = " + nombreSeparado[0] +
                            ", Apellido1 = " + nombreSeparado[1]);}
                break;
            case 1:
                System.out.println("Nombre1 = " + nombreSeparado[0]);

        }
    }

    public static void main(String[] args) {


        String nombreCompleto = pedirNombre();
        String[] nombreSeparado = separarNombre(nombreCompleto);
        imprimirNombre(nombreSeparado);
    }
}
