/*
    Ejercicio 10: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
    Sin años bisiestos.
 */
package ejerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, anio;
        System.out.print("Ingresa el día: ");
        dia = teclado.nextInt();
        System.out.print("Ingresa el mes: ");
        mes = teclado.nextInt();
        System.out.print("Ingresa el año: ");
        anio = teclado.nextInt();

        if (mes>=1) {
            if(mes==1 || mes==3 || mes==5 || mes==7 || mes==9 || mes==11){
                if(dia>=1 && dia<=31){
                    if(anio != 0){
                        System.out.println("Fecha correcta");
                    }else{
                        System.out.println("Fecha incorrecta, error en el año");
                    }
                }else{
                    System.out.println("Fecha incorrecta, Corrige el dia");
                }
            }else if(mes==2){
                if(dia>=1 && dia<=28){
                    if(anio != 0){
                        System.out.println("Fecha correcta");
                    }else{
                        System.out.println("Fecha incorrecta, Error en el año");
                    }
                }else{
                    System.out.println("Fecha incorrecta, Corrige el dia");
                }
            }else if(mes==4 || mes==6 || mes==8 || mes==10 || mes==12){
                if(dia>=1 && dia<=30){
                    if(anio!=0){
                        System.out.println("Fecha correcta");
                    }else{
                        System.out.println("Fecha incorrecta, Corrige el año");
                    }
                }else{
                    System.out.println("Fecha incorrecta, Corrige el día");
                }
            }
        }else{
            System.out.println("Fecha incorrecta, Corrige el mes");
        }
    }
}
