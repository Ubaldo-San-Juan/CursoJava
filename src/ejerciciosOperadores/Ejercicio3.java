/*
    Ejercicio 3: Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que posee Luis y Guillermo Juntos.
    Hacer un programa que calcule e imprima la cantidad de dinero tienen entre los 3.
 */
package ejerciciosOperadores;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float guillermo;
        System.out.print("Ingrese la cantidad de dinero tiene Guillermo: ");
        guillermo = teclado.nextFloat();
        float luis = guillermo / 2;
        float juan =  (guillermo + luis)/2;
        
        float total = guillermo + luis + juan;
        System.out.println("El total de dinero que tienen los 3 es: " + total);
    }
}
