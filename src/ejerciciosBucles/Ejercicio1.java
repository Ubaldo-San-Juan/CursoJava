/*
    Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introdusca un número negativo
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Ingresa el valor de un número: ");
        num = teclado.nextInt();
        
        while(num>=0){
            System.out.println("Su cuadrado es: " + Math.pow(num, 2));
            System.out.print("Ingresa el valor de un número: ");
            num = teclado.nextInt();
        }
    }
}
