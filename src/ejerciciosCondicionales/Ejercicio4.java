/*
    Ejercicio 4: En una mega plaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
    ¿Cuál será la cantidad que pagará una persona por su compra?
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float compra;
        System.out.print("Ingrese el valor de la compra del usuario: ");
        compra = teclado.nextFloat();
        if(compra > 300){
            compra -= (compra*0.20f);
            System.out.println("Total a pagar con descuento del 20% es: " + compra);
        }else{
            System.out.println("Total a pagar sin descuento es: " + compra);
        }
    }
}
