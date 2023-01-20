/*
    Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial de 1000 Dólares, con el siguiente
    menú de opciones:
    1. Ingresar dinero a la cuenta.
    2. Retirar dinero de la cuenta.
    3. Salir.
*/
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc=0;
        float cuenta=1000, retiro=0;
        System.out.println("*********Bienvenido al cejero automático*********");
        System.out.println("1) Ingresar dinero a la cuenta.");
        System.out.println("2) Retirar dinero de la cuenta.");
        System.out.println("3) Salir.");
        System.out.print("Selecciona una opción: ");
        opc = teclado.nextInt();
        
        switch(opc){
            case 1:
                System.out.print("Digite la cantidad a ingresar: ");
                cuenta += teclado.nextFloat();
                System.out.println("Su saldo actual es de: " + cuenta);
                break;
            case 2:
                System.out.print("Ingresa la cantidad de dinero a retirar: ");
                retiro = teclado.nextFloat();
                if(retiro <= cuenta){
                    System.out.println("Ha retirado " + retiro + ", su saldo actual es de: " + (cuenta-retiro));
                }else{
                    System.out.println("Saldo insuficiente");
                }
                break;
            case 3:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opcion inválida");
        }
    }
}
