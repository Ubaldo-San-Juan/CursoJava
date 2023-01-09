
package introduccion;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class EntradaDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        float flotante;
        double double_val;
        String cadena;
        
        System.out.print("Digite un número entero: ");
        numero = entrada.nextInt();
        
        System.out.print("Digite un número flotante: ");
        flotante = entrada.nextFloat();
        
        System.out.print("Digite un número double: ");
        double_val = entrada.nextDouble();
        
        System.out.print("Digite una cadena: ");
        cadena = entrada.nextLine();
        
        System.out.println("Valor del número entero es: " + numero);
        System.out.println("Valor del número flotante es: " + flotante);
        System.out.println("Valor del número double es: " + double_val);
        System.out.println("La cadena es: " + cadena);
        
    }
}
