/**
 * 48 Esta función toma dos arrays como parámetros y devuelve un array que es el
 * resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },
 * concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.print("Dime la longitud del array: ");
        int longitud1 = sc.nextInt();
        int array1[] = new int [longitud1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Dime un número para el array: ");
            array1[i] = sc.nextInt();
        }
        System.out.print("Dime la longitud del array: ");
        int longitud2 = sc.nextInt();
        int array2[] = new int [longitud2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Dime un número para el array: ");
            array2[i] = sc.nextInt();
        }

        for (int e : concatena(array1, array2)) {
            System.out.print(e + " ");
        }
        sc.close();
    }


    public static int[] concatena(int[] a, int[] b){
        int [] arrayaux = new int [a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            arrayaux[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            arrayaux[i + a.length] = b[i];
        }
        return arrayaux;
    }
}
