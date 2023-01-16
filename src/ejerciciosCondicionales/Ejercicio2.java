/*
    Ejercicio 2: Pedir 2 números y decir cuál es el mayor o si son iguales
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite 2 números: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        
        if(num1 > num2){
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        }else if(num1 == num2){
            System.out.println("Los números son iguales");
        }else{
            System.out.println("El número " + num1 + " es menor que el número " + num2);
        }
    }
}
