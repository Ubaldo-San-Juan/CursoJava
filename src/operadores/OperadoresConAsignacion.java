
package operadores;

/**
 *
 * @author Ubaldo
 */
public class OperadoresConAsignacion {
    public static void main(String[] args) {
        int numero = 10;
        int numero2 = 5;
        numero = numero + 5;
        numero2 += 4;
        
        numero = numero - 5;
        numero2 -= 3;
        
        numero = numero * 1;
        numero2 *= 3;
        
        numero = numero / 4;
        numero2 /= 3;
        
        numero = numero % 4;
        numero2 %= 3;
        
        System.out.println(numero);
        System.out.println(numero2);
    }
}
