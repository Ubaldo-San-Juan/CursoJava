/*
    Ejercicio 3: Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayúscula
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char letra;
        System.out.print("Digite una letra: ");
        letra = teclado.nextLine().charAt(0);
        
        if(Character.isUpperCase(letra)){   //Character.isUpperCase(letra) - funcion para comprobar letras mayusculas
            System.out.println("Es una letra Mayúscula");
        }else{
            System.out.println("Es una letra Minúscula");
        }
    }
}
