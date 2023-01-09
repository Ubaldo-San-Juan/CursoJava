/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;

/**
 *
 * @author Ubaldo
 */
public class Variables {
    public static void main(String[] args) {
        //************************************VARIABLES PRIMITIVAS************************************//
        
        //Variables enteras
        byte numero_byte;
        numero_byte = 12;
        short numero_short = 12243;
        int numero_int = 1231231231;
        long numero_long = 231231231;
        
        
        System.out.println("El valor del número byte es: " + numero_byte);
        System.out.println("El valor del número short es: " + numero_short);
        System.out.println("El valor del número int es: " + numero_int);
        System.out.println("El valor del número long es: " + numero_long);
        
        //Variables de tipo decimal
        float numero_float = 12.2f;
        double numero_double = 12.2222;
        
        System.out.println("El valor del número float es: " + numero_float);
        System.out.println("El valor del número double es: " + numero_double);
        
        //Variables de tipo caracter
        char caracter_char = 'a';
        System.out.println("el valor de la variable char es: " + caracter_char);
        
        //Variable de tipo booleano
        boolean variable_boleana = true;
        System.out.println("El valor de la variable booleana es: " + variable_boleana);
        
        //************************************VARIABLES NO PRIMITIVAS************************************//
        // si acepta valores con null
        Integer numero = null;
        System.out.println("Valor de número es: " + numero);
        
        String palabra = "Hola que tal";

    }
}
