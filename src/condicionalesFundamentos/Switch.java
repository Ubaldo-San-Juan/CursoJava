/*
    switch(dato){
        case 1: Instruccion 1;
                break;
        case 2: Instruccion 2;
                break;
        ...
        case n: Instruccion n;
                break;
        default: Caso contrario;
                break;
    }
 */
package condicionalesFundamentos;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número entre el 1 - 5: ");
        num = teclado.nextInt();
        
        switch(num){
            case 1: System.out.println("El número es 1");
            break;
            case 2: System.out.println("El número es 2");
            break;
            case 3: System.out.println("El número es 3");
            break;
            case 4: System.out.println("El número es 4");
            break;
            case 5: System.out.println("El número es 5");
            break;
            default: System.out.println("El número está fuera del rango");
        }
    }
}
