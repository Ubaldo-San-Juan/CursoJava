/*
    Ejercicio 18: Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro. Solo existen
    tres productos con precios:
        1) 0,6 $/Litro
        2) 3 $/litro
        3) 1,25 $/litro
        
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, cantidadVendidaLitros, litrosVendidosArt_1 = 0, contadorFactura = 0;
        float importeFactura = 0, facturaTotal = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura " +i);
            System.out.print("Ingresa el número de los productos existentes\n"
                    + "1) 0,6 $/Litro\n"
                    + "2) 3 $/litro\n"
                    + "3) 1,25 $/litro\n: ");
            num = teclado.nextInt();

            if (num >= 1 && num <= 3) {
                switch (num) {
                    case 1:
                        System.out.print("Ingrese la cantidad vendida en litros: ");
                        cantidadVendidaLitros = teclado.nextInt();
                        importeFactura = (float) cantidadVendidaLitros * 0.6f;
                        facturaTotal += importeFactura;
                        litrosVendidosArt_1 += cantidadVendidaLitros;

                        if (importeFactura > 600) {
                            contadorFactura++;
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad vendida en litros: ");
                        cantidadVendidaLitros = teclado.nextInt();
                        importeFactura = (float) cantidadVendidaLitros * 3.0f;
                        facturaTotal += importeFactura;

                        if (importeFactura > 600) {
                            contadorFactura++;
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese la cantidad vendida en litros: ");
                        cantidadVendidaLitros = teclado.nextInt();
                        importeFactura = (float) cantidadVendidaLitros * 1.25f;
                        facturaTotal += importeFactura;

                        if (importeFactura > 600) {
                            contadorFactura++;
                        }
                        break;
                }
            }else{
                System.out.println("Valor fuera de rango");
                i--;
            }

            System.out.println("");
        }
        System.out.println("Facturación total: " + facturaTotal);
        System.out.println("Cantidad litros vendidos del artículo 1: " + litrosVendidosArt_1);
        System.out.println("Facturas superiores a 600: " + contadorFactura);
    }
}
