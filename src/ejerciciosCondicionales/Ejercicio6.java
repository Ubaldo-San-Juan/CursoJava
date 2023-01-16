/*
    Ejercicio 6: Hacer un programa que tome dos números y diga si ambos son pares o impares
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el valor de 2 números: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        
        if((num1%2==0)&&(num2%2==0)){
            System.out.println("Ambos números son pares");
        }else if((num1%2!=0)&&(num2%2!=0)){
            System.out.println("Ambos números son impares");
        }else{
            System.out.println("Uno de los dos números es par o impar");
        }
    }
}
