/**
 * 26  volteaArrayInt: Le da la vuelta a un array. Los primeros números estarán al final y viceversa.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime el tamaño del array: ");
        int n = sc.nextInt();
        int[] num = new int [n];

        for(int i = 0; i<num.length;i++){
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextInt();
        }
        ;

        arrays.escribeArray(arrays.volteaArrayInt(num));
        sc.close();
    }
}
