/*
    do{
      instrucciones
      iterador ++
    }while(condición);
 */
package buclesFundamentos;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class DoWhile {
    public static void main(String[] args) {
        
        /*
        int i=12;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        */
        int num, i=1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa los números a imprimir: ");
        num = teclado.nextInt();
        do{
            System.out.println(i);
            i++;
        }while(i<=num);
    }
}
