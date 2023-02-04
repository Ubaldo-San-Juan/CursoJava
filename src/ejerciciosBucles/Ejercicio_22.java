/*
    Ejercicio 22: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calificacion;
        boolean haySuspenso=false;
        for(int i=1; i<=5; i++){
            System.out.print("Ingresa la calificación del alumno " + i + ": ");
            calificacion = teclado.nextInt();
            if(calificacion == 4){
                haySuspenso = true;
            }
        }
        if(haySuspenso == true){
            System.out.println("Hay al menos un alumno con suspenso");
        }else{
            System.out.println("No hay ningún alumno con suspenso");
        }
    }
}
