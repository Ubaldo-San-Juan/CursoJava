/*
    Ejercicio 19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota;
        int alumnosAprobados=0, alumnosCondicionados=0, alumnosSuspensos=0;
        
        for(int i=1; i<=6; i++){
            do{
                System.out.print("Ingresa la nota del alumno " + i + " (1-10): ");
                nota = teclado.nextFloat();
            }while(nota<0 || nota>10);
            
            if(nota>=6){
                alumnosAprobados++;
            }else if(nota==4){
                alumnosCondicionados++;
            }else{
                alumnosSuspensos++;
            }
        }
        System.out.println("Alumnos aprobados: " + alumnosAprobados);
        System.out.println("Alumnos condicionados: " + alumnosCondicionados);
        System.out.println("Alumnos suspensos: " + alumnosSuspensos);
    }
}
