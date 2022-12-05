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
        int[] num = new int [n];
        System.out.print("Dime las veces que lo quieres rotar a la derecha: ");
        int n2 = sc.nextInt();

        for(int i = 0; i<num.length;i++){
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextInt();
        }

        arrays.escribeArray(arrays.rotaDerechaArrayInt(num,n2));
        sc.close();
    }
}
