/**
 * 30  filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio30 {
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
        System.out.print("Dime la fila que quieres ver: ");
        int fila = sc.nextInt();

        int[][] num = arrayBi.generaArrayBiInt(n, n2,min, max);

        arrayBi.escribeArrayBi(arrayBi.filaDeArrayBiInt(num, fila));

        sc.close();
    }
}