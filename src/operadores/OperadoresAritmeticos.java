
package operadores;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero1, numero2, suma, resta, multiplicacion, division, resto;
        
        System.out.println("Digite dos números: ");
        numero1 = teclado.nextFloat();
        numero2 = teclado.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 + numero2;
        resto = numero1 % numero2;
        
        System.out.println("El valor de la suma es: " + suma);
        System.out.println("El valor de la resta es: " + resta);
        System.out.println("El valor de la multiplicación es: " + multiplicacion);
        System.out.println("El valor de la division es: " + division);
        System.out.println("El valor del resto(residuo) es: " + resto);
    }
}
