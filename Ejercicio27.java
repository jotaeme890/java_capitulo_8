/**
 * 27 rotaDerechaArrayInt: Rota n posiciones a la derecha los números de unarray.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio27 {
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

        System.out.print("Dime las veces que lo quieres rotar a la derecha: ");
        int n2 = sc.nextInt();

        arrays.escribeArray(arrays.rotaDerechaArrayInt(num,n2));
        sc.close();
    }
}
