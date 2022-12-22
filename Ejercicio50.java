/**
 * 50 Esta función toma dos arrays como parámetros y devuelve un array que es
 * el resultado de mezclar los números de ambos de forma alterna, se coge un
 * número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
 * longitudes diferentes; por tanto, si se terminan los números de un array se
 * terminan de coger todos los que quedan del otro.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio50 {
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

        for (int e : mezcla(array1, array2)) {
            System.out.print(e + " ");
        }
        sc.close();
    }


    public static int[] mezcla(int[] a, int[] b){
        int A = a.length;
        int B = b.length;
        int longitud = (a.length + b.length);
        int [] array = new int [longitud];

        for (int i = 0; i < longitud; i++) {
            if(i%2==0 && A>=0 || i==0 && A>=1){
                array[i] = a[i/2];
                A--;
            }
            if(i%2!=0 && B>=0){
                array[i] = b[i/2];
                B--;
            }
        }
        return array;
    }
}
