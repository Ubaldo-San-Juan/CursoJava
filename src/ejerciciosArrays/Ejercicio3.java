/*
    Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos,
    la media de los números negativos y contar el número de ceros.
 */
package ejerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int nPositivos=0, nNegativos=0, nCeros=0;
        float sumaPositivos=0, sumaNegativos=0, mediaPositivos=0, mediaNegativos=0;
        
        for(int i=0; i<5; i++){
            System.out.print("Ingresa el valor del número " + (i+1) + ": ");
        numeros[i] = teclado.nextInt();
            if(numeros[i]==0){
                nCeros++;
            }else if(numeros[i]>0){
                nPositivos++;
                sumaPositivos += numeros[i];
            }else{
                nNegativos++;
                sumaNegativos += numeros[i];
            }
        }
  
        System.out.println("");
        if(nPositivos > 0){
            System.out.println("Media positivos: " + sumaPositivos/nPositivos);
        }else{
            System.out.println("No fué posible obtener la media de positivos");
        }
        
        if(nNegativos > 0){
            System.out.println("Media negativos: " + sumaNegativos/nNegativos);
        }else{
            System.out.println("Nó fué posible obtener la media de negativos");
        }
        
        System.out.println("Número de ceros: " + nCeros);
    }
}
