/**
 * 23  mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime el tamaño del array: ");
        int n = sc.nextInt();
        double[] num = new double [n];

        for(int i = 0; i<num.length;i++){
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextDouble();
        }

        System.out.print("La media de ese array es: " + matematicas.general.arrays.mediaArrayInt(num));

        sc.close();
    }
}
