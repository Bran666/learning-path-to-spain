import java.util.Scanner;

public class math {
    public static void main(String[] args) {
     //Ask the user to give 3 ratings and submit the sum.
        Scanner entrada = new Scanner(System.in);

        float note1, note2, note3, res;

        System.out.println("Submit the note: ");
        note1 = entrada.nextFloat();
        note2 = entrada.nextFloat();
        note3 = entrada.nextFloat();

        res = note1 + note2 + note3;

        System.out.println("The final qualification is: " + res);
    }
}
