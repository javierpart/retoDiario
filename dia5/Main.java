import java.util.Scanner;

public class Main {
    public static String pedirString(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el número a convertir en array: ");
        String frase= teclado.nextLine();
        return frase;
    }
    public static void main(String[] args) {
        String cadena = pedirString();
        System.out.println(Util.stringToArray(cadena).toString());;
    }
}

