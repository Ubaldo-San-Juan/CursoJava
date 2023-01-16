/*
    Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
    * Si trabaja 40 horas o menos se le paga $16 por hora
    * Si trabaja más de 40 horas se le paga $15 por cada una de las primeras 40 horas y $20 por cada hora extra
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas_trabajadas;
        float salario;
        System.out.print("Indique el total de horas trabajadas por el obrero: ");
        horas_trabajadas = teclado.nextInt();
        
        if(horas_trabajadas <= 40){
            salario = horas_trabajadas * 16;
        }else{
            float primeras40 = 40 * 16;
            int extra = (horas_trabajadas - 40) * 20;
            salario = primeras40 + extra;
        }
        
        System.out.println("El salario semanal del obrero es: " + salario);
    }
}
