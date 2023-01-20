/*
    Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien, Notable y Sobresaliente.
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota=0;
        System.out.print("Ingresa una nota (0-10): ");
        nota = teclado.nextInt();
        if(nota>=0 && nota<=5){
            System.out.println("Insuficiente");
        }else if(nota>5 && nota<=7){
            System.out.println("Suficiente");
        }else if(nota==8){
            System.out.println("Bien");
        }else if(nota==9){
            System.out.println("Notable");
        }else if(nota==10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Dato fuera del rango");
        }
    }
}
