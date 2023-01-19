/*
    Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses
    son de 30 días.
*/
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anio;
        System.out.print("Ingrese el día: ");
        dia = teclado.nextInt();
        System.out.print("Ingrese el mes: ");
        mes = teclado.nextInt();
        System.out.print("Ingrese el año: ");
        anio = teclado.nextInt();
        
        if(dia>=1 && dia<=30){
            if(mes>=1 && mes<=12){
                if(anio!=0){
                    System.out.println("La fecha es correcta :)");
                }else{
                    System.out.println("La fecha es incorrecta, Error en el año");
                }
            }else{
                System.out.println("La fecha es incorrecta, Error en el mes");
            }
        }else{
            System.out.println("La fecha es incorrecta, Error en el día");
        }
        
        /*
        if((dia>=1 && dia<=30) && (mes>=1 && mes<=12) && anio!=0){
            System.out.println("La fecha es correcta :)");
        }else{
            System.out.println("La fecha es incorrecta!!!!! :/");
        }
        */
    }
}
