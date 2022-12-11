/**
 * 33 esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.*;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime el mínimo del intervalo: ");
        int min = sc.nextInt();
        System.out.print("Dime el máximo del intervalo: ");
        int max = sc.nextInt();

        int[][] num = arrayBi.generaArrayBiInt(5, 5,min, max);

        arrayBi.escribeArrayBi(num);

        System.out.print("Dime la fila: ");
        int fila = sc.nextInt();
        System.out.print("Dime la columna: ");
        int columna = sc.nextInt();
        
        if(arrayBi.esPuntoDeSilla(num, fila, columna)){
            System.out.println("Esa posición es punto de silla");
        }else{
            System.out.println("Esa posición no es punto de silla");
        }

        sc.close();
    }
}
