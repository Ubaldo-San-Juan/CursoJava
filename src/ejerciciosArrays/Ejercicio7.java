/*
    Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados
    de la forma creciente, decreciente o si están desordenados.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean creciente=false, decreciente=false;
        
        // Bucle para solicitar los números al usuario y guardarlos en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresar el valor del número " + i + ": ");
            numeros[i] = teclado.nextInt();
        }
        
        // Bucle para determinar si el arreglo es creciente o decreciente
        for (int i = 0; i < 9; i++) {
            if(numeros[i] < numeros[i+1]){   // 1-2-3-4-5-6...N
                creciente = true;
            }else if(numeros[i] > numeros[i+1]){  // 10-9-8-7-6-5...N
                decreciente = true;
            }
        }
        
        // Mostrar el tipo de ordenamiento de los números
        if(creciente == true && decreciente == false){
            System.out.println("Los números están ordenados de manera creciente");
        }else if(decreciente == true && creciente == false){
            System.out.println("Los números están ordenados de manera decreciente");
        }else if(creciente == true && decreciente == true){
            System.out.println("Los números están ordenados de manera desordenada");
        }else if(creciente == false && decreciente == false){
            System.out.println("Los números están ordenados de manera ordenada");
        }
    }
}
