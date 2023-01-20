/*
    Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones
    posibles.
*/
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc=0;
        float masa=0, hectogramo=0, decagramo=0, gramo=0;
        
        System.out.println("*******Calculadora de unidades*******");
        System.out.print("Ingresa una unidad en Kg: ");
        masa = teclado.nextFloat();
        System.out.println("\n1) Hectogramo");
        System.out.println("2) Decagramo");
        System.out.println("3) Gramo");
        System.out.print("Selecciona una opción: ");
        opc = teclado.nextInt();
        
        switch(opc){
            case 1:
                hectogramo = masa * 10;
                System.out.println("La unidad de " + masa + "Kg = " + hectogramo + " hectogramos");
                break;
            case 2:
                decagramo = masa * 100;
                System.out.println("La unidad de " + masa + "Kg = " + decagramo + " decagramos");
                break;
            case 3:
                gramo = masa * 1000;
                System.out.println("La unidad de " + masa + "Kg = " + gramo + " gramos");
                break;
            default:
                System.out.println("Opción inválida!!!");
        }
    }
}
