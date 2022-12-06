/**
 * 25  posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.

 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio25 {
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

        System.out.print("Dime el número que quieres saber su posición: ");
        int n2 = sc.nextInt();

        System.out.print("El número " + n2 + " está en la posición: " + arrays.posicionEnArray(num,n2));

        sc.close();
    }
}
