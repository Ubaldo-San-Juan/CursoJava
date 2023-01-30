/*
    Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad
    de ceros.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, cantidadCeros=0, cantidadP=0, cantidadN=0,sumP=0, sumN=0;
        float mediaP=0, mediaN=0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el valor del número " + i + ": ");
            num = teclado.nextInt();
            if(num>0){
                sumP += num;
                cantidadP++;
            }else if(num==0){
                cantidadCeros++;
            }
            else{
                sumN += num;
                cantidadN++;
            }
        }
        mediaP = (float) sumP/cantidadP;
        mediaN = (float) sumN/cantidadN;
        
        System.out.println("Media positivos: " + mediaP);
        System.out.println("Media negativos: " + mediaN);
        System.out.println("Cantidad ceros: " + cantidadCeros);
    }
}
