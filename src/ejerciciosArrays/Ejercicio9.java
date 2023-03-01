/*
    Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una pocisión hacia
    abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser
    el primero.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
//        numeros[0] = 3;
//        numeros[1] = 5;
//        numeros[2] = 4;
//        numeros[3] = 1;
//        numeros[4] = 2;
//        numeros[5] = 6;
//        numeros[6] = 8;
//        numeros[7] = 9;
//        numeros[8] = 7;
//        numeros[9] = 10;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el valor del número: ");
            numeros[i] = teclado.nextInt();
        }
        
        int ultimo = numeros[9];
        
        for(int i=8; i>=0; i--){
            numeros[i+1] = numeros[i];
        }
        
        numeros[0] = ultimo;
        System.out.println("Nuevo arreglo");    
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("["+numeros[i]+"]");
        }
        System.out.println("");
    }
}
