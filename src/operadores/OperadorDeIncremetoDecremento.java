
package operadores;

/**
 *
 * @author Ubaldo
 */
public class OperadorDeIncremetoDecremento {
    public static void main(String[] args) {
        int a=5, b, x=5, y;
        b = a++; //5
        y = ++x; //6
        
        System.out.println("El valor de la variable y es: " + b);
        System.out.println("El valor de la variable z es: " + y);
    }
}
