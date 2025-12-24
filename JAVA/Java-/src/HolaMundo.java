import java.util.Scanner;

public class HolaMundo {
    public static <integer> void main(String[] args) {
        int entero = 12456; //Primitivo
        //integer numero = null; //or a number //No primitivo //Has a lot of Metods
        float decimal = 1.45f; //Only in float its necesesary use "f" in the final of the number
        String caracteres = "holas";
        boolean decision = true;

        final int number = 10; //const the constatn cannot change

        //System.out.println("HNumero Entero " + decision);

        //-------------------------------------------------------------------------------------------//

        Scanner entrada = new Scanner(System.in);
        String cadena;

        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();

        System.out.println("La cadena es " + cadena);
    }
}
