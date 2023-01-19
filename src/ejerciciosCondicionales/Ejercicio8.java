/*
    Ejercicio 8: Pedir un número entre 0 y 99 999 y decir cuántas cifras tiene
*/
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables
        int numero;
        String cifras;
        
        System.out.print("Ingrese un número entre 0 y 99 999: ");
        numero = teclado.nextInt();
        
        if(numero >= 0 && numero<=99999){
            cifras = (numero+""); //Convirtiendo int a String
            System.out.println("La cantidad de cifras que tiene el número es: " + cifras.length());
        }else{
            System.out.println("El número que digitó está fuera del rango solicitado!!!");
        }
    }
}
