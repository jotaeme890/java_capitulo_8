/**
 * 47 Esta función toma como parámetro un array que contiene números y devuelve
 * una cadena de caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) 
 * devuelve “”; si a = { 8 }, convierteArrayEnString(a)
 * devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
 * “62501”.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la longitud del array: ");
        int longitud1 = sc.nextInt();
        int array[] = new int [longitud1];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Dime un número para el array: ");
            array[i] = sc.nextInt();
        }

        System.out.print("Dicho array en String sería: " +  convierteArrayEnString(array));
        sc.close();
    }


    public static String convierteArrayEnString(int[] a){
        String numeros = "";
        for (int i = 0; i < a.length; i++) {
            numeros += String.valueOf(a[i]) + " ";
        }
        return numeros;
    }
}
