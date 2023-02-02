/*
    Ejercicio 15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de
    18 años y la cantidad de alumnos que miden más de 1.75.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numAlumnos=5, edad=0, sumaEdades=0, cantMayoresA18=0, cantMayores_1_75=0;
        float estatura=0, sumaEstaturas=0, mediaEdades=0, mediaEstatura=0;
        
        for (int i = 1; i <= numAlumnos; i++) {
            System.out.print("Ingresa la edad del alumno " + i + ": ");
            edad = teclado.nextInt();
            sumaEdades += edad;
            System.out.print("Ingresa la estatura del alumno " + i + ": ");
            estatura = teclado.nextFloat();
            sumaEstaturas += estatura;
            System.out.println("");
            
            if(edad>18){
                cantMayoresA18++;
            }
            if(estatura>1.75){
                cantMayores_1_75++;
            }
        }
        mediaEdades = sumaEdades/numAlumnos;
        mediaEstatura = sumaEstaturas/numAlumnos;
        
        System.out.println("La media de edades es de: " + mediaEdades);
        System.out.println("La media de estaturas es de: " + mediaEstatura);
        System.out.println("Mayores de 18 años: " + cantMayoresA18);
        System.out.println("Mayores de 1.75: " + cantMayores_1_75);
    }
}
