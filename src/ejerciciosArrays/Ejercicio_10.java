/*
    Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones
    en el arreglo (N es digitado por el usuario)
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int desplazamiento = 0;
        int[] numeros = new int[10];
//        numeros[0] = 5;
//        numeros[1] = 8;
//        numeros[2] = 1;
//        numeros[3] = 6;
//        numeros[4] = 4;
//        numeros[5] = 2;
//        numeros[6] = 3;
//        numeros[7] = 9;
//        numeros[8] = 7;
//        numeros[9] = 6;
        
        //Solicitar datos en el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el valor del número: ");
            numeros[i] = teclado.nextInt();
        }
        
        System.out.print("Ingresa el número de desplazamiento: ");
        desplazamiento = teclado.nextInt();
        int[] respaldo = new int[desplazamiento];
        
        System.out.println("Arreglo original");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("["+numeros[i]+"]");
        }
        System.out.println("");
        
        //Guardamos los números respaldados
        int contador=0;
        for (int i = numeros.length-desplazamiento; i < numeros.length; i++) {
            respaldo[contador] = numeros[i];
            contador++;
        }
        
        //Impresión de los respaldos
        System.out.println("Números respaldados");
        for (int i = 0; i < respaldo.length; i++) {
            System.out.print("["+respaldo[i]+"]");
        }
        
        System.out.println("");
        int inicio = (numeros.length-desplazamiento)-1;
        //Desplazamos los números en N posiciones
        for (int i = inicio; i >= 0; i--) {
            numeros[i+desplazamiento] = numeros[i];
        }
        
        //Insertamos los números respaldados en el nuevo arreglo
        for (int i = 0; i < desplazamiento; i++) {
            numeros[i] = respaldo[i];
        }
        
        
        //Imprimimos el arreglo final
        System.out.println("Arreglo final");
        for (int i = 0; i <numeros.length; i++) {
            System.out.print("["+numeros[i]+"]");
        }
        System.out.println("");
    }
}
