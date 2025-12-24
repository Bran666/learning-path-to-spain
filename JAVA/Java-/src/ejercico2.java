import java.util.Scanner;

public class ejercico2 {
    public static void main(String[] args) {
     //Ask the user to give 3 ratings and submit the sum.
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;

        System.out.println("Ingrese la cantidad de dinero de juan: ");
        guillermo = entrada.nextFloat();

        luis = guillermo / 2;
        juan =  (guillermo + luis )/ 2;
        total = guillermo + luis + juan;

        System.out.println("All the money they have between the three of them is: " + total);

    }
}
