/*
    if(condicion){
        Instrucción 1
    }else{
        Instrucción 2
    }
 */
package condicionalesFundamentos;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, dato=5;
        System.out.print("Ingresa el valor de número: ");
        numero = teclado.nextInt();
        
/*        if (numero == dato){
            System.out.println("El número proporcionado es 5");
        }else{
            System.out.println("El número proporcionado es diferente de 5");
        }
*/

/*        if (numero != dato){
            System.out.println("El número proporcionado es diferente de 5");
        }else{
            System.out.println("El número proporcionado es 5");
        }
*/

            if (numero <= dato){
                System.out.println("El número proporcionado es menor o igual a 5");
            }else{
                System.out.println("El número proporcionado es mayor a 5");
            }
    }
}
