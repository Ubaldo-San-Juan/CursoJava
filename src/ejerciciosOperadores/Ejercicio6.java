/*
    Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma.
                              (a+b)^2 = a^2 + b^2 + 2ab
 */
package ejerciciosOperadores;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, resultado;
        System.out.print("Ingrese el valor de a: ");
        a = teclado.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = teclado.nextInt();
        
        resultado = ((int) Math.pow(a, 2)) + ((int) Math.pow(b, 2)) + 2*a*b;
        System.out.println("El resultado es: " + resultado);
    }
}
