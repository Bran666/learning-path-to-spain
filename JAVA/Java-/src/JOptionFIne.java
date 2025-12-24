import javax.swing.*;

public class JOptionFIne {


    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");

        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
    }
}
