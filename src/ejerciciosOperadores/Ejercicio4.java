/*
    Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, más una comision de
    $150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la 
    computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
*/
package ejerciciosOperadores;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sal_mensual;
        int carros_vendidos;
        
        System.out.print("Ingresa el salario mensual del trabajador: ");
        sal_mensual = teclado.nextFloat();
        System.out.print("Ingresa el número de autos vendidos por el trabajador: ");
        carros_vendidos = teclado.nextInt();
        
        float comision_por_carro = carros_vendidos * 150;
        float porcentaje_venta = carros_vendidos * (0.05f);
        
        float total_salario = sal_mensual + comision_por_carro + porcentaje_venta;
        System.out.println("El salario total del trabajador es: $" + total_salario);
    }
}
