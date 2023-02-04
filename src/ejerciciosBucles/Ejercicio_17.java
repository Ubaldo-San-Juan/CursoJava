/*
    Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
    En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas
    introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuántas facturas se emitieron de más de $600.
 */
package ejerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigoArticulo, cantidadVendida, litrosVendidosArt_1=0, contadorFactura=0;
        float precioPorLitro=0, importeFactura=0, facturaTotal=0;
        
        for(int i=1; i<=5; i++){
            System.out.print("Ingresa el código del artículo " + i + ": ");
            codigoArticulo = teclado.nextInt();
            System.out.print("Cantidad vendida en litros: ");
            cantidadVendida = teclado.nextInt();
            System.out.println("Ingresa el precio por litros: ");
            precioPorLitro = teclado.nextInt();
            
            importeFactura = (float) precioPorLitro * cantidadVendida;
            facturaTotal += importeFactura;
            if(codigoArticulo == 1){
                litrosVendidosArt_1 += cantidadVendida;
            }
            if(importeFactura > 600){
                contadorFactura++;
            }
        }
        System.out.println("Facturación total: " + facturaTotal);
        System.out.println("Cantidad litros vendidos del artículo 1: " + litrosVendidosArt_1);
        System.out.println("Facturas superiores a 600: " + contadorFactura);
    }
}
