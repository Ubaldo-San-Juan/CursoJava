/*
    Ejercicio 10: Pedir 10 números y escribir la suma total
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, suma=0;
                
        System.out.println("****Ingrese 10 números****");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el valor del número " + i + ": ");
            num = teclado.nextInt();
            suma += num;
        }
        System.out.println("La suma total es: " + suma);
    }
}
