/**
 * 31  columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime el tamaño de la fila del array: ");
        int n = sc.nextInt();
        System.out.print("Dime el tamaño de la columna del array: ");
        int n2 = sc.nextInt();
        System.out.print("Dime el mínimo del intervalo: ");
        int min = sc.nextInt();
        System.out.print("Dime el máximo del intervalo: ");
        int max = sc.nextInt();

        int[][] num = arrayBi.generaArrayBiInt(n, n2,min, max);
        arrayBi.escribeArrayBi(num);

        System.out.print("Dime la columna que quieres ver: ");
        int fila = sc.nextInt();

        arrays.escribeArray(arrayBi.columnaDeArrayBiInt(num, fila));

        sc.close();
    }
}