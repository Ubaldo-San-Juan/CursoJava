/*
    Ejercicio 3: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Introduzca el valor de un número: ");
        num = teclado.nextInt();
        while(num!=0){
            if(!(num%2==0)){
                System.out.println("Es impar");
            }else{
                System.out.println("Es par");
            }
            System.out.print("Introduzca el valor de un número: ");
            num = teclado.nextInt();
        }
    }
}
