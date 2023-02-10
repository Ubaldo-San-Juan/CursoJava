/*
    Llenar un arreglo
 */
package arraysFundamentos;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class LlenarArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nElementos;
        System.out.print("Ingresa la cantidad de elementos que contendrá el arreglo: ");
        nElementos = teclado.nextInt();
        System.out.println("");
        
        int[] numeros = new int[nElementos]; // Declaramos nuestro arreglo
        
        for(int i=0; i<nElementos;i++){ // Llenamos nuestro arreglo
            System.out.print("Digita el elemento número " + (i+1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        
        //Ejemplo de impresión 1
        System.out.println("\nImpresión de elementos del arreglo");
        for (int i = 0; i < nElementos; i++) {
            System.out.println("numeros[" + i+"]: " + numeros[i]);
        }
        System.out.println("");
        
        
        //Ejemplo de impresión 2 (usando la propiedad length)
        System.out.println("\nImpresión de elementos del arreglo usando la propiedad length");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i+"]: " + numeros[i]);
        }
    }
}
