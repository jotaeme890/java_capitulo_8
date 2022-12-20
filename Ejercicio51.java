/**
 * 51 Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por pantalla. A
 * continuación, el programa indicará para cada uno de ellos si es un número
 * primo y/o un capicúa de la forma que muestra el ejemplo.
 * 
 * @author jotaeme
 */

import matematicas.general.arrays;
import matematicas.general.varias;

public class Ejercicio51 {
    public static void main(String[] args) {
        int[] a = arrays.generaArrayInt(10, 2, 100);
        System.out.println("Array:");
        arrays.escribeArray(a);
        System.out.println();
        for (int i = 0; i<a.length ;i++) {
            if (varias.esPrimo(a[i])) {
                System.out.print("El " + a[i] + " es primo");
            } else {
                System.out.print("El " + a[i] + " no es primo");
            }
            if (varias.esCapicuo(a[i])) {
                System.out.println(" y es capicúa.");
            } else {
                System.out.println(" y no es capicúa.");
            }
        }
    }
}
