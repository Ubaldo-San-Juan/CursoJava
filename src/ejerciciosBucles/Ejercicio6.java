/*
    Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, suma=0;
        do{
            System.out.print("Ingrese el valor de un número: ");
            num = teclado.nextInt();
            suma += num;
        }while(num!=0);
        
        System.out.println("El resultado de la suma es: " + suma);
    }
}
