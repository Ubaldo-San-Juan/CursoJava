/*
    Ejercicio 12: Pedir un número y calcular su factorial
    N!=1*2*3*4...*N
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, factorial=1;
        
        System.out.print("Ingresar el valor de N: ");
        N = teclado.nextInt();
        for(int i=1;i<=N;i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + N + " es: " + factorial);
    }
}
