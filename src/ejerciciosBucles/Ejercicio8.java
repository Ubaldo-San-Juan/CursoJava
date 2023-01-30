/*
    Ejercicio 8: Pedir un número N, y mostrar todos los números del 1 al N
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;
        System.out.print("Ingresa el valor de un número: ");
        N = teclado.nextInt();
        for (int i=1; i<=N; i++){
            System.out.println(i);
        }
    }
}
