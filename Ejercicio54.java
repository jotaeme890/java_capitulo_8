/**
 * 54 La función ocurrencias devuelve el número de veces que aparece un dígito
 * dentro de un número (primera función) o bien el número de veces que aparece
 * un dígito en una serie de números contenidos en un array (segunda función).
 * 
 * @author jotaeme
 */

import matematicas.general.varias;
import matematicas.general.arrays;
import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        int numero = sc.nextInt();
        System.out.print("Dime que número quieres ver: ");
        int digito = sc.nextInt();
        System.out.print("El número de veces que aparece es: " + ocurrencias(digito, numero));

        System.out.println();

        System.out.print("Dime cuanto mide el array: ");
        int n = sc.nextInt();
        System.out.print("Dime el mínimo: ");
        int min = sc.nextInt();
        System.out.print("Dime el máximo: ");
        int max= sc.nextInt();

        int[] num = arrays.generaArrayInt(n, min, max);
        arrays.escribeArray(num);

        System.out.print("Dime el número que quieres saber cuantas veces aparece: ");
        int digitos= sc.nextInt();

        System.out.print(ocurrencias(digitos,num));
        sc.close();
    }

    public static int ocurrencias(int digito, int n){
        int contador = 0;
        for (int i = 0; i < varias.digitos(n); i++) {
            if(digito == varias.digitoN(n,i)){
                contador++;
            }
        }
        return contador;
    }

    public static int ocurrencias(int digito, int[] a){
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == digito){
                contador++;
            }
        }
        return contador;
    }

}
