/**
 * 24  estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio24 {
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

        System.out.print("Dime el número que quieres saber si está en el array o no: ");
        int n2 = sc.nextInt();

        System.out.print(arrays.estaEnArrayInt(num,n2));

        sc.close();
    }
}
