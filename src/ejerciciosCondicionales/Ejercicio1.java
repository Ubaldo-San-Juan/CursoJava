/*
    Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Dígite un número: ");
        numero = teclado.nextInt();
        
        if(numero%10 == 0){
            System.out.println("El número " + numero + " es multiplo de 10");
        }else{
            System.out.println("El número no es múltiplo de 10");
        }
    }
}
