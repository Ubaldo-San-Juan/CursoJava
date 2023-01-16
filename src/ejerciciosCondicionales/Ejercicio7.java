/*
    Ejercicio 7: Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Ingrese el valor de 3 números enteros: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        
        System.out.println("\n**********Lista de números ordenados de mayor a menor**********");
        
        if(n1>n2 && n2>n3){
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }else if(n1>n3 && n3>n2){
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n2);            
        }else if(n2>n1 && n1>n3){
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);            
        }else if(n2>n3 && n3>n1){
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);            
        }else if(n3>n1 && n1>n2){
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
        }else{
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
            
        }
    }
}
