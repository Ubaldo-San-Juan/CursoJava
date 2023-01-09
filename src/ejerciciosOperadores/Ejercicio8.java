/*
    Ejercicio 8: Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado 
    de coeficientes reales.
                                                ax^2 + bx + c = 0
        
 */
package ejerciciosOperadores;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a, b, c, x1, x2;
        System.out.print("Ingrese el valor de a: ");
        a = teclado.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = teclado.nextInt();
        System.out.print("Ingrese el valor de c: ");
        c = teclado.nextInt();
        
        x1 = (-b + (float)Math.sqrt((float)Math.pow(b, 2)-4*a*c))/2*a;
        x2 = (-b - (float)Math.sqrt((float)Math.pow(b, 2)-4*a*c))/2*a;
        
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
