
//Ejercicio 1: Hacer un programa que calcule e imprima la suma de 3 calificaciones


package ejerciciosOperadores;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float cal_1, cal_2, cal_3, suma;
        
        System.out.print("Digite el valor de la calificación 1: ");
        cal_1 = teclado.nextFloat();
        System.out.print("Digite el valor de la calificación 2: ");
        cal_2 = teclado.nextFloat();
        System.out.print("Digite el valor de la calificación 3: ");
        cal_3 = teclado.nextFloat();
        
        suma = cal_1 + cal_2 + cal_3;
        
        System.out.println("El valor de las 3 calificaciones es: " + suma);
    }
}
