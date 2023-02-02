/*
    Ejercicio 16: Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, x=1;
        System.out.print("Ingrese el valor de un número (0-10): ");
        num = teclado.nextInt();
        if(num>=0 && num<=10){
            for(int i=1; i<=10;i++){
                System.out.println(num + "*" + i + " = " + num*i);
            }
        }else{
            System.out.println("Número fuera de rango!!!");
        }
        
/*      Implementación con while  
        while(x<=10){
            System.out.println(num + "*" + x + " = " + num*x);
            x++;
        }
*/

/*        Implementación con doWhile
        do{
            System.out.println(num + "*" + x + " = " + num*x);
            x++;
        }while(x<=10);
*/
    }
}
