/*
    Un arreglo (Array) en java es una estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo.
    El tamaño de los arrays se declara en un primer momento y no puede cambiar luego durante la ejecución del programa.
    
    Sintaxis:
    tipo_de_dato[] nombreArray = new tipo_de_dato[dimensión];
*/
package arraysFundamentos;

/**
 *
 * @author Ubaldo
 */
public class Array {
    public static void main(String[] args) {
        // Ejemplo de declaración de arreglos
        int[] numeros = new int[4];
        float[] numerosDecimales = new float[3];
        String[] nombres = new String[4];
        boolean[] boleano = new boolean[2];
        
        // Dar valores a un arreglo
        numeros[0] = 2;
        numeros[1] = 3;
        numeros[2] = 6;
        numeros[3] = 1;
        
        int[] numerosN = {1,2};
        
        // Imprimir valores del arreglo numeros
        System.out.println("Valores del arreglo numeros");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        
        System.out.println("\nValores del arreglo numerosN");
        // Imprimir valores del arreglo numerosN
        System.out.println(numerosN[0]);
        System.out.println(numerosN[1]);
        
        
        //Imprimir valores del arreglo numeros usando el ciclo for
        System.out.println("\nValores del arreglo numeros");
        for (int i = 0; i < 4; i++) {
            System.out.println(numeros[i]);
        }

        //Imprimir valores del arreglo numerosN usando el ciclo for
        System.out.println("\nValores del arreglo numerosN");
        for (int i = 0; i < 2; i++) {
            System.out.println(numeros[i]);
        }
        
    }
}
