
package operadores;

/**
 *
 * @author Ubaldo
 */
public class ClaseMath {
    public static void main(String[] args) {
        //Obtener raiz de un número
        double numero = 9, raiz;
        raiz = Math.sqrt(numero);
        
        //Elevar un número a una potencia
        double base = 5, exponente = 2, resultado_potencia;
        resultado_potencia = Math.pow(base, exponente);
        
        //Redondear un número
        double num_a_redondear = 7.5;
        long resultado_redondeo;
        resultado_redondeo = Math.round(num_a_redondear);
        
        //Generar un número aleatorio
        double num_aleatorio = Math.random();

        //Impresiones de resultados en pantalla
        System.out.println("La raíz cuadrada del número " + numero + " es: " + raiz);
        System.out.println("El exponente de la base " + base + " y exponente " + exponente + " es: " + resultado_potencia);
        System.out.println("El resultado del redondeo del número " + num_a_redondear + " es: " + resultado_redondeo);
        System.out.println("El valor del número aleatorio es: " + num_aleatorio);
    }
}
