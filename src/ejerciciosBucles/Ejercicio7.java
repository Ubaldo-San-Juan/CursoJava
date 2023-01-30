/*
    Ejercicio 7: Pedir números hasta que se introduzca uno negativo, y calcular la media
    media = suma/total_numeros
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, suma=0, iterador=0;
        float media;
        
        do{
            System.out.print("Ingresa el valor de un número: ");
            num = teclado.nextInt();
            if(num>=0){
                suma += num;
                iterador++;
            }
        }while(num>=0);
        
        media = (float) suma/iterador;
        System.out.println("Suma: " + suma);
        System.out.println("Iterador: " + iterador);
        System.out.println("La media de los números es: " + media);
    }
}
