/*
    Ejercicio 20: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, nSueldos;
        float sueldo, sueldoMax=0;
        System.out.print("Ingresa el número de sueldos que se introducirán: ");
        nSueldos = teclado.nextInt();

        for(int i=1; i<=nSueldos; i++){
            System.out.print("Ingresa el sueldo N " + i + ": ");
            sueldo = teclado.nextFloat();
            if(sueldo > sueldoMax){
                sueldoMax = sueldo;
            }
        }
        System.out.println("El sueldo máximo es: " + sueldoMax);
    }
}
