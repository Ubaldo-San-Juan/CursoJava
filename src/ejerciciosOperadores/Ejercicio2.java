/*
    Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales
    trabajadas y de su salario por hora
 */
package ejerciciosOperadores;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas_semanales;
        float salario_por_hora, salario_semanal;
        
        System.out.print("Ingrese la cantidad de horas a la semana trabajadas: ");
        horas_semanales = teclado.nextInt();
        System.out.print("Ingrese el valor del salario por hora: ");
        salario_por_hora = teclado.nextFloat();
        
        salario_semanal = horas_semanales * salario_por_hora;
        System.out.println("El salario semanal del trabajador es: $" + salario_semanal);
    }
}