/*
    Ejercicio 4: Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlos en el siguiente orden: el primero, el último,
    el segundo, el penúltimo, el tercero, etc.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nNum = 10;
        int[] numeros = new int[nNum];
        for(int i=0; i<nNum; i++){
            System.out.print("Ingresa el valor del número " + (i) + ": ");
            numeros[i] = teclado.nextInt();
        }
         
        for (int i = 0; i < (nNum/2); i++) {
            System.out.println("Número[" + i + "] = " + numeros[i]); // 0 - 1 - 2 - 3
            System.out.println("Número[" + (nNum-(i+1)) + "] = " + numeros[nNum-(i+1)]); // 9 - 8 - 7 - 6
        }
    }
}
