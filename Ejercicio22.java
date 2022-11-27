/**
 * 22 maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime el tamaño del array: ");
        int n = sc.nextInt();
        int[] num = new int [n];

        for(int i = 0; i<num.length;i++){
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextInt();
        }

        System.out.print("El mínimo de ese array es: " + matematicas.general.arrays.maximoArrayInt(num));

        sc.close();
    }
}
