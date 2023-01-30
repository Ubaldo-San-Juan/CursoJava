/*
    Ejercicio 14: Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de $1000.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sueldo, suma=0;
        int mayoresMil=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            sueldo = teclado.nextFloat();
            suma+=sueldo;
            
            if(sueldo>1000){
                mayoresMil++;
            }
        }
        System.out.println("Suma de sueldos: " + suma);
        System.out.println("Mayores a mil: " + mayoresMil);
    }
}
