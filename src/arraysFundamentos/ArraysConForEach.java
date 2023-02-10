/*
    Bucle for each
 */
package arraysFundamentos;

/**
 *
 * @author Ubaldo
 */
public class ArraysConForEach {
    public static void main(String[] args) {
        String[] nombres = {"Samuel", "Jorge", "Luis", "Alberto"};
        
        System.out.println("***********Impresión de pantalla usando el ciclo for each***********");
        for(String i:nombres){
            System.out.println("Nombres: " + i);
        }
    }
}
