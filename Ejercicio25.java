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
        int[] num = new int [n];

        for(int i = 0; i<num.length;i++){
            System.out.print("Dime un número para el array: ");
            num [i] = sc.nextInt();
        }

        System.out.print("Dime el número que quieres saber si está en el array o no: ");
        int n2 = sc.nextInt();

        System.out.print("El número " + n2 + " está en la posición: " + arrays.posicionEnArray(num,n2));

        sc.close();
    }
}
