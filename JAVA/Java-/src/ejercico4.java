import java.util.Scanner;

public class ejercico4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTotales, semanas, dias, horas;

        System.out.println("Ingrese el total de horas: ");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168;
        dias = horasTotales % 168 / 24;
        horas = horasTotales % 24;

        System.out.println("El equivalente es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("dias: " + dias);
        System.out.println("horas: " + horas);
    }
}
