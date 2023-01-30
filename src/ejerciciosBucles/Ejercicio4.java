/*
    Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, contador=0;
        System.out.print("Ingresa el valor de un número: ");
        num = teclado.nextInt();
        while(num>=0){
            contador ++;
            System.out.print("Ingresa el valor de un número: ");
            num = teclado.nextInt();
        }
        System.out.println("Números introducidos: " + contador);
    }
}
