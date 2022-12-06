/**
 * 22 maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio22 {
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

        System.out.print("El máximo de ese array es: " + arrays.maximoArrayInt(num));

        sc.close();
    }
}
