
package introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author Ubaldo
 */
public class EntradaDatosJOPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena:");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero:"));
        letra = JOptionPane.showInputDialog("Digite un caracter:").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal:"));
        
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        
    }
}
