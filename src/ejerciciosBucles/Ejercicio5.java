/*
    Ejercicio 5: Realizar un juego para adivinar un número. Por ello generar un número aleatorio entre 0-100, y luego ir pidiendo
    números indicando "Es mayor" o "Es menor" según sea mayor o menor con respecto a N. El proceso termina cuando el usuario 
    acierta y mostrar el número de intentos.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numAleatorio = (int)(Math.random()*100), num, intentos=0;
//        System.out.print("Ingresa el valor del número (0-100): ");
//        num = teclado.nextInt();
//        intentos++;
//        
//        while(num!=numAleatorio){
//            if(num<numAleatorio){
//                System.out.println("Es mayor");
//            }else{
//                System.out.println("Es menor");
//            }
//            System.out.print("Ingresa el valor del número (0-100): ");
//            num = teclado.nextInt();
//            intentos++;
//        }
//        System.out.println("Número acertado!!! -> " + numAleatorio);
//        System.out.println("Numero de intentos: " + intentos);
        
        do {
            System.out.print("Ingresa el valor del número (0-100): ");
            num = teclado.nextInt();
            if(num<numAleatorio){
                System.out.println("Es mayor");
            }else{
                System.out.println("Es menor");
            }
            intentos++;
        }while(num!=numAleatorio);

        System.out.println("Número acertado!!! -> " + numAleatorio);
        System.out.println("Numero de intentos: " + intentos);

    }
}
