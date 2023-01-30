/*
    Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */
package ejerciciosBucles;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_11 {
    public static void main(String[] args) {
        int producto=1;
        for(int i=1; i<=20; i++){
            if(!(i%2==0)){
                producto *=i;
            }
        }
        System.out.println("Producto: " + producto);
    }
}
