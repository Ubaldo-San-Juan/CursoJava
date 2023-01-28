/*
    while(condicion){
        instrucciones
        iterador + 1
    }
 */
package buclesFundamentos;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class While {
    public static void main(String[] args) {
        /*
        //Impresión de números del 1 al 10
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        */
        Scanner teclado = new Scanner(System.in);
        int num, i=1;
        
        System.out.print("Ingresa los números a mostrar en pantalla: ");
        num = teclado.nextInt();
        
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
