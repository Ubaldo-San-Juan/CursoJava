/*
    Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] numeros = new int[5]; // Declaración del arreglo
        
        // Llenado del arreglo
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el valor del número " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        
        // Impresión del arreglo
        for(int i = 0; i < 5; i++){
            System.out.println("Numero[" + i + "]: " + numeros[i]);
        }
    }
}
