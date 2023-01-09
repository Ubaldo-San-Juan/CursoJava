/*
    Ejercicio 5: La calificación final de un estudiante de informática se calcula con base a las calificaciones de cuatro aspectos de su
    rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final. Sabiendo que las calificaciones 
    anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%. Hacer un programa que calcule e imprima la
    calificación final obtenida por un estudiante.
 */
package ejerciciosOperadores;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float part, exam_1, exam_2, exam_final, resultado;
        
        System.out.print("Ingrese la calificación de la participación: ");
        part = teclado.nextFloat();
        System.out.print("Ingrese la calificación del examen 1: ");
        exam_1 = teclado.nextFloat();
        System.out.print("Ingrese la calificación del examen 2: ");
        exam_2 = teclado.nextFloat();
        System.out.print("Ingrese la calificación del examen Final: ");
        exam_final = teclado.nextFloat();
        
        part = part * 0.10f;
        exam_1 = exam_1 * 0.25f;
        exam_2 = exam_2 * 0.25f;
        exam_final = exam_final * 0.40f;
        resultado = part + exam_1 + exam_2 + exam_final;
        
        System.out.println("La calificación final del estudiante es: " + resultado);
    }
}
