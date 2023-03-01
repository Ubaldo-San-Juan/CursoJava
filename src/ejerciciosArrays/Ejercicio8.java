/*
    Ejercicio 8: Diseña una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado
    8 números. Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando
    los que estén detrás.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] elementos = new int[10];
        
        //Dando valores al arreglo
        elementos[0] = 1;
        elementos[1] = 3;
        elementos[2] = 5;
        elementos[3] = 6;
        elementos[4] = 4;
        elementos[5] = 8;
        elementos[6] = 1;
        elementos[7] = 3;
        elementos[8] = 7;

        int num, pos;
//        for (int i = 0; i < 8; i++) {
//            System.out.print("Ingresa el valor del número " + i + ": ");
//            elementos[i] = teclado.nextInt();
//        }

        System.out.print("\nIngresa el valor de un número: ");
        num = teclado.nextInt();
        System.out.print("\nIngresa la posición a insertar: ");
        pos = teclado.nextInt();
        //[1][3][5][6][4][8][1][3][7][]

        //Declaración de matriz con respaldo
        int[] respaldo = new int[(elementos.length-pos)-1];
        
        //Guardando los números en la matriz de respaldo
        int indice=0;
        for (int i = pos; i<elementos.length-1; i++) {
           respaldo[indice] = elementos[i];
           indice++;
        }
        
        //Imprimiendo los números que serán respaldados.
        System.out.println("Respaldo");
        for (int i = 0; i < respaldo.length; i++) {
            System.out.print("["+respaldo[i]+"]");
        }
        System.out.println("");
        System.out.println("");
        
        //Agregando el valor en la matriz en la posición indicada.
        elementos[pos] = num;
        
        indice = 0;
        
        //Agregamos el respaldo a la matriz de elementos(+ numero en la posición indicada)
        for (int i = pos; i < elementos.length-1; i++) {
            elementos[i+1] = respaldo[indice];
            indice++;
            System.out.println("["+elementos[i]+"]");
        }
        
        System.out.println("Elementos = respaldo");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + elementos[i] + "]");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Final");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + elementos[i] + "]");
        }
        System.out.println("");
    }
}
