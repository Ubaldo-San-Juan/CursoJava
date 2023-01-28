/*
    Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Ingresa el valor de un número: ");
        num = teclado.nextInt();
        
        while(num!=0){
            if(num>0){
                System.out.println("El número ingresado es positivo!");
            }else{
                System.out.println("El número ingresado es negativo!");
            }
            System.out.print("Ingresa el valor de un número: ");
            num = teclado.nextInt();
        
        }
    }
}
