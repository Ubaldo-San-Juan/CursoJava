/*
    Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora que puede realizar las operaciones aritméticas
    básicas(suma, resta, multiplicación y división) con valores numéricos enteros. El usuario debe especificar la operación con el
    primer caractér del primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el producto
    y D o d para la división.
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado=0;
        char opc;
        System.out.println("*******Calculadora*******");
        System.out.println("1. Suma (S-s)");
        System.out.println("2. Resta (R-r)");
        System.out.println("3. Producto (P-p)/(M-m)");
        System.out.println("4. División (D-d)");
        System.out.print("Seleccione una opción: ");
        opc = teclado.nextLine().charAt(0);
        
        System.out.print("Ingrese el valor del número 1: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el valor del número 2: ");
        num2 = teclado.nextInt();
        
        if(opc=='S' || opc=='s'){
            resultado = num1 + num2;
        }else if(opc=='R' || opc=='r'){
            resultado = num1 - num2;
        }else if(opc=='P' || opc=='p' || opc=='M' || opc=='m'){
            resultado = num1 * num2;
        }else if(opc=='D' || opc=='d'){
            resultado = num1 / num2;
        }
        
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
