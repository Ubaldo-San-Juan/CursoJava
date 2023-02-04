/*
    Ejercicio 21: Pedir 10 números y mostrar al final si se ha introducido alguno negativo.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_21 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, numerosNegativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el valor del número " + i + ": ");
            num = teclado.nextInt();
            
            if(num<0){
                numerosNegativos++;
            }
        }
        System.out.println("Números negativos: " + numerosNegativos);
    }
}
