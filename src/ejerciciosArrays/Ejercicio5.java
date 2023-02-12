/*
    Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1° de A, sel 1° de B,
    el 2° de A, el 2° de B, etc.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nNum = 10;
        int[] A = new int[nNum];
        int[] B = new int[nNum];
        int[] C = new int[nNum*2];        
        int contadorA=0;
        int contadorB=0;
        
        // Ejemplo:
        // A = [1][2][4][6][3][2][1][7][3][4]
        // B = [5][7][2][1][8][9][2][1][5][2]        
        // C = [1][5][2][7][4][2][6][1]
        
        System.out.println("********Solicitar datos para la tabla A********");
        for (int i = 0; i < nNum; i++) {
            System.out.print("Ingresa un número en la posición " + i + ": ");
            A[i] = teclado.nextInt();
        }
        
        System.out.println("********Solicitar datos para la tabla B********");
        for (int i = 0; i < nNum; i++) {
            System.out.print("Ingresa un número en la posición " + i + ": ");
            B[i] = teclado.nextInt();
        }
        
        for (int i = 0; i < 20; i+=2) {
            C[i] = A[contadorA];
            contadorA++;
        }
        
        for (int i = 1; i < 20; i+=2) {
            C[i] = B[contadorB];
            contadorB++;
        }
        System.out.print("C = ");
        for (int i = 0; i < 20; i++) {
            System.out.print("[" + C[i] + "] ");
        }
        System.out.println("");        
        
//        // Otro modo de resolverlo
//        int contadorC=0;
//        for (int i = 0; i < 10; i++) {
//            C[contadorC] = A[i];
//            contadorC++;
//            C[contadorC] = B[i];
//            contadorC++;
//        }
        
    }
}
