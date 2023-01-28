/*
    for (int variable = valor; variable < 10; variable++) {
        instrucciones
    }
 */
package buclesFundamentos;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class For {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        */
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.print("Ingresa la cantidad de números a mostrar: ");
        num = teclado.nextInt();
        
        for (int i = 1; i <=num; i++) {
            System.out.println(i);
        }
    }
}
