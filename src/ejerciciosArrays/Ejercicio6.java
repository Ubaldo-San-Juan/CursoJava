/*
    Ejercicio 6: Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la forma:
    3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
 */
package ejerciciosArrays;

/**
 *
 * @author Ubaldo
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] A = {3,5,2,1,7,8,3,5,6,1,3,6};
        int[] B = {5,1,7,3,2,8,4,7,1,3,6,8};
        int[] C = new int[24];

        //C[0] = A[0]
        //C[1] = A[1]
        //C[2] = A[2]
        
        //C[3] = B[0]
        //C[4] = B[1]
        //C[5] = B[2]
        
        //C[6] = A[3]
        //C[7] = A[4]
        //C[8] = A[5]
        
        //C[9] = B[3]
        //C[10] = B[4]
        //C[11] = B[5]
        
        //C[12] = A[6]
        //C[13] = A[7]
        //C[14]777774 = A[8]

        int j=0;
        int k=0;
        int c=0;
        
        for (int i = 0; i < 4; i++) {
            C[c] = A[j];
            C[c+=1] = A[j+1];
            C[c+=1] = A[j+2];
            j+=3;
            C[c+=1] =  B[k];
            C[c+=1] = B[k+1];
            C[c+=1] = B[k+2];
            k+=3;
            c++;
//            System.out.print("[" + A[j] + "]");
//            System.out.print("[" + A[j+1] + "]");
//            System.out.print("[" + A[j+2] + "]");
//            j+=3;
//            System.out.println("");
//            System.out.println("");
//            System.out.print("[" + B[k] + "]");
//            System.out.print("[" + B[k+1] + "]");
//            System.out.print("[" + B[k+2] + "]");
//            k+=3;
//            System.out.println("");
//            System.out.println("");
        }
        
        
        
        System.out.print("C = ");
        for (int i = 0; i < 24; i++) {
            System.out.print("[" + C[i] + "]");
        }
        System.out.println("");
    }
}
