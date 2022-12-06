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
        System.out.print("Dime el mínimo del intervalo: ");
        int min = sc.nextInt();
        System.out.print("Dime el máximo del intervalo: ");
        int max = sc.nextInt();

        int[] num = arrays.generaArrayInt(n, min, max);

        arrays.escribeArray(num);

        arrays.escribeArray(arrays.volteaArrayInt(num));
        sc.close();
    }
}
