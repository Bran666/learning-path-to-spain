import javax.swing.*;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
//        int numero;
//
//        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//
//        if (numero % 10 == 0){
//            JOptionPane.showMessageDialog(null, "EL numero " + numero
//             + " es multiplo de 10");
//        } else{
//            JOptionPane.showMessageDialog(null, "El numeor no es multiplo de 10 ");
//        }


//        char caracter;
//        caracter = JOptionPane.showInputDialog("DIgite una letra: ").charAt(0);
//
//        if (Character.isUpperCase(caracter)){
//            JOptionPane.showMessageDialog(null, "Es letra mayuscula");
//        } else {
//            JOptionPane.showMessageDialog(null, "Es letra minuscula");
//        }


//        int horasTrabajadas;
//        float salarioTotal;
//
//        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas trabajadas: "));
//
//        if (horasTrabajadas <= 40){
//            salarioTotal = horasTrabajadas * 16;
//        } else {
//            salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);
//        }
//
//        JOptionPane.showMessageDialog(null, "El salario total es: " + salarioTotal);

//        int n1, n2 ,n3;
//
//        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
//
//        if ((n1 > n2 ) && (n2 > n3)){
//            JOptionPane.showMessageDialog(null, "Orden" + n1 + "-" + n2 + "-" + n3);
//        } else if ((n1 > n3 )&& (n3 > n2)) {
//            JOptionPane.showMessageDialog(null, "Orden" + n1 + "-" + n3 + "-" + n2);
//        } else if ((n2 > n1) && (n1 > n3)) {
//            JOptionPane.showMessageDialog(null, "Orden" + n2 + "-" + n1 + "-" + n3);
//
//        }

        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if (dia >= 1 && dia <= 30){
            if (mes >= 1 && mes <= 12){
                if (año != 0 ){
                    JOptionPane.showMessageDialog(null, "Feccha correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "El año es incorrecto");
                }
            }else {
                JOptionPane.showMessageDialog(null, "El mes es incorrecto");
            }
        }else {
            JOptionPane.showMessageDialog(null, "El dia es incorrecto");
        }
    }
}
